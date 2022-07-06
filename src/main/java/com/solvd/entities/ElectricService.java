package com.solvd.entities;

import java.util.List;

public class ElectricService {
    private int idElectricService;
    private List<Employee> employees;
    public ElectricService(int idElectricService, List<Employee> employees) {
        this.idElectricService = idElectricService;
        this.employees = employees;
    }
    public ElectricService() {
    }
    public int getIdElectricService() {
        return idElectricService;
    }
    public void setIdElectricService(int idElectricService) {
        this.idElectricService = idElectricService;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    @Override
    public String toString() {
        return "ElectricService{" + "idElectricService=" + idElectricService + ", employees=" + employees + '}';
    }
}
