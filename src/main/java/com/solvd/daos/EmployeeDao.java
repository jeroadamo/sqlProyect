package com.solvd.daos;

import com.solvd.entities.Employee;
import com.solvd.interfaces.IEmployeeDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDao implements IEmployeeDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();

    @Override
    public Employee getById(int id) throws SQLException {
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("SELECT * FROM Employees WHERE idEmployee = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new Employee(resultSet.getInt("idEmployee"), resultSet.getString("name"));
    }
    @Override
    public void save(Employee employee) throws SQLException {
    }
    @Override
    public void update(Employee employee, String[] params) {
    }
    @Override
    public void delete(Employee employee) throws SQLException {
    }
    @Override
    public List<Employee> selectAll() throws SQLException {
        return null;
    }
}
