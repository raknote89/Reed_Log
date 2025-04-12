package com.reed_log.dao;

import com.reed_log.model.Weather;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcWeatherDao implements WeatherDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcWeatherDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Weather getWeatherByCity(String cityName) {
        if(cityName == null) {
            throw new IllegalArgumentException("Must enter city name.");
        }

        //String sql = "INSERT INTO weather (date, temperature_fahrenheit, temperature_celsius, humidity, air_pressure, city_name");
        return null;
    }


}
