package com.example.rest_api.REST;

import com.example.rest_api.domain.Department;
import com.example.rest_api.domain.DepartmentDTO;
import com.example.rest_api.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    private final DepartmentService ds;

    @Autowired
    public DepartmentController(DepartmentService ds){
        this.ds = ds;
    }

    @GetMapping("/department")
    public ResponseEntity<List<Department>> getAllDepartment(@RequestParam String id) {
        return new ResponseEntity<List<Department>>(ds.getAllDepartment(), HttpStatus.OK);
    }

    @GetMapping("/department/{id}")
    public ResponseEntity<DepartmentDTO> getDepartmentById(@PathVariable String id) {
        return new ResponseEntity<DepartmentDTO>(ds.getDepartmentById(id), HttpStatus.OK);
    }

    @PostMapping("/employee")
    public ResponseEntity<?> createDepartment(@RequestBody Department d) {
        return new ResponseEntity<Object>(ds.save(d), HttpStatus.OK);
    }

    @ExceptionHandler (Exception.class)
    public ResponseEntity<?> errorResponse(){
        return null;
    }
}


