package com.solvd.daos;

import com.solvd.entities.GarbageBin;
import com.solvd.interfaces.IGarbageBinDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GarbageBinDao implements IGarbageBinDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();
    @Override
    public GarbageBin getById(int id) throws SQLException {
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("SELECT * FROM Garbage_Bins WHERE idGarbageBins = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new GarbageBin(resultSet.getInt("idGarbageBins"), resultSet.getInt("amount"));
    }
    @Override
    public void save(GarbageBin garbageBin) throws SQLException {
    }
    @Override
    public void update(GarbageBin garbageBin, String[] params) {
    }
    @Override
    public void delete(GarbageBin garbageBin) throws SQLException {
    }
    @Override
    public List<GarbageBin> selectAll() throws SQLException {
        return null;
    }
}
