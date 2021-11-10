package com.example.rest_api.Repository;

import com.example.rest_api.Exception.errorResponse;
import com.example.rest_api.domain.Department;
import com.example.rest_api.domain.Employee;
import com.example.rest_api.domain.EmployeeDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeRepositoryImp1 implements EmployeeRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> list = em.createQuery("select e from Employee e join fetch Department d").getResultList();
        return list;
    }

    @Override
    public EmployeeDTO getEmployeeById(String id) {
        Employee e = (Employee)em.createQuery("select e from Employee e where e.id = 'id'").getSingleResult();
        return new EmployeeDTO(e);
    }

    @Override
    public boolean save(Employee e) {
        try{
            em.createQuery("UPDATE Employee e SET e.fname = :fname, e.gender = :gender, e.lname = :lname, e.id = :id");
            return true;
        } catch (Exception ex){
            new errorResponse("Create failed");
            return false;
        }
    }
}
