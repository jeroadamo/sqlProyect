package com.solvd.entities;

import java.util.List;

public class FirstAid {
    private int idFirstAid;
    private int tentNumber;
    private List<Employee> employees;
    public FirstAid(int idFirstAid, int tentNumber, List<Employee> employees) {
        this.idFirstAid = idFirstAid;
        this.tentNumber = tentNumber;
        this.employees = employees;
    }
    public FirstAid() {
    }
    public int getIdFirstAid() {
        return idFirstAid;
    }
    public void setIdFirstAid(int idFirstAid) {
        this.idFirstAid = idFirstAid;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public int getTentNumber() {
        return tentNumber;
    }
    public void setTentNumber(int tentNumber) {
        this.tentNumber = tentNumber;
    }
    @Override
    public String toString() {
        return "FirstAid{" + "idFirstAid=" + idFirstAid + ", tentNumber=" + tentNumber + ", employees=" + employees + '}';
    }
}
