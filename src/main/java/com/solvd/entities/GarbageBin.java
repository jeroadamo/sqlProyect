package com.solvd.entities;

public class GarbageBin {
    private int idGarbageBin;
    private int amount;
    public GarbageBin(int idGarbageBin, int amount) {
        this.idGarbageBin = idGarbageBin;
        this.amount = amount;
    }
    public int getIdGarbageBin() {
        return idGarbageBin;
    }
    public void setIdGarbageBin(int idGarbageBin) {
        this.idGarbageBin = idGarbageBin;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "GarbageBin{" + "idGarbageBin=" + idGarbageBin + ", amount=" + amount + '}';
    }
}
