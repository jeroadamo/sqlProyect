package com.solvd.entities;

public class Artist {
    private int idArtists;
    private String name;
    public Artist(int idArtists, String name) {
        this.idArtists = idArtists;
        this.name = name;
    }
    public int getIdArtists() {
        return idArtists;
    }
    public void setIdArtists(int idArtists) {
        this.idArtists = idArtists;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Artist{" + "idArtists=" + idArtists + ", name='" + name + '\'' + '}';
    }
}
