package com.example.rest_api.domain;

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