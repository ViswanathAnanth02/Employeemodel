package com.employee.Employeemodel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Employee_Details")
public class Employee {

    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String designation;
    public double salary;

}
