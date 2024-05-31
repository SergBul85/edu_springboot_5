package com.hstn.crud_empl.dao;

import com.hstn.crud_empl.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findEmployeeById(int id);

    Employee save(Employee employees);

    void deleteEmployeeById(int id);

}
