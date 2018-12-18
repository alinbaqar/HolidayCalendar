package com.company.calendar.employeecalendar.repository;

import com.company.calendar.employeecalendar.model.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CalendarsRepository extends JpaRepository<Calendar, Integer> {

    @Query(value = "SELECT * FROM calendar WHERE emp_id = ?1", nativeQuery = true)
    List<Calendar> findTimeoffByEmp_id(Integer id);

    @Query(value = "SELECT sum(hours) FROM calendar WHERE emp_id = ?1", nativeQuery = true)
    Integer totalTimeOff(Integer id);

    @Query(value = "SELECT val FROM config WHERE setting = 'allowed_hours'", nativeQuery = true)
    Integer allowedHours();
}
