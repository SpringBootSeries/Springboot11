package com.backend.Backend.model;

import java.util.Date;

public class ViewDepartment extends Department {
    private int empcount;


    public ViewDepartment() {

    }

    public ViewDepartment(String id, String depName, Date established, int empcount) {
        super(id, depName, established);
        this.empcount = empcount;
    }

    public int getEmpcount() {
        return empcount;
    }

    public void setEmpcount(int empcount) {
        this.empcount = empcount;
    }

}
