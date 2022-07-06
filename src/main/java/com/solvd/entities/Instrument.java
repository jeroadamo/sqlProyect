package com.solvd.entities;

public class Instrument {
    private int idInstruments;
    private String type;
    public Instrument(int idInstruments, String type) {
        this.idInstruments = idInstruments;
        this.type = type;
    }
    public int getIdInstruments() {
        return idInstruments;
    }
    public void setIdInstruments(int idInstruments) {
        this.idInstruments = idInstruments;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Instrument{" + "idInstruments=" + idInstruments + ", type='" + type + '\'' + '}';
    }
}
