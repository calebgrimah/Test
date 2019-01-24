package com.biosec.verification.model;

import java.util.List;

public class EnrollmentVerificationResponse {

    private List<MasterRecord> masterRecords;
    private List<AliasRecord> aliasRecords;

    public EnrollmentVerificationResponse() {
    }

    public List<MasterRecord> getMasterRecords() {
        return masterRecords;
    }

    public void setMasterRecords(List<MasterRecord> masterRecords) {
        this.masterRecords = masterRecords;
    }

    public List<AliasRecord> getAliasRecords() {
        return aliasRecords;
    }

    public void setAliasRecords(List<AliasRecord> aliasRecords) {
        this.aliasRecords = aliasRecords;
    }
}
