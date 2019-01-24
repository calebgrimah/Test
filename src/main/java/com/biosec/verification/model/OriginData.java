package com.biosec.verification.model;


import com.biosec.verification.Utils.Constants;
import org.apache.tomcat.util.bcel.Const;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = Constants.ORIGIN_DATA)
public class OriginData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String country;
    private String state;
    private String lga;
    private String fatherNIN;
    private String fatherFirstName;
    private String fatherMiddleName;
    private String fatherLastName;
    private String fatherTown;
    private String fatherState;
    private String fatherCountry;
    private String fatherLga;
    private String motherNIN;
    private String motherFirstName;
    private String motherMiddleName;
    private String motherLastName;
    private String motherMaidenName;
    private String motherTown;
    private String motherState;
    private String motherCountry;
    private String guardianNIN;
    private String guardianFirstName;
    private String guardianMiddleName;
    private String guardianLastName;
    private String guardianSurname;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public String getFatherNIN() {
        return fatherNIN;
    }

    public void setFatherNIN(String fatherNIN) {
        this.fatherNIN = fatherNIN;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getFatherMiddleName() {
        return fatherMiddleName;
    }

    public void setFatherMiddleName(String fatherMiddleName) {
        this.fatherMiddleName = fatherMiddleName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getFatherTown() {
        return fatherTown;
    }

    public void setFatherTown(String fatherTown) {
        this.fatherTown = fatherTown;
    }

    public String getFatherState() {
        return fatherState;
    }

    public void setFatherState(String fatherState) {
        this.fatherState = fatherState;
    }

    public String getFatherCountry() {
        return fatherCountry;
    }

    public void setFatherCountry(String fatherCountry) {
        this.fatherCountry = fatherCountry;
    }

    public String getFatherLga() {
        return fatherLga;
    }

    public void setFatherLga(String fatherLga) {
        this.fatherLga = fatherLga;
    }

    public String getMotherNIN() {
        return motherNIN;
    }

    public void setMotherNIN(String motherNIN) {
        this.motherNIN = motherNIN;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    public void setMotherMaidenName(String motherMaidenName) {
        this.motherMaidenName = motherMaidenName;
    }

    public String getMotherTown() {
        return motherTown;
    }

    public void setMotherTown(String motherTown) {
        this.motherTown = motherTown;
    }

    public String getMotherState() {
        return motherState;
    }

    public void setMotherState(String motherState) {
        this.motherState = motherState;
    }

    public String getMotherCountry() {
        return motherCountry;
    }

    public void setMotherCountry(String motherCountry) {
        this.motherCountry = motherCountry;
    }

    public String getGuardianNIN() {
        return guardianNIN;
    }

    public void setGuardianNIN(String guardianNIN) {
        this.guardianNIN = guardianNIN;
    }

    public String getGuardianFirstName() {
        return guardianFirstName;
    }

    public void setGuardianFirstName(String guardianFirstName) {
        this.guardianFirstName = guardianFirstName;
    }

    public String getGuardianMiddleName() {
        return guardianMiddleName;
    }

    public void setGuardianMiddleName(String guardianMiddleName) {
        this.guardianMiddleName = guardianMiddleName;
    }

    public String getGuardianLastName() {
        return guardianLastName;
    }

    public void setGuardianLastName(String guardianLastName) {
        this.guardianLastName = guardianLastName;
    }

    public String getGuardianSurname() {
        return guardianSurname;
    }

    public void setGuardianSurname(String guardianSurname) {
        this.guardianSurname = guardianSurname;
    }

    public OriginData(String country, String state, String lga, String fatherNIN, String fatherFirstName, String fatherMiddleName, String fatherLastName, String fatherTown, String fatherState, String fatherCountry, String fatherLga, String motherNIN, String motherFirstName, String motherMiddleName, String motherLastName, String motherMaidenName, String motherTown, String motherState, String motherCountry, String guardianNIN, String guardianFirstName,
                      String guardianMiddleName, String guardianLastName, String guardianSurname) {
        this.country = country;
        this.state = state;
        this.lga = lga;
        this.fatherNIN = fatherNIN;
        this.fatherFirstName = fatherFirstName;
        this.fatherMiddleName = fatherMiddleName;
        this.fatherLastName = fatherLastName;
        this.fatherTown = fatherTown;
        this.fatherState = fatherState;
        this.fatherCountry = fatherCountry;
        this.fatherLga = fatherLga;
        this.motherNIN = motherNIN;
        this.motherFirstName = motherFirstName;
        this.motherMiddleName = motherMiddleName;
        this.motherLastName = motherLastName;
        this.motherMaidenName = motherMaidenName;
        this.motherTown = motherTown;
        this.motherState = motherState;
        this.motherCountry = motherCountry;
        this.guardianNIN = guardianNIN;
        this.guardianFirstName = guardianFirstName;
        this.guardianMiddleName = guardianMiddleName;
        this.guardianLastName = guardianLastName;
        this.guardianSurname = guardianSurname;
    }

    public OriginData() {
    }

    @Override
    public String toString() {
        return "OriginData{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", lga='" + lga + '\'' +
                ", fatherNIN='" + fatherNIN + '\'' +
                ", fatherFirstName='" + fatherFirstName + '\'' +
                ", fatherMiddleName='" + fatherMiddleName + '\'' +
                ", fatherLastName='" + fatherLastName + '\'' +
                ", fatherTown='" + fatherTown + '\'' +
                ", fatherState='" + fatherState + '\'' +
                ", fatherCountry='" + fatherCountry + '\'' +
                ", fatherLga='" + fatherLga + '\'' +
                ", motherNIN='" + motherNIN + '\'' +
                ", motherFirstName='" + motherFirstName + '\'' +
                ", motherMiddleName='" + motherMiddleName + '\'' +
                ", motherLastName='" + motherLastName + '\'' +
                ", motherMaidenName='" + motherMaidenName + '\'' +
                ", motherTown='" + motherTown + '\'' +
                ", motherState='" + motherState + '\'' +
                ", motherCountry='" + motherCountry + '\'' +
                ", guardianNIN='" + guardianNIN + '\'' +
                ", guardianFirstName='" + guardianFirstName + '\'' +
                ", guardianMiddleName='" + guardianMiddleName + '\'' +
                ", guardianLastName='" + guardianLastName + '\'' +
                ", guardianSurname='" + guardianSurname + '\'' +
                '}';
    }
}
