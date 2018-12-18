package com.company.calendar.employeecalendar.resource;

import com.company.calendar.employeecalendar.model.Calendar;
import com.company.calendar.employeecalendar.repository.CalendarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timeoff")
public class CalendarsResource {

    @Autowired
    CalendarsRepository calendarsRepository;

    @GetMapping("/list")
    public List<Calendar> getById(@RequestParam("id") Integer id) {
        return calendarsRepository.findTimeoffByEmp_id(id);
    }

    @GetMapping("/allowed")
    public Integer getAllowedHours() {
        return calendarsRepository.allowedHours();
    }

    @GetMapping("/query")
    public Integer getBalance(@RequestParam("id") Integer id) {
        Integer allowedHours = getAllowedHours();
        Integer totalTimeOff = calendarsRepository.totalTimeOff(id);
        return allowedHours - totalTimeOff;
    }

    @PostMapping("/request")
    public Boolean makeRequest(@RequestParam("id") Integer id, @RequestParam("hours") Integer hours) {
        Integer balance = getBalance(id);

        if (balance - hours >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

}
