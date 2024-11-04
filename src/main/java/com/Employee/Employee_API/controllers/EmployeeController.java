package com.Employee.Employee_API.controllers;

import com.Employee.Employee_API.DTOs.EmployeeDTO;
import com.Employee.Employee_API.entities.Employee;
import com.Employee.Employee_API.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> findAll(){
        List<EmployeeDTO> employees = employeeService.findAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> insertEmployee(@RequestBody EmployeeDTO employeeDTO){
        EmployeeDTO newEmployeeDto = employeeService.create(employeeDTO);
        return ResponseEntity.ok(newEmployeeDto);
    }
}
