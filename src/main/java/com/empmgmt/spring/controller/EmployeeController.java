package com.empmgmt.spring.controller;

import com.empmgmt.spring.model.Employee;
import com.empmgmt.spring.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/")
    public String viewHomePage(Model model)
    {
        model.addAttribute("listEmployees",employeeService.getAllEmployees());
        return "index";
    }

    @GetMapping("/add")
    public String addEmployee(Model model)
    {
        model.addAttribute("listEmployees",employeeService.getAllEmployees());
        return "index";
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model)
    {

        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "NewEmployee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee)
    {
        employeeService.saveEmployee(employee);

        return "redirect:/";
    }


    

}
