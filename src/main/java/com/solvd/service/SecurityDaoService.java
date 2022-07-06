package com.solvd.service;

import com.solvd.daos.SecurityDao;
import com.solvd.entities.Employee;
import com.solvd.entities.Security;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SecurityDaoService {
    SecurityDao securityDao = new SecurityDao();

    public Security security() throws SQLException {
        Security security = new Security();
        List<Employee> employees = new ArrayList<>();

        security = securityDao.getById(1);
        employees = securityDao.selectAllEmployees();

        security.setEmployees(employees);

        return security;
    }
}
