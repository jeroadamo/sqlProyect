package com.solvd.entities;

import java.util.List;

public class FoodAndDrinkStand {
    private int idFoodDrinksStand;
    private int standNumber;
    private List<Employee> employees;
    public FoodAndDrinkStand(int idFoodDrinksStand, int standNumber, List<Employee> employees) {
        this.idFoodDrinksStand = idFoodDrinksStand;
        this.standNumber = standNumber;
        this.employees = employees;
    }
    public FoodAndDrinkStand() {
    }
    public int getIdFoodDrinksStand() {
        return idFoodDrinksStand;
    }
    public void setIdFoodDrinksStand(int idFoodDrinksStand) {
        this.idFoodDrinksStand = idFoodDrinksStand;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public int getStandNumber() {
        return standNumber;
    }
    public void setStandNumber(int standNumber) {
        this.standNumber = standNumber;
    }
    @Override
    public String toString() {
        return "FoodAndDrinkStand{" + "idFoodDrinksStand=" + idFoodDrinksStand + ", standNumber=" + standNumber + ", employees=" + employees + '}';
    }
}

