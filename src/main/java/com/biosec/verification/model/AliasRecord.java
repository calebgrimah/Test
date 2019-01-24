package com.biosec.verification.model;

import com.biosec.verification.Utils.Constants;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = Constants.ALIAS_TABLE)
public class AliasRecord
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String policeId;
    private String enrollmentId;
    @NotNull
    private boolean isVerified;
    //processed or unprocessed
    @NotEmpty(message = "status not set")
    private String status;

   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinColumn(name = "personal_details_id")
    private PersonalDetails personalDetails;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "personal_data_id")
    private PersonalData personalData;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "origin_data_id")
    private OriginData originData;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "next_of_kin_id")
    private NextOfKin nextOfKin;

    public AliasRecord() {
    }

    public AliasRecord(String policeId, String enrollmentId, @NotNull boolean isVerified, @NotEmpty(message = "status not set") String status) {
        this.policeId = policeId;
        this.enrollmentId = enrollmentId;
        this.isVerified = isVerified;
        this.status = status;
    }

    public AliasRecord(String policeId, String enrollmentId, @NotNull boolean isVerified, @NotEmpty(message = "status not set") String status, PersonalDetails personalDetails,
                       PersonalData personalData, OriginData originData, NextOfKin nextOfKin) {
        this.policeId = policeId;
        this.enrollmentId = enrollmentId;
        this.isVerified = isVerified;
        this.status = status;
        this.personalDetails = personalDetails;
        this.personalData = personalData;
        this.originData = originData;
        this.nextOfKin = nextOfKin;
    }

    public String getPoliceId() {
        return policeId;
    }

    public void setPoliceId(String policeId) {
        this.policeId = policeId;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public OriginData getOriginData() {
        return originData;
    }

    public void setOriginData(OriginData originData) {
        this.originData = originData;
    }

    public NextOfKin getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(NextOfKin nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    private String generatePoliceId() {
        //create pid for the record -> Check db that contains all generated pid's
        // -> if its unique then add the pid to the record else generate another

        //responsible for creating police IDs.
        //this creates a random suspect id
        long number = (long) Math.floor(Math.random() * 9_000_000_0000L) + 1_000_000_0000L;


        String value = String.valueOf(number);
//        String value = RandomStringUtils.random(11);
        System.out.println("Random Val");
        System.out.println(value);
        return value;
    }

    @Override
    public String toString() {
        return "AliasRecord{" +
                "id=" + id +
                ", policeId='" + policeId + '\'' +
                ", enrollmentId='" + enrollmentId + '\'' +
                ", isVerified=" + isVerified +
                ", status='" + status + '\'' +
                ", personalDetails=" + personalDetails +
                ", personalData=" + personalData +
                ", originData=" + originData +
                ", nextOfKin=" + nextOfKin +
                '}';
    }
}
