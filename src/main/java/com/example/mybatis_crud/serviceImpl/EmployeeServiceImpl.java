package com.example.mybatis_crud.serviceImpl;

import com.example.mybatis_crud.model.Employee;
import com.example.mybatis_crud.repository.EmployeeRepository;
import com.example.mybatis_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private  EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepository.getEmployee(id);
    }

    @Override
    public List<Employee> findAllByFilter() {
        HashMap<String,Object> map = new HashMap<>();
        Employee e = new Employee();
        e.setFirstName("Gayan");

        //map.put("id","1");
        map.put("limit", 1);
        return employeeRepository.findAllByFilter(map);
    }

    @Override
    public int saveEmployee(Employee employee) {
        return employeeRepository.saveEmployee(employee);
    }

    @Override
    public int updateEmployee(Long id, Employee employee) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("e", employee);
        map.put("id", id);
        return employeeRepository.updateEmployee(map);

//        Employee chkEmployee = employeeRepository.getEmployee(id);
//        Employee updateEmployee = new Employee();
//        updateEmployee.setId(chkEmployee.getId());
//        updateEmployee.setFirstName(chkEmployee.getFirstName());
//        updateEmployee.setLastName(chkEmployee.getLastName());
//        updateEmployee.setEmailId(chkEmployee.getEmailId());
//        return employeeRepository.updateEmployee(updateEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
         employeeRepository.deleteEmployee(id);
    }


}
