package com.solvd.patterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.sql.SQLException;

public class PatternsRunner {
    private final static Logger LOGGER = LogManager.getLogger(PatternsRunner.class);
    public static void main(String[] args) throws SQLException, IOException {
        DaoFactory daoFactory = new DaoFactory();

        LOGGER.info(daoFactory.getDao("garbage bins").getById(1));
        LOGGER.info(daoFactory.getDao("artist").getById(4));
    }
}
