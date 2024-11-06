package com.Employee.Employee_API.exceptions;

public class EmployeeNotFoundException extends RuntimeException{

    private static final String DEFAULT_MESSAGE = "Employee not found.";

    public EmployeeNotFoundException() {
        super(DEFAULT_MESSAGE);
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
