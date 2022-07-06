package com.solvd.daos;

import com.solvd.entities.Artist;
import com.solvd.interfaces.IArtistDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ArtistDao implements IArtistDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();
    @Override
    public Artist getById(int id) throws SQLException {
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("SELECT * FROM Artists WHERE idArtist = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new Artist(resultSet.getInt("idArtist"), resultSet.getString("name"));
    }
    @Override
    public void save(Artist artist) throws SQLException {
    }
    @Override
    public void update(Artist artist, String[] params) {
    }
    @Override
    public void delete(Artist artist) throws SQLException {
    }
    @Override
    public List<Artist> selectAll() throws SQLException {
        return null;
    }
}
