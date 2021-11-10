package com.example.rest_api.Repository;

import com.example.rest_api.Exception.ExceptionHandler;
import com.example.rest_api.domain.Department;
import com.example.rest_api.domain.DepartmentDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DepartmentRepositoryImp1 implements DepartmentRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Department> getAllDepartment() {
        List<Department> list = em.createQuery("select d from Department d join fetch Employee e").getResultList();
        return list;
    }

    @Override
    public DepartmentDTO getDepartmentById(String id) {
        Department d = (Department) em.createQuery("select d from Department d where d.id = 'id' ").getSingleResult();
        return new DepartmentDTO(d);
    }

    @Override
    public boolean save(Department d) {
        try {
            em.createQuery("UPDATE Department d SET d.name = :name, d.id = :id ");
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
