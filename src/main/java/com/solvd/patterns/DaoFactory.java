package com.solvd.patterns;

import com.solvd.daos.*;
import com.solvd.entities.Dancer;
import com.solvd.entities.ElectricService;
import com.solvd.entities.FirstAid;
import com.solvd.interfaces.IBaseDao;
import com.solvd.service.ElectricServiceDaoService;
import com.solvd.service.FirstAidDaoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class DaoFactory {
    private final static Logger LOGGER = LogManager.getLogger(DaoFactory.class);
    public IBaseDao<?> getDao(String dao) throws SQLException {
        if (dao.equalsIgnoreCase("area")) {
            AreaDao areaDao = new AreaDao();
            return areaDao;
        } else if (dao.equalsIgnoreCase("artist")) {
            ArtistDao artistDao = new ArtistDao();
            return artistDao;
        } else if (dao.equalsIgnoreCase("concert")) {
            ConcertDao concertDao = new ConcertDao();
            return concertDao;
        } else if (dao.equalsIgnoreCase("dancer")) {
            DancerDao dancerDao = new DancerDao();
            return dancerDao;
        }else if (dao.equalsIgnoreCase("electric service")){
            ElectricServiceDao electricServiceDao = new ElectricServiceDao();
            return electricServiceDao;
        } else if (dao.equalsIgnoreCase("employee")) {
            EmployeeDao employeeDao = new EmployeeDao();
            return employeeDao;
        } else if (dao.equalsIgnoreCase("first aid")) {
            FirstAidTentDao firstAidTentDao = new FirstAidTentDao();
            return firstAidTentDao;
        } else if (dao.equalsIgnoreCase("food and drinks")) {
            FoodNDrinksDao foodNDrinksDao = new FoodNDrinksDao();
            return foodNDrinksDao;
        } else if (dao.equalsIgnoreCase("garbage bins")) {
            GarbageBinDao garbageBinDao = new GarbageBinDao();
            return garbageBinDao;
        } else if (dao.equalsIgnoreCase("instrument")) {
            InstrumentDao instrumentDao = new InstrumentDao();
            return instrumentDao;
        }
        return null;
    }
}

