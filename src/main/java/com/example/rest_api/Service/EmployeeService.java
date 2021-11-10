package com.example.rest_api.Service;

import com.example.rest_api.Exception.errorResponse;
import com.example.rest_api.Domain.Entity.Employee;
import com.example.rest_api.Domain.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> getAllEmployee();
    EmployeeDTO getEmployeeById(String id);
    String save(Employee e) throws errorResponse;
}
