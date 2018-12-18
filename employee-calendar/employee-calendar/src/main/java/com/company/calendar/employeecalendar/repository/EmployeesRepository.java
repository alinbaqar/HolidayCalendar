package com.company.calendar.employeecalendar.repository;

import com.company.calendar.employeecalendar.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee, Integer> {
}
