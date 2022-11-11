package com.employee.Employeemodel.repository;

import com.employee.Employeemodel.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee,Integer> {

    Employee findById(int id);
    Employee findByName(String name);
    Employee deleteByName(String name);



}
