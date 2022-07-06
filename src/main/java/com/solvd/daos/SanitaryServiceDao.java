package com.solvd.daos;

import com.solvd.entities.Employee;
import com.solvd.entities.SanitaryService;
import com.solvd.interfaces.ISanitaryServiceDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanitaryServiceDao implements ISanitaryServiceDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();
    @Override
    public SanitaryService getById(int id) throws SQLException {
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("SELECT * FROM Sanitary_Service WHERE tent_number = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new SanitaryService(resultSet.getInt("idSanitaryService"), resultSet.getInt("tent_number"), null);
    }
    @Override
    public void save(SanitaryService sanitaryService) throws SQLException {
    }
    @Override
    public void update(SanitaryService sanitaryService, String[] params) {
    }
    @Override
    public void delete(SanitaryService sanitaryService) throws SQLException {
    }
    @Override
    public List<SanitaryService> selectAll() throws SQLException {
        return null;
    }
    @Override
    public List<Employee> selectAllEmployees() throws SQLException {
        List<Employee> employeesSanitaryService = new ArrayList<>();
        Employee employee;
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("select * from Employees inner join Sanitary_Service on Employees.idEmployee = Sanitary_Service.idEmployee;");
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            int idEmployee = resultSet.getInt("idEmployee");
            String name = resultSet.getString("name");
            employee = new Employee(idEmployee, name);
            employeesSanitaryService.add(employee);
        }
        return employeesSanitaryService;
    }
}
