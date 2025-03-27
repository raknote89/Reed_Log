package com.reed_log.dao;

import com.reed_log.model.Weather;

public interface WeatherDao {

    Weather getFahrenheitByCity(String cityName);

    Weather getCelsiusByCity(String cityName);

    Weather getHumidityByCity(String cityName);

    Weather getPressureByCity(String cityName);
}
