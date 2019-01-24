package com.biosec.verification.model;

import com.biosec.verification.Utils.Constants;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = Constants.PERSONAL_DATA_TABLE)
public class PersonalData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String height;
    private String religion;
    private String education;
    private String homeLess;
    private String nativeLanguage;
    private String languageReadWrite;
    private String otherKnownLanguages;
    private String address1;
    private String address2;
    private String postalCode;
    private String maritalStatus;
    private String residenceStatus;
    private String employmentStatus;
    private String lga;


    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHomeLess() {
        return homeLess;
    }

    public void setHomeLess(String homeLess) {
        this.homeLess = homeLess;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public String getLanguageReadWrite() {
        return languageReadWrite;
    }

    public void setLanguageReadWrite(String languageReadWrite) {
        this.languageReadWrite = languageReadWrite;
    }

    public String getOtherKnownLanguages() {
        return otherKnownLanguages;
    }

    public void setOtherKnownLanguages(String otherKnownLanguages) {
        this.otherKnownLanguages = otherKnownLanguages;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getResidenceStatus() {
        return residenceStatus;
    }

    public void setResidenceStatus(String residenceStatus) {
        this.residenceStatus = residenceStatus;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public PersonalData(String height, String religion, String education, String homeLess, String nativeLanguage, String languageReadWrite, String otherKnownLanguages, String address1, String address2, String postalCode,
                        String maritalStatus, String residenceStatus, String employmentStatus, String lga) {
        this.height = height;
        this.religion = religion;
        this.education = education;
        this.homeLess = homeLess;
        this.nativeLanguage = nativeLanguage;
        this.languageReadWrite = languageReadWrite;
        this.otherKnownLanguages = otherKnownLanguages;
        this.address1 = address1;
        this.address2 = address2;
        this.postalCode = postalCode;
        this.maritalStatus = maritalStatus;
        this.residenceStatus = residenceStatus;
        this.employmentStatus = employmentStatus;
        this.lga = lga;
    }

    public PersonalData() {
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "id=" + id +
                ", height='" + height + '\'' +
                ", religion='" + religion + '\'' +
                ", education='" + education + '\'' +
                ", homeLess='" + homeLess + '\'' +
                ", nativeLanguage='" + nativeLanguage + '\'' +
                ", languageReadWrite='" + languageReadWrite + '\'' +
                ", otherKnownLanguages='" + otherKnownLanguages + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", residenceStatus='" + residenceStatus + '\'' +
                ", employmentStatus='" + employmentStatus + '\'' +
                ", lga='" + lga + '\'' +
                '}';
    }
}
