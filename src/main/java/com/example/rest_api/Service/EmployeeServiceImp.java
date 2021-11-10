package com.example.rest_api.Service;

import com.example.rest_api.Exception.errorResponse;
import com.example.rest_api.Repository.EmployeeRepository;
import com.example.rest_api.Domain.Entity.Employee;
import com.example.rest_api.Domain.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{
    private final EmployeeRepository er;

    @Autowired
    public EmployeeServiceImp(EmployeeRepository er) {
        this.er = er;
    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {
        return er.getAllEmployee();
    }

    @Override
    public EmployeeDTO getEmployeeById(String id) {
        return er.getEmployeeById(id);
    }

    @Override
    public String save(Employee e) throws errorResponse {
        return er.save(e);
    }
}



