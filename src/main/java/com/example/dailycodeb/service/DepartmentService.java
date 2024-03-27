package com.example.dailycodeb.service;

import com.example.dailycodeb.entity.Department;
import com.example.dailycodeb.exceptions.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
   Department saveDepartment(Department department);
   List<Department> fetchDepartmentList();
   Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   void deleteDepartmentById(Long departmentId);

   Department updateDepartment(Long departmentId, Department department);

   Department fetchDepartmentByName(String departmentName);
}
