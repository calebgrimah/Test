package com.biosec.verification.model;

import com.biosec.verification.Utils.Constants;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = Constants.NOK_TABLE)
public class NextOfKin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nextOfKinNIN;
    private String nextOfKinFirstName;
    private String nextOfKinMiddleName;
    private String nextOfKinLastName;
    private String relationToNextOfKin;
    private String nextOfKinLga;
    private String nextOfKinTown;
    private String nextOfKinState;
    private String nextOfKinCountry;
    private String nextOfKinAddress1;
    private String nextOfKinAddress2;
    private String nextOfKinPostalCode;




    public String getNextOfKinNIN() {
        return nextOfKinNIN;
    }

    public void setNextOfKinNIN(String nextOfKinNIN) {
        this.nextOfKinNIN = nextOfKinNIN;
    }

    public String getNextOfKinFirstName() {
        return nextOfKinFirstName;
    }

    public void setNextOfKinFirstName(String nextOfKinFirstName) {
        this.nextOfKinFirstName = nextOfKinFirstName;
    }

    public String getNextOfKinMiddleName() {
        return nextOfKinMiddleName;
    }

    public void setNextOfKinMiddleName(String nextOfKinMiddleName) {
        this.nextOfKinMiddleName = nextOfKinMiddleName;
    }

    public String getNextOfKinLastName() {
        return nextOfKinLastName;
    }

    public void setNextOfKinLastName(String nextOfKinLastName) {
        this.nextOfKinLastName = nextOfKinLastName;
    }

    public String getRelationToNextOfKin() {
        return relationToNextOfKin;
    }

    public void setRelationToNextOfKin(String relationToNextOfKin) {
        this.relationToNextOfKin = relationToNextOfKin;
    }

    public String getNextOfKinLga() {
        return nextOfKinLga;
    }

    public void setNextOfKinLga(String nextOfKinLga) {
        this.nextOfKinLga = nextOfKinLga;
    }

    public String getNextOfKinTown() {
        return nextOfKinTown;
    }

    public void setNextOfKinTown(String nextOfKinTown) {
        this.nextOfKinTown = nextOfKinTown;
    }

    public String getNextOfKinState() {
        return nextOfKinState;
    }

    public void setNextOfKinState(String nextOfKinState) {
        this.nextOfKinState = nextOfKinState;
    }

    public String getNextOfKinCountry() {
        return nextOfKinCountry;
    }

    public void setNextOfKinCountry(String nextOfKinCountry) {
        this.nextOfKinCountry = nextOfKinCountry;
    }

    public String getNextOfKinAddress1() {
        return nextOfKinAddress1;
    }

    public void setNextOfKinAddress1(String nextOfKinAddress1) {
        this.nextOfKinAddress1 = nextOfKinAddress1;
    }

    public String getNextOfKinAddress2() {
        return nextOfKinAddress2;
    }

    public void setNextOfKinAddress2(String nextOfKinAddress2) {
        this.nextOfKinAddress2 = nextOfKinAddress2;
    }

    public String getNextOfKinPostalCode() {
        return nextOfKinPostalCode;
    }

    public void setNextOfKinPostalCode(String nextOfKinPostalCode) {
        this.nextOfKinPostalCode = nextOfKinPostalCode;
    }

    public NextOfKin(String nextOfKinNIN, String nextOfKinFirstName, String nextOfKinMiddleName, String nextOfKinLastName, String relationToNextOfKin, String nextOfKinLga, String nextOfKinTown, String nextOfKinState,
                     String nextOfKinCountry, String nextOfKinAddress1, String nextOfKinAddress2, String nextOfKinPostalCode) {
        this.nextOfKinNIN = nextOfKinNIN;
        this.nextOfKinFirstName = nextOfKinFirstName;
        this.nextOfKinMiddleName = nextOfKinMiddleName;
        this.nextOfKinLastName = nextOfKinLastName;
        this.relationToNextOfKin = relationToNextOfKin;
        this.nextOfKinLga = nextOfKinLga;
        this.nextOfKinTown = nextOfKinTown;
        this.nextOfKinState = nextOfKinState;
        this.nextOfKinCountry = nextOfKinCountry;
        this.nextOfKinAddress1 = nextOfKinAddress1;
        this.nextOfKinAddress2 = nextOfKinAddress2;
        this.nextOfKinPostalCode = nextOfKinPostalCode;
    }

    public NextOfKin() {
    }

    @Override
    public String toString() {
        return "NextOfKin{" +
                "id=" + id +
                ", nextOfKinNIN='" + nextOfKinNIN + '\'' +
                ", nextOfKinFirstName='" + nextOfKinFirstName + '\'' +
                ", nextOfKinMiddleName='" + nextOfKinMiddleName + '\'' +
                ", nextOfKinLastName='" + nextOfKinLastName + '\'' +
                ", relationToNextOfKin='" + relationToNextOfKin + '\'' +
                ", nextOfKinLga='" + nextOfKinLga + '\'' +
                ", nextOfKinTown='" + nextOfKinTown + '\'' +
                ", nextOfKinState='" + nextOfKinState + '\'' +
                ", nextOfKinCountry='" + nextOfKinCountry + '\'' +
                ", nextOfKinAddress1='" + nextOfKinAddress1 + '\'' +
                ", nextOfKinAddress2='" + nextOfKinAddress2 + '\'' +
                ", nextOfKinPostalCode='" + nextOfKinPostalCode + '\'' +
                '}';
    }
}
