package com.example.rest_api.Repository;

import com.example.rest_api.Exception.ExceptionHandler;
import com.example.rest_api.domain.Department;
import com.example.rest_api.domain.DepartmentDTO;

import java.util.List;

public interface DepartmentRepository {
    List<Department> getAllDepartment();
    DepartmentDTO getDepartmentById(String id);
    boolean save(Department d);
}


