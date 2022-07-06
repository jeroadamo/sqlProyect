package com.solvd.entities;
public class Toilet {
    private int idToilets;
    private int amount;
    public Toilet(int idToilets, int amount) {
        this.idToilets = idToilets;
        this.amount = amount;
    }
    public int getIdToilets() {
        return idToilets;
    }
    public void setIdToilets(int idToilets) {
        this.idToilets = idToilets;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Toilet{" + "idToilets=" + idToilets + ", amount=" + amount + '}';
    }
}
