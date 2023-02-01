package com.example.mybatis_crud.controller;

import com.example.mybatis_crud.model.Employee;
import com.example.mybatis_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employee")
public class EmployeeController {

    @Autowired
    private  EmployeeService employeeService;

    @GetMapping
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable("id") Long id){
        return employeeService.getEmployee(id);
    }

    @PostMapping
    public int saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public int updateEmployee(@PathVariable("id") Long id,@RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteEmployee(@PathVariable("id") Long id){
         employeeService.deleteEmployee(id);
    }
}
