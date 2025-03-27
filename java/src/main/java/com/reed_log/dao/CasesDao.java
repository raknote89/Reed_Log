package com.reed_log.dao;

import com.reed_log.model.Cases;

import java.util.List;

public interface CasesDao {

    List<Cases> getCases();

    Cases getCaseById(int caseId);

    Cases getCaseByName(String caseName);

    List<Cases> getReedsByCaseId (int caseId);

    List<Cases> getReedsByCaseName (String caseName);
}
