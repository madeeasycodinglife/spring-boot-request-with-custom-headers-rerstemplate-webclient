package com.madeasy.response;

import com.madeasy.entity.Department;
import com.madeasy.entity.Employee;
import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Component
public class EmployeeWithDepartment {
    private Department department;
    private Employee employee;
}
