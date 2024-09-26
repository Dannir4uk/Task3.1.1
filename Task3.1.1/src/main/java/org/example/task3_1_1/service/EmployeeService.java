package org.example.task3_1_1.service;



import org.example.task3_1_1.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee (int id);

//    public void deleteEmployee (Employee id);
}
