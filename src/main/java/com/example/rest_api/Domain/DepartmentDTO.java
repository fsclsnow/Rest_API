package com.example.rest_api.Domain;

import com.example.rest_api.Domain.Entity.Department;
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