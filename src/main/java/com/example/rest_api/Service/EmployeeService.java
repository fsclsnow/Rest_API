package com.example.rest_api.Service;

import com.example.rest_api.domain.Employee;
import com.example.rest_api.domain.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    EmployeeDTO getEmployeeById(String id);
    void save(Employee e);
}
