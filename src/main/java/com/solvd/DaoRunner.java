package com.solvd;

import com.solvd.daos.AreaDao;
import com.solvd.daos.FoodNDrinksDao;
import com.solvd.daos.ToiletDao;
import com.solvd.entities.Concert;
import com.solvd.service.AreaDaoService;
import com.solvd.service.ConcertDaoService;
import com.solvd.service.ElectricServiceDaoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class DaoRunner {
    private final static Logger LOGGER = LogManager.getLogger(DaoRunner.class);
    public static void main(String[] args) throws SQLException {
        AreaDaoService areaDaoService = new AreaDaoService();
        LOGGER.info(areaDaoService.getArea(1));
    }
}
