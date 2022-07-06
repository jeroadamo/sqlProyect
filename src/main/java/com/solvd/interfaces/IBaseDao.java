package com.solvd.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface IBaseDao<T>{
        T getById(int id) throws SQLException;

        void save(T t) throws SQLException;

        void update(T t, String[] params);

        void delete(T t) throws SQLException;

        List<T> selectAll() throws SQLException;
    }

