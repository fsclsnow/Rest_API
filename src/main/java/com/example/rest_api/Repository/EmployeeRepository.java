package com.example.rest_api.Repository;

import com.example.rest_api.Domain.Entity.Employee;
import com.example.rest_api.Domain.EmployeeDTO;

import java.util.List;

public interface EmployeeRepository {
    List<EmployeeDTO> getAllEmployee();
    EmployeeDTO getEmployeeById(String id);
    String save(Employee e);
}
