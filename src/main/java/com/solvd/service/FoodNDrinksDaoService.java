package com.solvd.service;

import com.solvd.daos.FoodNDrinksDao;
import com.solvd.entities.Employee;
import com.solvd.entities.FoodAndDrinkStand;
import com.solvd.interfaces.IFoodAndDrinkDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodNDrinksDaoService {
    IFoodAndDrinkDao foodAndDrinkDao = new FoodNDrinksDao();

    public FoodAndDrinkStand foodAndDrinksStand() throws SQLException {
        FoodAndDrinkStand foodAndDrinkStand = new FoodAndDrinkStand();
        List<Employee> employees = new ArrayList<>();
        foodAndDrinkStand = foodAndDrinkDao.getById(1);
        employees = foodAndDrinkDao.selectAllEmployees();
        foodAndDrinkStand.setEmployees(employees);
        return foodAndDrinkStand;
    }
}
