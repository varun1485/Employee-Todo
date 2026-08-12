package com.example.employeetodo.service;

import com.example.employeetodo.entity.Employee;
import com.example.employeetodo.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // Get All Employees
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Get Employee By ID
    public Employee getEmployeeById(Long id) {
        Optional<Employee> employee = repository.findById(id);
        return employee.orElse(null);
    }

    // Save Employee
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Update Employee
    public Employee updateEmployee(Long id, Employee employee) {

        Optional<Employee> existing = repository.findById(id);

        if (existing.isPresent()) {

            Employee emp = existing.get();

            emp.setName(employee.getName());
            emp.setEmail(employee.getEmail());
            emp.setDepartment(employee.getDepartment());
            emp.setDesignation(employee.getDesignation());

            return repository.save(emp);
        }

        return null;
    }

    // Delete Employee
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}