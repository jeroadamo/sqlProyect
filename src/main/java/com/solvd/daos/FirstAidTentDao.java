package com.solvd.daos;

import com.solvd.entities.Employee;
import com.solvd.entities.FirstAid;
import com.solvd.interfaces.IFirstAidTentDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FirstAidTentDao implements IFirstAidTentDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();
    @Override
    public FirstAid getById(int id) throws SQLException {
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("SELECT * FROM First_Aid WHERE tent_number = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new FirstAid(resultSet.getInt("idFirstAid"), resultSet.getInt("tent_number"), null);
    }
    @Override
    public void save(FirstAid firstAid) throws SQLException {
    }
    @Override
    public void update(FirstAid firstAid, String[] params) {
    }
    @Override
    public void delete(FirstAid firstAid) throws SQLException {
    }
    @Override
    public List<FirstAid> selectAll() throws SQLException {
        return null;
    }
    @Override
    public List<Employee> employeesInFirstAidTent() throws SQLException {
        List<Employee> employeesInFirstAid = new ArrayList<>();
        Employee employee;
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("select * from Employees inner join First_Aid on Employees.idEmployee = First_Aid.idEmployee;");
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()){
            int idEmployee = resultSet.getInt("idEmployee");
            String name = resultSet.getString("name");
            employee = new Employee(idEmployee,name);
            employeesInFirstAid.add(employee);
        }
        return employeesInFirstAid;
    }
}
