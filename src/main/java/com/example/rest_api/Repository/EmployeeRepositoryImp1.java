package com.example.rest_api.Repository;

import com.example.rest_api.Exception.errorResponse;
import com.example.rest_api.Domain.Entity.Employee;
import com.example.rest_api.Domain.EmployeeDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImp1 implements EmployeeRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<EmployeeDTO> getAllEmployee() {
        List<Employee> list = em.createQuery("select e from Employee e join fetch Department d").getResultList();
        List<EmployeeDTO> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            res.set(i, new EmployeeDTO((list.get(i))));
        }
        return res;
    }

    @Override
    public EmployeeDTO getEmployeeById(String id) {
        Employee e = (Employee)em.createQuery("select e from Employee e where e.id = 'id'").getSingleResult();
        return new EmployeeDTO(e);
    }

    @Override
    public String save(Employee e) {
        try{
            em.createQuery("UPDATE Employee e SET e.fname = :fname, e.gender = :gender, e.lname = :lname, e.id = :id");
            return e.getId();
        } catch (Exception ex){
            new errorResponse("Create failed");
            return "";
        }
    }
}
