package com.example.rest_api.REST;

import com.example.rest_api.domain.Employee;
import com.example.rest_api.Service.EmployeeServiceImp;
import com.example.rest_api.domain.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeServiceImp es;

    @Autowired
    public EmployeeController(EmployeeServiceImp es) {
        this.es = es;
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployee(@RequestParam String id){
        return new ResponsEntitiy<>(es.getAllEmployee(), HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<List<EmployeeDTO>> getEmployeeById(@PathVariable String id){
        return new ResponsEntitiy<>(es.getEmployeeById(id), HttpStatus.OK);
    }

    @PostMapping("/employee")
    public ResponseEntity<List<EmployeeDTO>> createEmployee(@RequestBody Employee e){
        return new ResponsEntitiy<>(es.save(e), HttpStatus.OK);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> errorResponse() {
        return null;
    }
}

