package com.company.calendar.employeecalendar.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "emp_id")
    private Integer emp_id;
    @Column(name = "date")
    private Date date;
    @Column(name = "hours")
    private Integer hours;

    public Calendar() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
