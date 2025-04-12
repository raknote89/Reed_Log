package com.reed_log.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"temp_f", "temp_c", "humidity", "pressure_in"})

public class ReedSessions {

    private int sessionId;

    private int reedId;

    private Date datePlayed;

    private int timePlayed;

    private int temperature;
    
    private int humidity;

    private int rating;

    private int resistance;

    private String notes;

    private String cityName;

    public ReedSessions(int sessionId, int reedId, Date datePlayed, int timePlayed, int temperature, int celsius, int humidity, int rating, int resistance, String notes, String cityName) {
        this.sessionId = sessionId;
        this.reedId = reedId;
        this.datePlayed = datePlayed;
        this.timePlayed = timePlayed;
        this.temperature = temperature;
        this.humidity = humidity;
        this.rating = rating;
        this.resistance = resistance;
        this.notes = notes;
        this.cityName = cityName;
    }

    public ReedSessions() {

    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public int getReedId() {return reedId;}

    public void setReedId(int reedId) {this.reedId = reedId;}

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

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
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
