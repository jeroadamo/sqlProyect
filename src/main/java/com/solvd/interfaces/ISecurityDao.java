package com.solvd.interfaces;

import com.solvd.entities.Employee;
import com.solvd.entities.Security;

import java.sql.SQLException;
import java.util.List;

public interface ISecurityDao extends IBaseDao<Security>{
    List<Employee> selectAllEmployees() throws SQLException;
}
