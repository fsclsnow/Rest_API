package com.example.rest_api.Repository;

import com.example.rest_api.Exception.errorResponse;
import com.example.rest_api.Domain.Entity.Department;
import com.example.rest_api.Domain.DepartmentDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepositoryImp1 implements DepartmentRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<DepartmentDTO> getAllDepartment() {
        List<Department> list = em.createQuery("select d from Department d join fetch Employee e on e.department_id = d.id ").getResultList();
        List<DepartmentDTO> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            res.set(i, new DepartmentDTO((list.get(i))));
        }
        return res;
    }

    @Override
    public DepartmentDTO getDepartmentById(String id) {
        Department d = (Department) em.createQuery("select d from Department d where d.id = 'id' ").getSingleResult();
        return new DepartmentDTO(d);
    }

    @Override
    public String save(Department d) {
        try {
            em.createQuery("UPDATE Department d SET d.name = :name, d.id = :id ");
            return d.getId();
        } catch (Exception e){
            new errorResponse("Create failed");
            return "";
        }
    }
}
