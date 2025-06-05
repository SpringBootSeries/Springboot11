package com.backend.Backend.model;

import jakarta.persistence.*;

import java.util.List;

public class Project {
    @Id
    private String projectId;

    @Column(name="Project_Name")
    private String name;

    private long totalCost;

    @ManyToMany
    @JoinTable(name="project_assignments",
            joinColumns = @JoinColumn(name="empid"),
            inverseJoinColumns = @JoinColumn(name="pro_id"))
    private List<Employee> employees;

    public Project() {
        super();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(long totalCost) {
        this.totalCost = totalCost;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
