package com.example.rest_api.domain;


import lombok.Data;

@Data
public class DepartmentDTO {
    private String id;
    private String name;

    public DepartmentDTO(Department d) {
        this.id = d.getId();
        this.name = d.getName();
    }

}