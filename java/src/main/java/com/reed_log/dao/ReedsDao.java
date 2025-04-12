package com.reed_log.dao;

import com.reed_log.model.Reeds;

import java.util.Date;
import java.util.List;

public interface ReedsDao {

    Reeds getReedById(int reedId);

    Reeds getReedHardness(int reedId);

    Reeds removeReed(int reedId);

    Reeds setReedHardness(int reedId, double hardness);

    Reeds setDateOpened(int reedId, Date dateOpened);

    Reeds getDateOpenedById(int reedId);

    List<Reeds> getReeds();


}
