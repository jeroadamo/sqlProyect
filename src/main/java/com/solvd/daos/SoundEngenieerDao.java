package com.solvd.daos;

import com.solvd.entities.SoundEngenieer;
import com.solvd.interfaces.ISoundEngenieerDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SoundEngenieerDao implements ISoundEngenieerDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();
    @Override
    public SoundEngenieer getById(int id) throws SQLException {
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("SELECT * FROM Sound_Engenieer WHERE idSoundEngenieer = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new SoundEngenieer(resultSet.getInt("idSoundEngenieer"), resultSet.getString("name"));
    }
    @Override
    public void save(SoundEngenieer soundEngenieer) throws SQLException {
    }
    @Override
    public void update(SoundEngenieer soundEngenieer, String[] params) {
    }
    @Override
    public void delete(SoundEngenieer soundEngenieer) throws SQLException {
    }
    @Override
    public List<SoundEngenieer> selectAll() throws SQLException {
        return null;
    }
    @Override
    public SoundEngenieer soundEngenieerByConcertId(int id) throws SQLException {
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("select * from Sound_Engenieer JOIN Concerts on Sound_Engenieer.idSoundEngenieer = Concerts.idSoundEngenieer and Concerts.idConcerts = ?;");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new SoundEngenieer(resultSet.getInt("idSoundEngenieer"), resultSet.getString("name"));
    }
}
