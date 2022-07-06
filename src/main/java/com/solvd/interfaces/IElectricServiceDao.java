package com.solvd.interfaces;

import com.solvd.entities.ElectricService;
import com.solvd.entities.Employee;

import java.sql.SQLException;
import java.util.List;

public interface IElectricServiceDao extends IBaseDao<ElectricService>{
    List<Employee> selectAllEmployees() throws SQLException;
}
