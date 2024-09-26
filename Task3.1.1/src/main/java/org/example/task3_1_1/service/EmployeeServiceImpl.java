package org.example.task3_1_1.service;


import org.example.task3_1_1.dao.EmployeeDAO;
import org.example.task3_1_1.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }


    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

//    @Override
//    public void deleteEmployee(Employee id) {
//
//    }

//    @Override
//    @Transactional
//    public void deleteEmployee(int id) {
//        employeeDAO.deleteEmployee(id);
//    }
}
