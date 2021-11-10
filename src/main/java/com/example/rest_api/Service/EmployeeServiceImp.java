package com.example.rest_api.Service;

import com.example.rest_api.Exception.errorResponse;
import com.example.rest_api.Repository.DepartmentRepository;
import com.example.rest_api.Repository.EmployeeRepository;
import com.example.rest_api.domain.DepartmentDTO;
import com.example.rest_api.domain.Employee;
import com.example.rest_api.domain.EmployeeDTO;
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
    public boolean save(Employee e) throws errorResponse {
        return er.save(e);
    }
}



