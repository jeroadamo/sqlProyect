package com.solvd.entities;

import jakarta.xml.bind.annotation.XmlElement;

import java.util.List;

public class Area {
    private int idArea;
    private String cardinalLocation;
    private FoodAndDrinkStand foodAndDrinkStand;
    private List<Toilet> toilets;
    private Security securityPack;
    private ElectricService electricService;
    private List<Concert> concerts;
    private List<GarbageBin> garbageBins;
    private SanitaryService sanitaryService;
    public Area(int idArea, String cardinalLocation, FoodAndDrinkStand foodAndDrinkStand,
                List<Toilet> toilets, Security securityPack, ElectricService electricService,
                List<Concert> concerts, List<GarbageBin> garbageBins, SanitaryService sanitaryService) {
        this.idArea = idArea;
        this.cardinalLocation = cardinalLocation;
        this.foodAndDrinkStand = foodAndDrinkStand;
        this.toilets = toilets;
        this.securityPack = securityPack;
        this.electricService = electricService;
        this.concerts = concerts;
        this.garbageBins = garbageBins;
        this.sanitaryService = sanitaryService;
    }
    public Area() {
    }
    public int getIdArea() {
        return idArea;
    }
    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }
    public String getCardinalLocation() {
        return cardinalLocation;
    }
    public void setCardinalLocation(String cardinalLocation) {
        this.cardinalLocation = cardinalLocation;
    }
    public FoodAndDrinkStand getFoodAndDrinkStand() {
        return foodAndDrinkStand;
    }
    public void setFoodAndDrinkStand(FoodAndDrinkStand foodAndDrinkStand) {
        this.foodAndDrinkStand = foodAndDrinkStand;
    }
    public List<Toilet> getToilets() {
        return toilets;
    }
    public void setToilets(List<Toilet> toilets) {
        this.toilets = toilets;
    }
    public Security getSecurityPack() {
        return securityPack;
    }
    public void setSecurityPack(Security securityPack) {
        this.securityPack = securityPack;
    }
    public ElectricService getElectricService() {
        return electricService;
    }
    public void setElectricService(ElectricService electricService) {
        this.electricService = electricService;
    }
    public List<Concert> getConcerts() {
        return concerts;
    }
    public void setConcerts(List<Concert> concerts) {
        this.concerts = concerts;
    }
    public List<GarbageBin> getGarbageBins() {
        return garbageBins;
    }
    public void setGarbageBins(List<GarbageBin> garbageBins) {
        this.garbageBins = garbageBins;
    }
    public SanitaryService getSanitaryService() {
        return sanitaryService;
    }
    public void setSanitaryService(SanitaryService sanitaryService) {
        this.sanitaryService = sanitaryService;
    }
    @Override
    public String toString() {
        return "Area{" + "idArea=" + idArea + ", cardinalLocation='" + cardinalLocation + '\'' + ", foodAndDrinkStand=" + foodAndDrinkStand + ", toilets=" + toilets + ", securityPack=" + securityPack + ", electricService=" + electricService + ", concerts=" + concerts + ", garbageBins=" + garbageBins + ", sanitaryService=" + sanitaryService + '}';
    }
}