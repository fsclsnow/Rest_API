package com.example.rest_api.Service;

import com.example.rest_api.Exception.errorResponse;
import com.example.rest_api.Domain.Entity.Department;
import com.example.rest_api.Domain.DepartmentDTO;

import java.util.List;

public interface DepartmentService {
    List<DepartmentDTO> getAllDepartment();
    DepartmentDTO getDepartmentById(String id);
    String save(Department d) throws errorResponse;
}
