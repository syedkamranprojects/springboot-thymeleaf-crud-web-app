package com.empmgmt.spring.repository;

import com.empmgmt.spring.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employee,Long> {

        
    
}
