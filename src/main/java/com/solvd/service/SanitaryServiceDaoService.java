package com.solvd.service;

import com.solvd.daos.SanitaryServiceDao;
import com.solvd.entities.ElectricService;
import com.solvd.entities.Employee;
import com.solvd.entities.SanitaryService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanitaryServiceDaoService {
    SanitaryServiceDao sanitaryServiceDao = new SanitaryServiceDao();

    public SanitaryService sanitaryService() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        SanitaryService sanitaryService = new SanitaryService();

        sanitaryService = sanitaryServiceDao.getById(1);
        employees = sanitaryServiceDao.selectAllEmployees();

        sanitaryService.setEmployees(employees);

        return sanitaryService;
    }
}
