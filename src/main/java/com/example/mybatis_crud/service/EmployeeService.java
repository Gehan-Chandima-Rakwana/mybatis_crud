package com.example.mybatis_crud.service;

import com.example.mybatis_crud.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> findAll();
    
    Employee getEmployee(Long id);

    List<Employee> findAllByFilter();

    int saveEmployee(Employee employee);

    int updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}
