package com.empmgmt.spring.service;

import java.util.List;

import com.empmgmt.spring.model.Employee;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
    
}
