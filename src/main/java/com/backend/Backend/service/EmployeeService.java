package com.backend.Backend.service;

import com.backend.Backend.model.Employee;
import com.backend.Backend.repo.EmployeeRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;

    public List<Employee> getEmp(){
        return repo.findAll();
    }

    public Employee getEmpwithId(String id ) {
        if(repo.findById(id).isEmpty()) {
            throw new EntityNotFoundException("Employee Not Found");
        }
        return repo.findById(id).get();
    }

    public String addEmp(Employee employee) {
        repo.save(employee);
        return "New Employee Added";
    }

    public String deleteEmp(String id) {
        if(!repo.findById(id).isEmpty()) {
            repo.deleteById(id);
            return "Employee removed";
        }
        return null;

    }

    public String updateEmp(String id, Employee employee) {
        if(!repo.findById(id).isEmpty()) {
            repo.save(employee);
            return "Employee updated";
        }
        return null;
    }

    public List<Employee> searchBySalary(int min, int max) {
        if(repo.searchEmpbySalRange(min,max).isEmpty()) {
            throw new EntityNotFoundException("Employee Not Found");
        }
        return repo.searchEmpbySalRange(min,max);
    }

    public List<Employee> searchEmpsByDep(String depId) {
        if(repo.searchByDep(depId).isEmpty()) {
            throw new EntityNotFoundException("Employee Not Found");
        }
        return repo.searchByDep(depId);
    }

    public List<Employee> findYoungest(){
        if(repo.youngestEmp().isEmpty()) {
            throw new EntityNotFoundException("Employee Not Found");
        }
        return repo.youngestEmp();
    }
}
