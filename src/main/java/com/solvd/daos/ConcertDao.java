package com.solvd.daos;

import com.solvd.entities.Artist;
import com.solvd.entities.Concert;
import com.solvd.entities.Dancer;
import com.solvd.entities.Instrument;
import com.solvd.interfaces.IConcertDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConcertDao implements IConcertDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();
    @Override
    public Concert getById(int idConcerts) throws SQLException {
        String query = "select * from Concerts where idConcert = ?";
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement(query);
            ps.setInt(1, idConcerts);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Concert(resultSet.getInt("idConcert"), resultSet.getString("time"), resultSet.getString("duration"), resultSet.getString("date"), null, null, null, null, null);
    }
    @Override
    public void save(Concert concert) throws SQLException {
//        String query = "INSERT INTO Concerts (idConcerts,time_play,date,duration,idArea,idTickets) VALUES (?,?,?,?,?,?)";
//        PreparedStatement ps = connection.prepareStatement(query);
//        ps.setInt(1, concert.getIdConcert());
//        ps.setString(2, concert.getTimePlay());
//        ps.setString(3, concert.getDate());
//        ps.setString(4, concert.getDuration());
//        ps.setObject(5, concert.getArea());
//        ps.executeUpdate();
//        System.out.println("Concert successfully added to DB server");
    }
    @Override
    public void update(Concert concert, String[] params) {
    }
    @Override
    public void delete(Concert concert) throws SQLException {
//        String query = "DELETE FROM Concerts WHERE idConcerts = ?";
//        PreparedStatement ps = connection.prepareStatement(query);
//        ps.setInt(1, concert.getIdConcert());
//        ps.executeUpdate();
    }
    @Override
    public List<Concert> selectAll() throws SQLException {
//        List<Concert> concerts = new ArrayList<>();
//        Concert concert;
//        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Concerts");
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while (resultSet.next()) {
//            int idConcerts = resultSet.getInt("idConcerts");
//            String time_play = resultSet.getString("time_play");
//            String date = resultSet.getString("date");
//            String duration = resultSet.getString("duration");
//            Area area = new Area(resultSet.getInt("idArea"), null);
//            concert = new Concert(idConcerts, time_play, duration, date, area, null);
//            concerts.add(concert);
//        }
//        return concerts;
        return null;
    }
    @Override
    public List<Artist> artistsInConcert(int id) throws SQLException {
        List<Artist> artistsInConcert = new ArrayList<>();
        Artist artist;
        PreparedStatement preparedStatement = connectionToDB.getConnection().prepareStatement("select * from Artists join Concerts on Concerts.idArtist = Artists.idArtist and Concerts.idConcerts = ?;");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int idArtist = resultSet.getInt("idArtist");
            String name = resultSet.getString("name");
            artist = new Artist(idArtist,name);
            artistsInConcert.add(artist);
        }
        return artistsInConcert;
    }
    @Override
    public List<Dancer> dancersInConcert(int id) throws SQLException {
        List<Dancer> dancersInConcert = new ArrayList<>();
        Dancer dancer;
        PreparedStatement preparedStatement = connectionToDB.getConnection().prepareStatement("select * from Dancers join Concerts on Dancers.idDancer = Concerts.idConcert and Concerts.idConcerts = ?;");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int idDancer = resultSet.getInt("idDancer");
            String name = resultSet.getString("name");
            String studio = resultSet.getString("studio");
            dancer = new Dancer(idDancer,name, studio);
            dancersInConcert.add(dancer);
        }
        return dancersInConcert;
    }
}
