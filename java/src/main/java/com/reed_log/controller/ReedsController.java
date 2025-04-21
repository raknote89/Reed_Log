package com.reed_log.controller;

import com.reed_log.dao.JdbcReedsDao;
import com.reed_log.dao.ReedsDao;
import com.reed_log.model.Reeds;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin

public class ReedsController {
    private JdbcReedsDao jdbcReedsDao;

    public ReedsController(JdbcReedsDao jdbcReedsDao){
        this.jdbcReedsDao = jdbcReedsDao;
    }

    @GetMapping("/reeds")
    public List<Reeds> getAllReeds()
    {return jdbcReedsDao.getReeds();}

    @GetMapping("/reeds/id")
    public Reeds getReedsByReedId(){
        return jdbcReedsDao.getReedById(1);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/reeds/addReed")
    public ResponseEntity<Map<String, Object>> addReed(@RequestBody Reeds reed){
        if (reed == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("Error", "Reed data not present.")
        }
        try{
            int reedId = jdbcReedsDao.addReed(reed).getReedId();

            Map<String, Object> response = new HashMap<>();
            response.put("reedId", reedId);
            response.put("strength", )
        }
    }

}
