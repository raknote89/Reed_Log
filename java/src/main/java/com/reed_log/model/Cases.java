package com.reed_log.model;

public class Cases {

    private int caseId;

    private String caseName;

    private int slot;

    private int reedId;

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getReedId() {
        return reedId;
    }

    public void setReedId(int reedId) {
        this.reedId = reedId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public Cases(int caseId, String caseName, int slot, int reedId) {
        this.caseId = caseId;
        this.caseName = caseName;
        this.slot = slot;
        this.reedId = reedId;
    }

}
