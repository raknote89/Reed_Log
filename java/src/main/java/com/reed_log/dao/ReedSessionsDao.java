package com.reed_log.dao;

import com.reed_log.model.ReedSessions;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.boot.web.servlet.server.Session;

import java.util.Date;
import java.util.List;

public interface ReedSessionsDao {

    List<ReedSessions> getSessions(int reedId);

    ReedSessions addSession(ReedSessions session);

    ReedSessions getIndividualSession(int sessionId);

    ReedSessions setTimePlayed(int timePlayed);

   ReedSessions setTemperature(int temperature);

    ReedSessions setHumidity(int humidity);

    ReedSessions setRating(int rating);

    ReedSessions setResistance(int resistance);

    ReedSessions setNotes(String notes);

    ReedSessions setReedId(int reedId);

    ReedSessions setDatePlayed(Date date);


}
