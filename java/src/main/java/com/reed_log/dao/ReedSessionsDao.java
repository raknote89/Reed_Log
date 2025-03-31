package com.reed_log.dao;

import org.springframework.boot.web.servlet.server.Session;

import java.util.List;

public interface ReedSessionsDao {

    List<Session> getSessions(int reedId);

    Session addSession(Session session);

    Session getIndividualSession(int session);

    Session setTimePlayed(int timePlayed);

    Session setFahrenheit(int fahrenheit);

    Session setCelsius(int celsius);

    Session setHumidity(int humidity);

    Session setRating(int rating);

    Session setResistance(int resistance);

    Session setNotes(String notes);

    Session setCity(String cityName);
}
