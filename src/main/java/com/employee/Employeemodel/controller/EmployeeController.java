package com.employee.Employeemodel.controller;

import com.employee.Employeemodel.entity.Employee;
import com.employee.Employeemodel.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/post")
    public Employee addEmployee(@RequestBody Employee emp) {
        System.out.println("entered");
        return service.saveEmp(emp);
    }

    @PostMapping("/postall")
    public List<Employee> addAllEmployee(@RequestBody List<Employee> emps){
        return service.saveEmps(emps);
    }

    @GetMapping("/getall")
    public List<Employee> findAllEmployee() {
        return service.getEmployee();
    }

    @GetMapping("/getbyid/{id}")
    public Employee findEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @GetMapping("/getbyname/{name}")
    public Employee findEmployeeByName(@PathVariable String name) {
        return service.getEmployeeByName(name);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee emp) {
        return service.updateEmployee(emp);
    }

    @PutMapping("/updatebyname/{name}")
    public Employee updateEmployeeByName(@RequestBody Employee emp, @PathVariable String name) {
        return service.updateEmployeebyName(emp,name);
    }

    @PutMapping("/updatebyid/{id}")
    public Employee updateEmployeeById(@RequestBody Employee emp, @PathVariable int id) {
        return service.updateEmployeebyId(emp,id);
    }

    @DeleteMapping("/deletebyid/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteById(id);
    }

    @DeleteMapping("/deletebyname/{name}")
    public String deleteByName(@PathVariable String name) {
        return service.deleteByName(name);
    }
}

