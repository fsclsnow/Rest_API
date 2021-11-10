package com.example.rest_api.Service;

import com.example.rest_api.Exception.errorResponse;
import com.example.rest_api.Repository.DepartmentRepository;
import com.example.rest_api.domain.Department;
import com.example.rest_api.domain.DepartmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Service
public class DepartmentServiceImp implements DepartmentService{
    private final DepartmentRepository dr;

    @Autowired
    public DepartmentServiceImp(DepartmentRepository dr) {
        this.dr = dr;
    }

    @Override
    public List<DepartmentDTO> getAllDepartment() {
        return dr.getAllDepartment();
    }

    @Override
    public DepartmentDTO getDepartmentById(String id) {
        return null;
    }

    @Override
    public boolean save(Department d) throws errorResponse {
        return dr.save(d);
    }
}

