package com.backend.Backend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {
    @Id
    private String empId;
    private double salary;
    private int age;


    @ManyToOne
    private Department department;

    @ManyToMany(mappedBy = "employees")
    private List<Project> projects;

    @OneToOne(mappedBy="employee")
    private Insurance insurance;

    public Employee() {
        super();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
