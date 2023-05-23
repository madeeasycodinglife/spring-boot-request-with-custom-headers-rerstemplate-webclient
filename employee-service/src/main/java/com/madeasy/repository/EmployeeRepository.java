/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.madeasy.repository;

import com.madeasy.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author PABITRA
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public Employee findByName(String name);

    public Employee findByAge(Integer age);

    @Query(value = "select * from Employee where name = ?1 and age = ?2",
            nativeQuery = true)
    public Employee findByEmployeeNameAndAge(String name, Integer age);
}
