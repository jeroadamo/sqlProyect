package com.solvd.interfaces;

import com.solvd.entities.Employee;
import com.solvd.entities.FoodAndDrinkStand;

import java.sql.SQLException;
import java.util.List;

public interface IFoodAndDrinkDao  extends IBaseDao<FoodAndDrinkStand>{
    List<Employee> selectAllEmployees() throws SQLException;
}

