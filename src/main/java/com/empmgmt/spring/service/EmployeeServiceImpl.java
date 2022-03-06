package com.empmgmt.spring.service;

import java.util.List;

import com.empmgmt.spring.model.Employee;
import com.empmgmt.spring.repository.EmployeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public List<Employee> getAllEmployees() {
       
        return employeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
      
        employeRepository.save(employee);
        
    }
    
}
