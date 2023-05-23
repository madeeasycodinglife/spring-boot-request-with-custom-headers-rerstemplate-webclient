/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.madeasy.controller;

import com.madeasy.entity.Department;
import com.madeasy.service.DepartmentService;

import java.util.Enumeration;
import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author PABITRA
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/all-departments")
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/id/{id}")
    public Department findByDepartmentId(@PathVariable("id") Integer id, HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        System.out.println("form  department controller");
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            System.out.println("header name :: " + name + " value :: " + request.getHeader(name));
        }
        return departmentService.findByDepartmentId(id);
    }

    @GetMapping("/name/{name}")
    public Department findByDepartmentName(@PathVariable("name") String name) {
        return departmentService.findByDepartmentIdName(name);
    }

    @GetMapping("/type/{type}")
    public Department findByDepartmentType(@PathVariable("type") String type) {
        return departmentService.findByDepartmentType(type);
    }

    @GetMapping("/name/{name}/type/{type}")
    public Department findByDepartmentNameAndType(@PathVariable("name") String name,
                                                  @PathVariable("type") String type) {
        return departmentService.findByDepartmentNameAndType(name, type);
    }

}
