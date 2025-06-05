package com.backend.Backend.service;

import com.backend.Backend.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired

    public List<Department> getDepts(){
        return repo.findall();

    }
}
