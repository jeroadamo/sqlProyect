package com.solvd.service;

import com.solvd.daos.ElectricServiceDao;
import com.solvd.entities.ElectricService;
import com.solvd.entities.Employee;
import com.solvd.interfaces.IElectricServiceDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ElectricServiceDaoService {
    IElectricServiceDao electricServiceDao = new ElectricServiceDao();

    public ElectricService electricService() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        ElectricService electricService = new ElectricService();

        electricService = electricServiceDao.getById(1);
        employees = electricServiceDao.selectAllEmployees();

        electricService.setEmployees(employees);

        return electricService;
    }
}
