package com.solvd.daos;

import com.solvd.entities.Area;
import com.solvd.entities.Toilet;
import com.solvd.interfaces.IToiletDao;

import java.sql.*;
import java.util.List;

public class ToiletDao implements IToiletDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();
    @Override
    public Toilet getById(int id) throws SQLException {
        String query = "select * from Toilets where idToilets = ?";
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Toilet(resultSet.getInt("idToilets"), resultSet.getInt("amount"));

    }
    @Override
    public void save(Toilet o) throws SQLException {
    }
    @Override
    public void update(Toilet o, String[] params) {
    }
    @Override
    public void delete(Toilet o) throws SQLException {
    }
    @Override
    public List<Toilet> selectAll() throws SQLException {
        return null;
    }
}
