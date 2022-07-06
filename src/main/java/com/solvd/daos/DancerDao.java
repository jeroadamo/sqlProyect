package com.solvd.daos;

import com.solvd.entities.Dancer;
import com.solvd.interfaces.IDancerDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DancerDao implements IDancerDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();
    @Override
    public Dancer getById(int id) throws SQLException {
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("SELECT * FROM Dancers WHERE idDancer = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new Dancer(resultSet.getInt("idDancer"), resultSet.getString("studio"), resultSet.getString("name"));
    }
    @Override
    public void save(Dancer dancer) throws SQLException {
    }
    @Override
    public void update(Dancer dancer, String[] params) {
    }
    @Override
    public void delete(Dancer dancer) throws SQLException {
    }
    @Override
    public List<Dancer> selectAll() throws SQLException {
        return null;
    }
}
