package com.example.dailycodeb.controller;

import com.example.dailycodeb.entity.Department;
import com.example.dailycodeb.exceptions.DepartmentNotFoundException;
import com.example.dailycodeb.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //private final Logger logger = LoggerFactory.getLogger(DepartmentController.class)
    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        //log.info("Inside saveDepartment of DepartmentController");

             return departmentService.saveDepartment(department);
    }


    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {

        return departmentService.fetchDepartmentList();
    }


    @GetMapping("/departments/{id}") //This is called @Pathvariable because I specifically picked a path I want
    // it to give me which in this case is the {id}

    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        LOGGER.info("Inside fetchDepartmentById of DepartmentController");
        return departmentService.fetchDepartmentById(departmentId);
    }


    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department has been successfully deleted!!!! yay!";
    }

@PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
            return departmentService.fetchDepartmentByName(departmentName);

    }

}
