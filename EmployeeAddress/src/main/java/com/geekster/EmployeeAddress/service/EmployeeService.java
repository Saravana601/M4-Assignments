package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepository iEmployeeRepository;

    // Add Employee
    public String addEmployee(Employee employee) {
        iEmployeeRepository.save(employee);
        return "Employee added";
    }

    // Get Employee By I'd
    public Employee getEmployeeById(Long employeeId) {
        return iEmployeeRepository.findById(employeeId)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found"));
    }

    // Get All Employees
    public List<Employee> getAllEmployee() {
        return iEmployeeRepository.findAll();
    }

    // Update Employee by I'd
    public String updateEmployee(Long employeeId, Employee employee) {
        Employee existingEmployee = iEmployeeRepository.findById(employeeId)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found"));

        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setAddress(employee.getAddress());

        iEmployeeRepository.save(existingEmployee);

        return "Employee updated";
    }

    // Delete Employee by I'd
    public String deleteEmployee(Long employeeId) {
        iEmployeeRepository.deleteById(employeeId);
        return "Employee deleted";
    }
}
