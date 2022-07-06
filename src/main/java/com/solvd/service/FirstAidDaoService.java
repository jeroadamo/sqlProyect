package com.solvd.service;

import com.solvd.daos.FirstAidTentDao;
import com.solvd.entities.Employee;
import com.solvd.entities.FirstAid;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FirstAidDaoService {
    FirstAidTentDao firstAidTentDao = new FirstAidTentDao();
    public FirstAid firstAidTent() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        FirstAid firstAid = new FirstAid();

        firstAid = firstAidTentDao.getById(1);
        employees = firstAidTentDao.employeesInFirstAidTent();

        firstAid.setEmployees(employees);

        return firstAid;

    }
}
