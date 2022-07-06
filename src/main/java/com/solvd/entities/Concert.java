package com.solvd.entities;

import java.util.List;

public class Concert {
    private int idConcert;
    private String timePlay;
    private String duration;
    private String date;
    private List<Artist> artists;
    private SoundEngenieer soundEngenieer;
    private List<Instrument> instruments;
    private List<Dancer> dancers;
    private FirstAid firstAidTent;
    public Concert(int idConcert, String timePlay, String duration, String date,
                   List<Artist> artists, SoundEngenieer soundEngenieer, List<Instrument> instruments,
                   List<Dancer> dancers, FirstAid firstAidTent) {
        this.idConcert = idConcert;
        this.timePlay = timePlay;
        this.duration = duration;
        this.date = date;
        this.artists = artists;
        this.soundEngenieer = soundEngenieer;
        this.instruments = instruments;
        this.dancers = dancers;
        this.firstAidTent = firstAidTent;
    }
    public Concert() {
    }
    public int getIdConcert() {
        return idConcert;
    }
    public void setIdConcert(int idConcert) {
        this.idConcert = idConcert;
    }
    public String getTimePlay() {
        return timePlay;
    }
    public void setTimePlay(String timePlay) {
        this.timePlay = timePlay;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public List<Artist> getArtists() {
        return artists;
    }
    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
    public SoundEngenieer getSoundEngenieer() {
        return soundEngenieer;
    }
    public void setSoundEngenieer(SoundEngenieer soundEngenieer) {
        this.soundEngenieer = soundEngenieer;
    }
    public List<Instrument> getInstruments() {
        return instruments;
    }
    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }
    public List<Dancer> getDancers() {
        return dancers;
    }
    public void setDancers(List<Dancer> dancers) {
        this.dancers = dancers;
    }
    public FirstAid getFirstAidTent() {
        return firstAidTent;
    }
    public void setFirstAidTent(FirstAid firstAidTent) {
        this.firstAidTent = firstAidTent;
    }
    @Override
    public String toString() {
        return "Concert{" + "idConcert=" + idConcert + ", timePlay='" + timePlay + '\'' + ", duration='" + duration + '\'' + ", date='" + date + '\'' + ", artists=" + artists + ", soundEngenieer=" + soundEngenieer + ", instruments=" + instruments + ", dancers=" + dancers + ", firstAidTent=" + firstAidTent + '}';
    }
}
