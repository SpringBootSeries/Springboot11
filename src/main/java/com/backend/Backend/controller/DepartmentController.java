package com.backend.Backend.controller;

import com.backend.Backend.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    @GetMapping("/")
    public ResponseEntity<List<Department>> getDepts(){
        return new ResponseEntity<List<Depart
    }

}
