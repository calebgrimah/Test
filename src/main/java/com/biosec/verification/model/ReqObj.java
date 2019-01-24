package com.biosec.verification.model;

public class ReqObj {

    private String enrollmentId;

    public ReqObj(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public ReqObj() {
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }
}
