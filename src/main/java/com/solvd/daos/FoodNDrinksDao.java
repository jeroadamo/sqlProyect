package com.solvd.daos;

import com.solvd.entities.Employee;
import com.solvd.entities.FoodAndDrinkStand;
import com.solvd.interfaces.IFoodAndDrinkDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodNDrinksDao implements IFoodAndDrinkDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();
    @Override
    public FoodAndDrinkStand getById(int id) throws SQLException {
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("SELECT * FROM Food_and_Drinks WHERE stand_number = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new FoodAndDrinkStand(resultSet.getInt("idFoodNDrinks"), resultSet.getInt("stand_number"), null);
    }
    @Override
    public void save(FoodAndDrinkStand foodAndDrinkStand) throws SQLException {
    }
    @Override
    public void update(FoodAndDrinkStand foodAndDrinkStand, String[] params) {
    }
    @Override
    public void delete(FoodAndDrinkStand foodAndDrinkStand) throws SQLException {
    }
    @Override
    public List<FoodAndDrinkStand> selectAll() throws SQLException {
        return null;
    }
    @Override
    public List<Employee> selectAllEmployees() throws SQLException {
        List<Employee> employeesFoodAndDrinksStand = new ArrayList<>();
        Employee employee;
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("select * from Employees inner join Food_and_Drinks on Employees.idEmployee = Food_and_Drinks.idEmployee;");
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()){
            int idEmployee = resultSet.getInt("idEmployee");
            String name = resultSet.getString("name");
            employee = new Employee(idEmployee,name);
            employeesFoodAndDrinksStand.add(employee);
        }
        return employeesFoodAndDrinksStand;
    }
}
