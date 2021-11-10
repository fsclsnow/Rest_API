package com.example.rest_api.Domain;

import com.example.rest_api.Domain.Entity.Employee;
import lombok.Data;

@Data
public class EmployeeDTO{
    private String id;
    private String fname;
    private String lname;
    private String gender;

    public EmployeeDTO(Employee e) {
        this.id = e.getId();
        this.fname = e.getFname();
        this.lname = e.getLname();
        this.gender = e.getGender();
    }
}