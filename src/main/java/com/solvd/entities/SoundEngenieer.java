package com.solvd.entities;

public class SoundEngenieer {
    private int idSoundEngenieer;
    private String name;
    public SoundEngenieer(int idSoundEngenieer, String name) {
        this.idSoundEngenieer = idSoundEngenieer;
        this.name = name;
    }
    public int getIdSoundEngenieer() {
        return idSoundEngenieer;
    }
    public void setIdSoundEngenieer(int idSoundEngenieer) {
        this.idSoundEngenieer = idSoundEngenieer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "SoundEngenieer{" + "idSoundEngenieer=" + idSoundEngenieer + ", name='" + name + '\'' + '}';
    }
}
