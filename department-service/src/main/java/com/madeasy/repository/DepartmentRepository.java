/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.madeasy.repository;

import com.madeasy.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PABITRA
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
    
    public Department findByName(String name);
    public Department findByType(String type);
    
    @Query(value = "select * from Department where name = ?1 and type = ?2",
            nativeQuery = true)
    public Department findByDepartmentNameAndType(String name,String type);
}
