package com.solvd.interfaces;

import com.solvd.entities.SoundEngenieer;

import java.sql.SQLException;

public interface ISoundEngenieerDao extends IBaseDao<SoundEngenieer>{
    SoundEngenieer soundEngenieerByConcertId(int id) throws SQLException;
}
