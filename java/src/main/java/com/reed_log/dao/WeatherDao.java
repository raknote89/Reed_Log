package com.reed_log.dao;

import com.reed_log.model.Weather;

public interface WeatherDao {

    Weather getWeatherByCity(String cityName);
}
