package com.biosec.verification.model;



import com.biosec.verification.Utils.Constants;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = Constants.PERSONAL_DETAILS_TABLE)
public class PersonalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String title;
    private String firstName;
    private String middleName;
    private String previousMiddleName;
    private String otherNames;
    private String surName;
    private String previousSurName;
    private String maidenName;
    private String email;
    private String phone;
    private String gender;
    private String dob;
    private String stateOfBirth;
    private String countryOfBirth;
    private String dobVerification;
    private String enrolmentType;
    private String nin;
    private String photo;

//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "fingerlist_id")
//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinColumn(name="fingerlist_id")
//    @OrderBy
        @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
        @JoinColumn(name="finger_list")
        @OrderBy
        //@Size(min=2, max = 6)
        private Set<Finger> fingers;
    //private List<Finger> fingerList;

//    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinColumn(name = "record_id")
//    @OneToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = Constants.ALIAS_TABLE + "_id", nullable = false)
//    @OneToOne(mappedBy = "personalDetails")
//    private AliasRecord record;





    public PersonalDetails() {
    }

    public PersonalDetails(String title, String firstName, String middleName, String previousMiddleName, String otherNames, String surName, String previousSurName, String maidenName, String email, String phone, String gender,
                           String dob, String stateOfBirth, String countryOfBirth, String dobVerification, String enrolmentType, String nin, String photo, Set<Finger> fingers) {
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.previousMiddleName = previousMiddleName;
        this.otherNames = otherNames;
        this.surName = surName;
        this.previousSurName = previousSurName;
        this.maidenName = maidenName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.dob = dob;
        this.stateOfBirth = stateOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.dobVerification = dobVerification;
        this.enrolmentType = enrolmentType;
        this.nin = nin;
        this.photo = photo;
        this.fingers = fingers;
    }

    public Set<Finger> getFingers() {
        return fingers;
    }

    public void setFingers(Set<Finger> fingers) {
        this.fingers = fingers;
    }
    //
//    public AliasRecord getRecord() {
//        return record;
//    }
//
//    public void setRecord(AliasRecord record) {
//        this.record = record;
//    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPreviousMiddleName() {
        return previousMiddleName;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public String getSurName() {
        return surName;
    }

    public String getPreviousSurName() {
        return previousSurName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {

        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getStateOfBirth() {
        return stateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public String getDobVerification() {
        return dobVerification;
    }

    public String getEnrolmentType() {
        return enrolmentType;
    }

    public String getNin() {
        return nin;
    }





    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setPreviousMiddleName(String previousMiddleName) {
        this.previousMiddleName = previousMiddleName;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPreviousSurName(String previousSurName) {
        this.previousSurName = previousSurName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setStateOfBirth(String stateOfBirth) {
        this.stateOfBirth = stateOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public void setDobVerification(String dobVerification) {
        this.dobVerification = dobVerification;
    }

    public void setEnrolmentType(String enrolmentType) {
        this.enrolmentType = enrolmentType;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

//    public List<Finger> getFingerList() {
//        return fingerList;
//    }
//
//    public void setFingerList(List<Finger> fingerList) {
//        this.fingerList = fingerList;
//    }


    @Override
    public String toString() {
        return "PersonalDetails{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", previousMiddleName='" + previousMiddleName + '\'' +
                ", otherNames='" + otherNames + '\'' +
                ", surName='" + surName + '\'' +
                ", previousSurName='" + previousSurName + '\'' +
                ", maidenName='" + maidenName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", stateOfBirth='" + stateOfBirth + '\'' +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", dobVerification='" + dobVerification + '\'' +
                ", enrolmentType='" + enrolmentType + '\'' +
                ", nin='" + nin + '\'' +
                ", photo='" + photo + '\'' +
                ", fingers=" + fingers +
                '}';
    }
}
