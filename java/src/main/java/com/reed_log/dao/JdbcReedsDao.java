package com.reed_log.dao;

import com.reed_log.exception.DaoException;
import com.reed_log.model.Reeds;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component

public class JdbcReedsDao implements ReedsDao{

    private List<Reeds> reeds = new ArrayList<>();

    private final JdbcTemplate jdbcTemplate;

    public JdbcReedsDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public Reeds getReedById(int reedId) {
        Reeds reed = null;
        String sql = "SELECT strength, date_opened FROM reeds WHERE reed_id = ?";
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, reedId);
            if (results.next()) {
                reed = new Reeds();
                reed.setHardness(results.getDouble("strength"));
                reed.setDateOpened(results.getDate("date_opened"));
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        }
        return reed;
    }


//  May not need this function
//    @Override
//    public Reeds getReedHardness(int reedId) {
//
//        return null;
//    }

    @Override
    public int removeReed(int reedId) {
        Reeds target = null;
        for (Reeds reed :  reeds){
            if (reed.getReedId() == reedId) {
                target = reed;
            }
        }
        if (target != null) {
            reeds.remove(target);
            return 1;
        } else {
            return 0;
        }

    }

    @Override
    public Reeds addReed(Reeds reed) {
        reed.setReedId(getMaxIdPlusOne());
        reeds.add(reed);
        return reed;
    }

    @Override
    public Reeds setReedHardness(int reedId, double hardness) {

        String sql = "UPDATE reeds SET strength = ? WHERE reed_id=?;";


        try{
            int rowsAffected = jdbcTemplate.update(sql, hardness, reedId);
            if(rowsAffected == 0) {
                return null;
            }
            String selectSql = "SELECT * FROM reeds WHERE reed_id = ?;";
            SqlRowSet results = jdbcTemplate.queryForRowSet(selectSql, reedId);
            if(results.next())  {
                Reeds reed = new Reeds();
                reed.setReedId(results.getInt("reed_id"));
                reed.setHardness(results.getDouble("strength"));
                return reed;
            }

        }catch (DataAccessException e) {
            System.err.println("Error inserting reed strength" + e.getMessage());
            throw new DaoException("Error inserting reed strength", e);
        }

    }
//
//    @Override
//    public Reeds setDateOpened(int reedId, Date dateOpened) {
//        return null;
//    }
//
//    @Override
//    public Reeds getDateOpenedById(int reedId) {
//        return null;
//    }

    @Override
    public List<Reeds> getReeds() {
        List<Reeds> reedsList = new ArrayList<>();
        String sql = "SELECT * FROM reeds;";
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
             while (results.next()) {
               Reeds reed = new Reeds();
                reed.setHardness(results.getDouble("strength"));
                reed.setDateOpened(results.getDate("date_opened"));
                reedsList.add(reed);
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        }
        return reedsList;
    }

    private int getMaxId() {
        int maxId = 0;
        for (Reeds r : reeds) {
            if (r.getReedId() > maxId) {
                maxId = r.getReedId();
            }
        }
        return maxId;
    }

    private int getMaxIdPlusOne() {
        return getMaxId() + 1;
    }
}
