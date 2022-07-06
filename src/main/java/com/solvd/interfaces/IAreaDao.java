package com.solvd.interfaces;

import com.solvd.entities.*;
import org.apache.ibatis.session.SqlSessionException;

import java.sql.SQLException;
import java.util.List;

public interface IAreaDao extends IBaseDao<Area>{
    List<Toilet> selectToiletsInArea(int id) throws SQLException;
    List<GarbageBin> garbageBinsInArea(int id) throws SQLException;

}
