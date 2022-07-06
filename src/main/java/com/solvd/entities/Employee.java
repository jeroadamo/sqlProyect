package com.solvd.entities;

public class Employee {
    private int idEmployee;
    private String name;
    public Employee(int idEmployee, String name) {
        this.idEmployee = idEmployee;
        this.name = name;
    }
    public int getIdEmployee() {
        return idEmployee;
    }
    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee{" + "idEmployee=" + idEmployee + ", name='" + name + '\'' + '}';
    }
}