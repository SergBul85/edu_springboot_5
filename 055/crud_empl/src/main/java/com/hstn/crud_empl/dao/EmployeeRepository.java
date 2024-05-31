package com.hstn.crud_empl.dao;

import com.hstn.crud_empl.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(path = "empls")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
