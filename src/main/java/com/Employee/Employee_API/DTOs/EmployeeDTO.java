package com.Employee.Employee_API.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeDTO {
    @NotBlank(message = "Employee name is required")
    private String name;
    @Email(message = "Not a valid email")
    @NotBlank(message = "Employee email is required")
    private String email;
    @NotBlank(message = "Employee job is required")
    private String job;
    @NotBlank
    @NotNull
    private Float salary;

    public @NotBlank(message = "Employee name is required") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Employee name is required") String name) {
        this.name = name;
    }

    public @Email(message = "Not a valid email") @NotBlank(message = "Employee email is required") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "Not a valid email") @NotBlank(message = "Employee email is required") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Employee job is required") String getJob() {
        return job;
    }

    public void setJob(@NotBlank(message = "Employee job is required") String job) {
        this.job = job;
    }

    public @NotBlank @NotNull Float getSalary() {
        return salary;
    }

    public void setSalary(@NotBlank @NotNull Float salary) {
        this.salary = salary;
    }
}
