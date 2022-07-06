package com.solvd.service;

import com.solvd.daos.AreaDao;
import com.solvd.entities.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AreaDaoService {
    AreaDao areaDao = new AreaDao();
    FoodNDrinksDaoService foodNDrinksDaoService = new FoodNDrinksDaoService();
    SecurityDaoService securityDaoService = new SecurityDaoService();
    ElectricServiceDaoService electricServiceDaoService = new ElectricServiceDaoService();
    ConcertDaoService concertDaoService = new ConcertDaoService();
    SanitaryServiceDaoService sanitaryServiceDaoService = new SanitaryServiceDaoService();

    public Area getArea(int id) throws SQLException {
        Area area = new Area();
        List<Toilet> toilets = new ArrayList<>();
        List<GarbageBin> garbageBins = new ArrayList<>();
        List<Concert> concerts = new ArrayList<>();
        Concert concert = new Concert();

        area = areaDao.getById(id);
        toilets = areaDao.selectToiletsInArea(id);
        garbageBins = areaDao.garbageBinsInArea(id);
        concert = concertDaoService.concertById(id);
        concerts.add(concert);

        area.setElectricService(electricServiceDaoService.electricService());
        area.setSanitaryService(sanitaryServiceDaoService.sanitaryService());
        area.setFoodAndDrinkStand(foodNDrinksDaoService.foodAndDrinksStand());
        area.setSecurityPack(securityDaoService.security());
        area.setToilets(toilets);
        area.setGarbageBins(garbageBins);
        area.setConcerts(concerts);

        return area;
    }
}
