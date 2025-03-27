package com.reed_log.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"temp_f", "temp_c", "humidity", "pressure_in"})
public class Weather {

    private int tempF;

    private int tempC;

    private int humidity;

    private int airPressure;

    private String city;

    public Weather(int tempF, int tempC, int humidity, int airPressure, String city) {
        this.tempF = tempF;
        this.tempC = tempC;
        this.humidity = humidity;
        this.airPressure = airPressure;
        this.city = city;
    }

    @JsonProperty("current.temp_f")
    public int getTemperatureF() {
        return this.tempF;
    }

    @JsonProperty("current.temp_c")
    public int getTemperatureC() {
        return this.tempC;
    }

    @JsonProperty("current.humidity")
    public int getHumidity() {
        return humidity;
    }

    @JsonProperty("current.pressure_in")
    public int getAirPressure() {
        return airPressure;
    }

    @JsonProperty("location.name")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
