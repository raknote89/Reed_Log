package com.reed_log.dao;

import com.reed_log.exception.DaoException;
import com.reed_log.model.Reeds;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component

public class JdbcReedsDao implements ReedsDao{

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

    @Override
    public Reeds getReedHardness(int reedId) {
        return null;
    }

    @Override
    public Reeds removeReed(int reedId) {
        return null;
    }

    @Override
    public Reeds setReedHardness(int reedId, double hardness) {
        return null;
    }

    @Override
    public Reeds setDateOpened(int reedId, Date dateOpened) {
        return null;
    }

    @Override
    public Reeds getDateOpenedById(int reedId) {
        return null;
    }

    @Override
    public List<Reeds> getReeds() {
        List<Reeds> reedsList = new List<>();
        String sql = "SELECT * FROM reeds;";
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
            if (results.next()) {
                reed = new Reeds();
                reed.setHardness(results.getDouble("strength"));
                reed.setDateOpened(results.getDate("date_opened"));
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        }
        return reedsList;
    }
}
