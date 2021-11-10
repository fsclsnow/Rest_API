package com.example.rest_api.Repository;

import com.example.rest_api.Exception.ExceptionHandler;
import com.example.rest_api.domain.Employee;
import com.example.rest_api.domain.EmployeeDTO;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployee();
    EmployeeDTO getEmployeeById(String id);
    boolean save(Employee e);
}
