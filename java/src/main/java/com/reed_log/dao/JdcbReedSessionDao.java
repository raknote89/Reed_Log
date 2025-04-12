package com.reed_log.dao;

import com.reed_log.exception.DaoException;
import com.reed_log.model.ReedSessions;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class JdcbReedSessionDao implements ReedSessionsDao {

    private final JdbcTemplate jdbcTemplate;

    private Scanner input = new Scanner(System.in);

    public JdcbReedSessionDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
        this.input = input;
    }

    @Override
    public List<ReedSessions> getSessions(int reedId) {
        return List.of();
    }



    @Override
    public ReedSessions addSession(ReedSessions session) throws DaoException {
        if (session == null) {
            throw new IllegalArgumentException("Course object cannot be null");
        }

        return null;
    }

    @Override
    public ReedSessions getIndividualSession(int session) {
        return null;
    }

    @Override
    public ReedSessions setTimePlayed(int timePlayed) {
        return null;
    }

    @Override
    public ReedSessions setTemperature(int temperature) {
        return null;
    }

    @Override
    public ReedSessions setHumidity(int humidity) {
        return null;
    }

    @Override
    public ReedSessions setRating(int rating) {
        return null;
    }

    @Override
    public ReedSessions setResistance(int resistance) {
        return null;
    }

    @Override
    public ReedSessions setNotes(String notes) {
        return null;
    }

    @Override
    public ReedSessions setReedId(int reedId) {
        return null;
    }

    @Override
    public ReedSessions setDatePlayed(Date date) {
        return null;
    }


    private ReedSessions mapRowToReedSession(SqlRowSet rs){
        ReedSessions session = new ReedSessions();
        session.setSessionId(rs.getInt("session_id"));
        session.setReedId(rs.getInt("reed_id"));
        session.setDatePlayed(rs.getDate("date"));
        session.setTemperature(rs.getInt("temperature"));
        session.setHumidity(rs.getInt("humidity"));
        session.setRating(rs.getInt("rating"));
        session.setRating(rs.getInt("resistance"));
        session.setNotes(rs.getString("notes"));

        return null;
    }

}
