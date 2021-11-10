package com.example.rest_api.Repository;

import com.example.rest_api.domain.Department;
import com.example.rest_api.domain.DepartmentDTO;

import java.util.List;

public interface DepartmentRepository {
    List<Department> getAllDepartment();
    DepartmentDTO getDeparmentById(String id);

}


