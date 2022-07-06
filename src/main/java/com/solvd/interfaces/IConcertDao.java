package com.solvd.interfaces;

import com.solvd.entities.Artist;
import com.solvd.entities.Concert;
import com.solvd.entities.Dancer;
import com.solvd.entities.Instrument;
import org.apache.ibatis.jdbc.SQL;

import java.sql.SQLException;
import java.util.List;

public interface IConcertDao extends IBaseDao<Concert> {
    List<Artist> artistsInConcert(int id) throws SQLException;
    List<Dancer> dancersInConcert(int id) throws SQLException;
}