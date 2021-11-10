package com.example.rest_api.Service;

import com.example.rest_api.Exception.errorResponse;
import com.example.rest_api.Repository.DepartmentRepository;
import com.example.rest_api.domain.Department;
import com.example.rest_api.domain.DepartmentDTO;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartment();
    DepartmentDTO getDepartmentById(String id);
    boolean save(Department d) throws errorResponse;
}
