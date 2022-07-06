package com.solvd.daos;

import com.solvd.entities.*;
import com.solvd.interfaces.IAreaDao;
import org.apache.ibatis.session.SqlSessionException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AreaDao implements IAreaDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();

    @Override
    public Area getById(int idArea) throws SQLException {
        String query = "select * from Areas where idArea = ?";
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement(query);
        ps.setInt(1, idArea);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new Area(resultSet.getInt("idArea"), resultSet.getString("cardinal_location"), null,null, null, null, null, null, null);
    }
    @Override
    public void save(Area area) throws SQLException {
    }
    @Override
    public void update(Area area, String[] params) {
    }
    @Override
    public void delete(Area area) throws SQLException {
        String query = "DELETE FROM Area WHERE idArea = ?";
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement(query);
        ps.setInt(1, area.getIdArea());
        ps.executeUpdate();
    }
    @Override
    public List<Area> selectAll() throws SQLException {
        return null;
    }
    @Override
    public List<Toilet> selectToiletsInArea(int id) throws SQLException {
        List<Toilet> toiletsInArea = new ArrayList<>();
        Toilet toiletPack;
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("select * from Toilets join Areas ON Areas.idToilets = Toilets.idToilets and Areas.idArea = ?;");
        ps.setInt(1,id);
        ResultSet resultSet = ps.executeQuery();
        while(resultSet.next()){
            int idToilets = resultSet.getInt("idToilets");
            int amount = resultSet.getInt("amount");
            toiletPack = new Toilet(idToilets,amount);
            toiletsInArea.add(toiletPack);
        }
        return toiletsInArea;
    }
    @Override
    public List<GarbageBin> garbageBinsInArea(int id) throws SQLException {
        List<GarbageBin> garbageBinsInArea = new ArrayList<>();
        GarbageBin garbageBins;
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("select * from Garbage_Bins join Areas ON Areas.idGarbageBins = Garbage_Bins.idGarbageBins and Areas.idArea = ?;");
        ps.setInt(1,id);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()){
            int idGarbageBins = resultSet.getInt("idGarbageBins");
            int amount = resultSet.getInt("amount");
            garbageBins = new GarbageBin(idGarbageBins,amount);
            garbageBinsInArea.add(garbageBins);
        }

        return garbageBinsInArea;
    }
}
