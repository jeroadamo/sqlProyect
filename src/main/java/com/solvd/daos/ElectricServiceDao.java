package com.solvd.daos;

import com.solvd.entities.ElectricService;
import com.solvd.entities.Employee;
import com.solvd.interfaces.IElectricServiceDao;

import java.security.Security;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ElectricServiceDao implements IElectricServiceDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();
    @Override
    public ElectricService getById(int id) throws SQLException {
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("SELECT * FROM Electrical_Service WHERE idElectricalService = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new ElectricService(resultSet.getInt("idElectricalService"), null);
    }
    @Override
    public void save(ElectricService electricService) throws SQLException {
    }
    @Override
    public void update(ElectricService electricService, String[] params) {
    }
    @Override
    public void delete(ElectricService electricService) throws SQLException {
    }
    @Override
    public List<ElectricService> selectAll() throws SQLException {
        return null;
    }
    @Override
    public List<Employee> selectAllEmployees() throws SQLException {
        List<Employee> employeesElectricService = new ArrayList<>();
        Employee employee;
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("select * from Employees inner join Electrical_Service on Employees.idEmployee = Electrical_Service.idEmployee;");
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            int idEmployee = resultSet.getInt("idEmployee");
            String name = resultSet.getString("name");
            employee = new Employee(idEmployee, name);
            employeesElectricService.add(employee);
        }
        return employeesElectricService;
    }
}