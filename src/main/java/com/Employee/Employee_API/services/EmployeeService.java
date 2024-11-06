package com.Employee.Employee_API.services;

import com.Employee.Employee_API.DTOs.EmployeeDto.EmployeeDTO;
import com.Employee.Employee_API.DTOs.EmployeeDto.EmployeeResponseDTO;
import com.Employee.Employee_API.entities.Employee;
import com.Employee.Employee_API.exceptions.EmployeeNotFoundException;
import com.Employee.Employee_API.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeResponseDTO> findAll(){
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .map(employee -> modelMapper.map(employee, EmployeeResponseDTO.class))
                .toList();
    }

    public EmployeeResponseDTO create(EmployeeDTO employeeDTO){
        Employee employee = modelMapper.map(employeeDTO, Employee.class);
        employee = employeeRepository.save(employee);
        return modelMapper.map(employee, EmployeeResponseDTO.class);
    }

    public Optional<EmployeeResponseDTO> getById(UUID uuid){
        Employee employee = employeeRepository.findById(uuid).orElseThrow(EmployeeNotFoundException::new);
        return Optional.of(modelMapper.map(employee, EmployeeResponseDTO.class));
    }

    public EmployeeResponseDTO updateEmployee(UUID uuid, EmployeeDTO employeeDTO){
        Employee employee = employeeRepository.findById(uuid)
                .orElseThrow(EmployeeNotFoundException::new);
        modelMapper.map(employeeDTO, employee);
        employee = employeeRepository.save(employee);
        return modelMapper.map(employee, EmployeeResponseDTO.class);
    }

    public void delete(UUID uuid){
        Employee employeeResponseDTO = this.employeeRepository.findById(uuid)
                .orElseThrow(EmployeeNotFoundException::new);
        this.employeeRepository.delete(employeeResponseDTO);
    }
}
