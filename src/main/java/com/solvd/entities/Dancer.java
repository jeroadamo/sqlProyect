package com.solvd.entities;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.List;

@XmlRootElement(name = "Dancer")
public class Dancer {

    private int idDancer;
    private String studio;
    private String name;

    public Dancer(int idDancer, String studio, String name) {
        this.idDancer = idDancer;
        this.studio = studio;
        this.name = name;
    }
    public int getIdDancer() {
        return idDancer;
    }
    public void setIdDancer(int idDancer) {
        this.idDancer = idDancer;
    }
    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Dancer{" + "idDancer=" + idDancer + ", studio='" + studio + '\'' + ", name='" + name + '\'' + '}';
    }
}