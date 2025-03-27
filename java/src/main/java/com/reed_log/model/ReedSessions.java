package com.reed_log.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"temp_f", "temp_c", "humidity", "pressure_in"})

public class ReedSessions {

    private int session;

    private Date datePlayed;

    private int timePlayed;

    private int fahrenheit;

    private int celsius;

    private int humidity;

    private int rating;

    private int resistance;

    private String notes;

    private String cityName;

    public ReedSessions(int session, Date datePlayed, int timePlayed, int fahrenheit, int celsius, int humidity, int rating, int resistance, String notes, String cityName) {
        this.session = session;
        this.datePlayed = datePlayed;
        this.timePlayed = timePlayed;
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
        this.humidity = humidity;
        this.rating = rating;
        this.resistance = resistance;
        this.notes = notes;
        this.cityName = cityName;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public Date getDatePlayed() {
        return datePlayed;
    }

    public void setDatePlayed(Date datePlayed) {
        this.datePlayed = datePlayed;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(int timePlayed) {
        this.timePlayed = timePlayed;
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("location.name")
    public String getCity() {
        return cityName;
    }

    public void setCity(String cityName) {
        this.cityName = cityName;
    }
}
