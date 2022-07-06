package com.solvd.daos;

import com.solvd.entities.Instrument;
import com.solvd.interfaces.IInstrumentDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InstrumentDao implements IInstrumentDao {
    ConnectionToDB connectionToDB = new ConnectionToDB();
    @Override
    public Instrument getById(int id) throws SQLException {
        PreparedStatement ps = connectionToDB.getConnection().prepareStatement("select * from Instruments where idInstrument = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        return new Instrument(resultSet.getInt("idInstrument"), resultSet.getString("type"));
    }
    @Override
    public void save(Instrument instrument) throws SQLException {
//
    }
    @Override
    public void update(Instrument instrument, String[] params) {
    }
    @Override
    public void delete(Instrument instrument) throws SQLException {
    }
    @Override
    public List<Instrument> selectAll() throws SQLException {
        List<Instrument> instruments = new ArrayList<>();
        Instrument instrument;
        PreparedStatement preparedStatement = connectionToDB.getConnection().prepareStatement("SELECT * FROM Instruments");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int idInstruments = resultSet.getInt("idInstrument");
            String kind = resultSet.getString("type");
            instrument = new Instrument(idInstruments, kind);
            instruments.add(instrument);
        }
        return instruments;
    }
}
