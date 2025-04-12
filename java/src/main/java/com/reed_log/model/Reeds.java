package com.reed_log.model;

import java.util.Date;

public class Reeds {

    private int reedId;

    private double hardness;

    private Date dateOpened;

    public int getReedId() {
        return reedId;
    }

    public void setReedId(int reedId) {
        this.reedId = reedId;
    }

    public double getHardness() {
        return hardness;
    }

    public void setHardness(double hardness) {
        this.hardness = hardness;
    }

    public Date getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(Date dateOpened) {
        this.dateOpened = dateOpened;
    }

    public Reeds(int reedId, double hardness, Date dateOpened) {
        this.reedId = reedId;
        this.hardness = hardness;
        this.dateOpened = dateOpened;
    }

    public Reeds(){}
}
