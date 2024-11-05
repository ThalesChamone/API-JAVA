package com.Employee.Employee_API.controllers;

import com.Employee.Employee_API.DTOs.EmployeeDto.EmployeeDTO;
import com.Employee.Employee_API.DTOs.EmployeeDto.EmployeeResponseDTO;
import com.Employee.Employee_API.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDTO>> findAll(){
        List<EmployeeResponseDTO> employees = employeeService.findAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<EmployeeResponseDTO> insertEmployee(@Valid @RequestBody EmployeeDTO employeeDTO){
        EmployeeResponseDTO newEmployeeResponseDto = employeeService.create(employeeDTO);
        return ResponseEntity.ok(newEmployeeResponseDto);
    }

    @GetMapping("{uuid}")
    public ResponseEntity<EmployeeResponseDTO> getById(@PathVariable UUID uuid){
        return employeeService.getById(uuid)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("{uuid}")
    public ResponseEntity<EmployeeResponseDTO> updateEmployee(@PathVariable UUID uuid ,
                                                              @Valid @RequestBody EmployeeDTO employeeDTO){
        EmployeeResponseDTO newEmployeeResponseDTO = employeeService.updateEmployee(uuid,employeeDTO);
        return ResponseEntity.ok(newEmployeeResponseDTO);
    }

    @DeleteMapping("{uuid}")
    public ResponseEntity<EmployeeResponseDTO> delete(@PathVariable UUID uuid){
        this.employeeService.delete(uuid);
        return ResponseEntity.noContent().build();
    }
}
