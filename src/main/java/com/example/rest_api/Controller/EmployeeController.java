package com.example.rest_api.Controller;

import com.example.rest_api.Domain.Entity.Employee;
import com.example.rest_api.Service.EmployeeServiceImp;
import com.example.rest_api.Domain.EmployeeDTO;
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
    public ResponseEntity<List<EmployeeDTO>> getAllEmployee(@RequestParam String id){
        return new ResponseEntity<>(es.getAllEmployee(), HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable String id){
        return new ResponseEntity<>(es.getEmployeeById(id), HttpStatus.OK);
    }

    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee e) throws com.example.rest_api.Exception.errorResponse {
        return new ResponseEntity<Object>(es.save(e), HttpStatus.OK);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> errorResponse(Exception e) {
        return new ResponseEntity<Object>(errorResponse(e), HttpStatus.BAD_REQUEST);
    }
}

