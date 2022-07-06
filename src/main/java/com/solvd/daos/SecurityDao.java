package com.solvd.daos;

import com.solvd.entities.Employee;
import com.solvd.entities.Security;
import com.solvd.interfaces.ISecurityDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SecurityDao implements ISecurityDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();
    @Override
    public Security getById(int id) throws SQLException {
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("SELECT * FROM Security WHERE squad_number = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new Security(resultSet.getInt("idSecurity"), resultSet.getInt("squad_number"), null);
    }
    @Override
    public void save(Security security) throws SQLException {
    }
    @Override
    public void update(Security security, String[] params) {
    }
    @Override
    public void delete(Security security) throws SQLException {
    }
    @Override
    public List<Security> selectAll() throws SQLException {
        return null;
    }
    @Override
    public List<Employee> selectAllEmployees() throws SQLException {
        List<Employee> employeesOnSecurity  = new ArrayList<>();
        Employee employee;
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("select * from Employees join Security on Employees.idEmployee = Security.idEmployee;");
        ResultSet resultSet = ps.executeQuery();
        while(resultSet.next()){
            int idEmployee = resultSet.getInt("idEmployee");
            String name = resultSet.getString("name");
            employee = new Employee(idEmployee,name);
            employeesOnSecurity.add(employee);
        }
        return employeesOnSecurity;
    }
}
