package com.solvd.entities;

import java.util.List;

public class Security {
    private int idSecurity;
    private int squadNumber;
    private List<Employee> employees;
    public Security(int idSecurity, int squadNumber, List<Employee> employees) {
        this.idSecurity = idSecurity;
        this.squadNumber = squadNumber;
        this.employees = employees;
    }
    public Security() {
    }
    public int getIdSecurity() {
        return idSecurity;
    }
    public void setIdSecurity(int idSecurity) {
        this.idSecurity = idSecurity;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public int getSquadNumber() {
        return squadNumber;
    }
    public void setSquadNumber(int squadNumber) {
        this.squadNumber = squadNumber;
    }
    @Override
    public String toString() {
        return "Security{" + "idSecurity=" + idSecurity + ", squadNumber=" + squadNumber + ", employees=" + employees + '}';
    }
}
