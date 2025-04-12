package com.reed_log.controller;

import com.reed_log.dao.JdbcReedsDao;
import com.reed_log.dao.ReedsDao;
import com.reed_log.model.Reeds;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin

public class ReedsController {
    private JdbcReedsDao jdbcReedsDao;

    public ReedsController(JdbcReedsDao jdbcReedsDao){
        this.jdbcReedsDao = jdbcReedsDao;
    }

    @GetMapping("/reeds")
    public List<Reeds> getAllReeds()
    {return jdbcReedsDao.getReeds()}

    @GetMapping("/reeds/id")
    public Reeds getReedsByReedId(){
        return jdbcReedsDao.getReedById(1);
    }

}
