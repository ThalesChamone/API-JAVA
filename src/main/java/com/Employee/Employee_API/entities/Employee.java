package com.Employee.Employee_API.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "employess")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String name;
    private String email;
    private String job;
    private Float salary;

    public Employee(){

    }

    public Employee(UUID uuid, String name, String email, String job, Float salary) {
        this.uuid = uuid;
        this.name = name;
        this.email = email;
        this.job = job;
        this.salary = salary;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
