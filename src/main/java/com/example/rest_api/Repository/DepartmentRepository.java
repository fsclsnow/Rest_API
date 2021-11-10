package com.example.rest_api.Repository;

import com.example.rest_api.Domain.Entity.Department;
import com.example.rest_api.Domain.DepartmentDTO;

import java.util.List;

public interface DepartmentRepository {
    List<DepartmentDTO> getAllDepartment();
    DepartmentDTO getDepartmentById(String id);
    String save(Department d);
}


