package com.solvd.entities;

import java.util.List;

public class SanitaryService {
    private int idSanitaryService;
    private int tentNumber;
    private List<Employee> employees;
    public SanitaryService(int idSanitaryService, int tentNumber, List<Employee> employees) {
        this.idSanitaryService = idSanitaryService;
        this.tentNumber = tentNumber;
        this.employees = employees;
    }
    public SanitaryService() {
    }
    public int getIdSanitaryService() {
        return idSanitaryService;
    }
    public void setIdSanitaryService(int idSanitaryService) {
        this.idSanitaryService = idSanitaryService;
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
        return "SanitaryService{" + "idSanitaryService=" + idSanitaryService + ", tentNumber=" + tentNumber + ", employees=" + employees + '}';
    }
}
