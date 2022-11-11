package com.employee.Employeemodel.service;

import com.employee.Employeemodel.entity.Employee;
import com.employee.Employeemodel.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmp(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> saveEmps(List<Employee> employees) {
        return repository.saveAll(employees);
    }

    public Employee getEmployeeById(int id) {
        return repository.findById(id);
    }
        public Employee getEmployeeByName(String name) {
        return repository.findByName(name);
    }

    public List<Employee> getEmployee() {
        return repository.findAll();
    }
    public String deleteById(int id) {
       repository.deleteById(id);
//        if (id != null) {
//            return "record deleted using the ID..." + id;
//        }
//        if (id == null) {
//            return "Selected id " + id + " is not found";
//        }
        return "record deleted using the ID..." + id;
    }


    public String deleteByName(String name) {
        System.out.println(name);
        Employee emp = repository.findByName(name);
        repository.delete(emp);
//        repository.deleteByName(name);
        return "Record deleted using the Name..."+name;
    }

    public Employee updateEmployee(Employee emp) {
        Employee existingEmployee = repository.findById(emp.getId());
        existingEmployee.setName(emp.getName());
        existingEmployee.setDesignation(emp.getDesignation());
        existingEmployee.setSalary(emp.getSalary());
        return repository.save(existingEmployee);
    }

    public Employee updateEmployeebyName(Employee employee, String name) {
        Employee existingemp = repository.findByName(name);
        existingemp.setName(employee.getName());
        existingemp.setDesignation(employee.getDesignation());
        existingemp.setSalary(employee.getSalary());
        return repository.save(existingemp);
    }
    public Employee updateEmployeebyId(Employee employee, int id) {
        Employee existemp = repository.findById(id);
        existemp.setName(employee.getName());
        existemp.setDesignation(employee.getDesignation());
        existemp.setSalary(employee.getSalary());
        return repository.save(existemp);
    }

}