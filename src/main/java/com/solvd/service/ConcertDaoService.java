package com.solvd.service;

import com.solvd.daos.ConcertDao;
import com.solvd.daos.InstrumentDao;
import com.solvd.daos.SoundEngenieerDao;
import com.solvd.entities.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConcertDaoService {
    ConcertDao concertDao = new ConcertDao();
    FirstAidDaoService firstAidDaoService = new FirstAidDaoService();
    InstrumentDao instrumentDao = new InstrumentDao();
    SoundEngenieerDao soundEngenieerDao = new SoundEngenieerDao();

    public Concert concertById(int id) throws SQLException {
        Concert concert = new Concert();
        List<Instrument> instruments = new ArrayList<>();
        List<Dancer> dancers = new ArrayList<>();
        List<Artist> artists = new ArrayList<>();

        concert = concertDao.getById(id);
        instruments = instrumentDao.selectAll();
        artists = concertDao.artistsInConcert(id);
        dancers = concertDao.dancersInConcert(id);

        concert.setArtists(artists);
        concert.setDancers(dancers);
        concert.setInstruments(instruments);
        concert.setFirstAidTent(firstAidDaoService.firstAidTent());
        concert.setSoundEngenieer(soundEngenieerDao.soundEngenieerByConcertId(1));

        return concert;
    }
}




