package com.solvd.interfaces;

import com.solvd.entities.Employee;
import com.solvd.entities.FirstAid;

import java.sql.SQLException;
import java.util.List;

public interface IFirstAidTentDao extends IBaseDao<FirstAid>{
    List<Employee> employeesInFirstAidTent() throws SQLException;
}
