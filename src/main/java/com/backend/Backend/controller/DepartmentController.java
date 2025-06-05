package com.backend.Backend.controller;

import com.backend.Backend.model.Department;
import com.backend.Backend.model.ViewDepartment;
import com.backend.Backend.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    public DepartmentService service;

    @GetMapping("/")
    public ResponseEntity<List<Department>> getDepts(){
        return new ResponseEntity<List<Department>>(service.getDeps(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDeptwithId(@PathVariable String id){
        if(service.getDepwithId(id)==null) {
            return new ResponseEntity<Department>(service.getDepwithId(id),HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Department>(service.getDepwithId(id),HttpStatus.OK);
    }


    @PostMapping("/")
    public String addDep(@RequestBody Department department){
        return new String(service.addDep(department));
    }

    @DeleteMapping("/{id}")
    public String deleteDep(@PathVariable("id") String id){
        return new String(service.deleteDep(id));
    }

    @PutMapping("/{id}")
    public String updateDep(@PathVariable("id") String id,@RequestBody Department department){
        return new String(service.updateDep(id,department));
    }

    @GetMapping("/names")
    public ResponseEntity<List<String>> getDepartmentNames(){
        return new ResponseEntity<List<String>>(service.getDepartmentNames(),HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Department>> searchName(@PathVariable("name") String name){
        return new ResponseEntity<List<Department>>(service.searchName(name),HttpStatus.OK);
    }

    @GetMapping("/empCount/{depid}")
    public ResponseEntity<Integer> empCount(@PathVariable("depid") String depid){
        return new ResponseEntity<Integer>(service.empCount(depid), HttpStatus.OK);
    }

    @GetMapping("/empCountByView/{depid}")
    public ResponseEntity<ViewDepartment> empCountFromView(@PathVariable("depid") String depid){
        return new ResponseEntity<ViewDepartment>(service.empCountFromView(depid),HttpStatus.OK);
    }


}
