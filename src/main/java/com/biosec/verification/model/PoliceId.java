//package com.biosec.verification.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class PoliceId {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private boolean isDuplicate;
//    private String policeId;
//    private String dateCreated;
//
//    public PoliceId() {
//    }
//
//    public PoliceId(boolean isDuplicate, String policeId, String dateCreated) {
//        this.isDuplicate = isDuplicate;
//        this.policeId = policeId;
//        this.dateCreated = dateCreated;
//    }
//
//    public boolean isDuplicate() {
//        return isDuplicate;
//    }
//
//    public void setDuplicate(boolean duplicate) {
//        isDuplicate = duplicate;
//    }
//
//    public String getPoliceId() {
//        return policeId;
//    }
//
//    public void setPoliceId(String policeId) {
//        this.policeId = policeId;
//    }
//
//    public String getDateCreated() {
//        return dateCreated;
//    }
//
//    public void setDateCreated(String dateCreated) {
//        this.dateCreated = dateCreated;
//    }
//}
