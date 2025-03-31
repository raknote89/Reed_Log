package com.reed_log.dao;

import com.reed_log.exception.DaoException;
import com.reed_log.model.Weather;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.List;

public class JdcbReedSessionDao implements ReedSessionsDao, WeatherDao {

    private final JdbcTemplate jdbcTemplate;

    public JdcbReedSessionDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Session> getSessions(int reedId) {
        return List.of();
    }

    @Override
    public Session addSession(Session session) throws DaoException {
        if (session == null) {
            throw new IllegalArgumentException("Course object cannot be null");
        }

        return null;
    }

    @Override
    public Session getIndividualSession(int session) {
        return null;
    }

    @Override
    public Session setTimePlayed(int timePlayed) {
        return null;
    }

    @Override
    public Session setFahrenheit(int fahrenheit) {
        return null;
    }

    @Override
    public Session setCelsius(int celsius) {
        return null;
    }

    @Override
    public Session setHumidity(int humidity) {
        return null;
    }

    @Override
    public Session setRating(int rating) {
        return null;
    }

    @Override
    public Session setResistance(int resistance) {
        return null;
    }

    @Override
    public Session setNotes(String notes) {
        return null;
    }

    @Override
    public Session setCity(String cityName) {
        return null;
    }

    @Override
    public Weather getFahrenheitByCity(String cityName) {
        return null;
    }

    @Override
    public Weather getCelsiusByCity(String cityName) {
        return null;
    }

    @Override
    public Weather getHumidityByCity(String cityName) {
        return null;
    }

    @Override
    public Weather getPressureByCity(String cityName) {
        return null;
    }

    private Session mapRowToReedSession(SqlRowSet rs){
        Session session = new Session();
        session.setSessionId(rs.getInt("session_id"));

    }

}
