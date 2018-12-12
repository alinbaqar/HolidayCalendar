package com.company.calendar.employeecalendar.resource;

import com.company.calendar.employeecalendar.model.Employee;
import com.company.calendar.employeecalendar.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesResource {

    @Autowired
    EmployeesRepository employeesRepository;

//    Get all employees
    @GetMapping("/all")
    public List<Employee> getAll() {
        return employeesRepository.findAll();
    }

//    Add an employee
    @PostMapping("/create")
    public List<Employee> persist(@RequestBody final Employee employee) {
        employeesRepository.save(employee);
        return employeesRepository.findAll();
    }
}
