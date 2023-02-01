package com.example.mybatis_crud.repository;

import com.example.mybatis_crud.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeRepository {
    List<Employee> findAll();

    Employee getEmployee(Long id);

    List<Employee> findAllByFilter(Map<String, Object> map);

    int saveEmployee(Employee employee);

    int updateEmployee(Map<String, Object> map);
//    int updateEmployee(Employee employee);

    void deleteEmployee(Long id);
}
