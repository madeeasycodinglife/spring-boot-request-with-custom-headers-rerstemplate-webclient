/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.madeasy.service;

import com.madeasy.error.DepartmentNotFoundException;
import com.madeasy.entity.Department;
import com.madeasy.repository.DepartmentRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author PABITRA
 */

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    public Department findByDepartmentId(Integer id) throws DepartmentNotFoundException {
        Optional<Department> department = departmentRepository.findById(id);
        if (department.isEmpty()) {
            throw new DepartmentNotFoundException("Department Not Found");
        }
        return department.get();
    }

    public Department findByDepartmentIdName(String name) {
        return departmentRepository.findByName(name);
    }

    public Department findByDepartmentType(String type) {
        return departmentRepository.findByType(type);
    }

    public Department findByDepartmentNameAndType(String name, String type) {
        return departmentRepository.findByDepartmentNameAndType(name, type);
    }
}
