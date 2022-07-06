package com.solvd.interfaces;

import com.solvd.entities.Employee;
import com.solvd.entities.SanitaryService;

import java.sql.SQLException;
import java.util.List;

public interface ISanitaryServiceDao extends IBaseDao<SanitaryService>{
    List<Employee> selectAllEmployees() throws SQLException;
}
