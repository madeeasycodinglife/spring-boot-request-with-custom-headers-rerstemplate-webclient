/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.madeasy.controller;

import com.madeasy.entity.Employee;
import com.madeasy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author PABITRA
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;



    @GetMapping("/all-employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/id/{id}")
    public Employee findByEmployeeId(@PathVariable("id") Integer id) {
        return employeeService.findByEmployeeId(id);
    }

    @GetMapping("/name/{name}")
    public Employee findByEmployeeName(@PathVariable("name") String name) {
        return employeeService.findByEmployeeName(name);
    }

    @GetMapping("/age/{age}")
    public Employee findByEmployeeAge(@PathVariable("age") Integer age) {
        return employeeService.findByEmployeeAge(age);
    }

    @GetMapping("/name/{name}/age/{age}")
    public Employee findByEmployeeNameAndAge(@PathVariable("name") String name,
                                             @PathVariable("age") Integer age) {
        return employeeService.findByEmployeeNameAndAge(name, age);
    }

    @GetMapping("/with/department/using-rest-template/{id}")
    public ResponseEntity<Object> getEmployeeWithDepartmentUsingRestTemplate(@PathVariable("id") Integer id){
        return employeeService.getEmployeeWithDepartmentUsingRestTemplate(id);
    }
    @GetMapping("/with/department/using-web-client/{id}")
    public ResponseEntity<Object> getEmployeeWithDepartmentUsingWebClient(@PathVariable("id") Integer id){
        return employeeService.getEmployeeWithDepartmentUsingWebClient(id);
    }
}
