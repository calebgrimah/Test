package com.biosec.verification.model;

import javax.persistence.*;

@Entity
//Add table name for this class as master.
public class MasterRecord
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //nvs data + eid, pid
    private boolean hasNvsRecord;
    private boolean duplicate;
    private String enrollmentId;
    private String policeId;
    private String batchid;
    private String birthcountry;
    protected String birthdate;
    protected String birthlga;
    protected String birthstate;
    protected String cardstatus;
    protected String centralID;
    protected String documentno;
    protected String educationallevel;
    protected String email;
    protected String emplymentstatus;
    protected String firstname;
    protected String gender;
    protected String heigth;
    protected String maidenname;
    protected String maritalstatus;
    protected String middlename;
    protected String nin;
    protected String nokAddress1;
    protected String nokAddress2;
    protected String nokFirstname;
    protected String nokLga;
    protected String nokMiddlename;
    protected String nokPostalcode;
    protected String nokState;
    protected String nokSurname;
    protected String nokTown;
    protected String nspokenlang;
    protected String ospokenlang;
    protected String othername;
    protected String pfirstname;
    @Lob
    protected String photo;
    protected String pmiddlename;
    protected String profession;
    protected String psurname;
    protected String religion;
    protected String residenceAdressLine1;
    protected String residenceAdressLine2;
    protected String residenceTown;
    protected String residenceLga;
    protected String residencePostalcode;
    protected String residenceState;
    protected String residencestatus;
    protected String selfOriginLga;
    protected String selfOriginPlace;
    protected String selfOriginState;
    protected String signature;
    protected String surname;
    protected String telephoneno;
    protected String title;
    protected String trackingId;

    public MasterRecord() {
    }



    public MasterRecord(boolean hasNvsRecord, boolean duplicate, String enrollmentId, String policeId, String batchid, String birthcountry, String birthdate, String birthlga, String birthstate, String cardstatus, String centralID, String documentno, String educationallevel, String email, String emplymentstatus, String firstname, String gender, String heigth, String maidenname, String maritalstatus, String middlename, String nin, String nokAddress1, String nokAddress2, String nokFirstname, String nokLga, String nokMiddlename, String nokPostalcode, String nokState, String nokSurname, String nokTown, String nspokenlang, String ospokenlang, String othername, String pfirstname, String photo, String pmiddlename, String profession, String psurname, String religion, String residenceAdressLine1, String residenceAdressLine2, String residenceTown, String residenceLga, String residencePostalcode, String residenceState, String residencestatus, String selfOriginLga, String selfOriginPlace,
                        String selfOriginState, String signature, String surname, String telephoneno,
                        String title, String trackingId) {
        this.hasNvsRecord = hasNvsRecord;
        this.duplicate = duplicate;
        this.enrollmentId = enrollmentId;
        this.policeId = policeId;
        this.batchid = batchid;
        this.birthcountry = birthcountry;
        this.birthdate = birthdate;
        this.birthlga = birthlga;
        this.birthstate = birthstate;
        this.cardstatus = cardstatus;
        this.centralID = centralID;
        this.documentno = documentno;
        this.educationallevel = educationallevel;
        this.email = email;
        this.emplymentstatus = emplymentstatus;
        this.firstname = firstname;
        this.gender = gender;
        this.heigth = heigth;
        this.maidenname = maidenname;
        this.maritalstatus = maritalstatus;
        this.middlename = middlename;
        this.nin = nin;
        this.nokAddress1 = nokAddress1;
        this.nokAddress2 = nokAddress2;
        this.nokFirstname = nokFirstname;
        this.nokLga = nokLga;
        this.nokMiddlename = nokMiddlename;
        this.nokPostalcode = nokPostalcode;
        this.nokState = nokState;
        this.nokSurname = nokSurname;
        this.nokTown = nokTown;
        this.nspokenlang = nspokenlang;
        this.ospokenlang = ospokenlang;
        this.othername = othername;
        this.pfirstname = pfirstname;
        this.photo = photo;
        this.pmiddlename = pmiddlename;
        this.profession = profession;
        this.psurname = psurname;
        this.religion = religion;
        this.residenceAdressLine1 = residenceAdressLine1;
        this.residenceAdressLine2 = residenceAdressLine2;
        this.residenceTown = residenceTown;
        this.residenceLga = residenceLga;
        this.residencePostalcode = residencePostalcode;
        this.residenceState = residenceState;
        this.residencestatus = residencestatus;
        this.selfOriginLga = selfOriginLga;
        this.selfOriginPlace = selfOriginPlace;
        this.selfOriginState = selfOriginState;
        this.signature = signature;
        this.surname = surname;
        this.telephoneno = telephoneno;
        this.title = title;
        this.trackingId = trackingId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public String getBirthcountry() {
        return birthcountry;
    }

    public void setBirthcountry(String birthcountry) {
        this.birthcountry = birthcountry;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthlga() {
        return birthlga;
    }

    public void setBirthlga(String birthlga) {
        this.birthlga = birthlga;
    }

    public String getBirthstate() {
        return birthstate;
    }

    public void setBirthstate(String birthstate) {
        this.birthstate = birthstate;
    }

    public String getCardstatus() {
        return cardstatus;
    }

    public void setCardstatus(String cardstatus) {
        this.cardstatus = cardstatus;
    }

    public String getCentralID() {
        return centralID;
    }

    public void setCentralID(String centralID) {
        this.centralID = centralID;
    }

    public String getDocumentno() {
        return documentno;
    }

    public void setDocumentno(String documentno) {
        this.documentno = documentno;
    }

    public String getEducationallevel() {
        return educationallevel;
    }

    public void setEducationallevel(String educationallevel) {
        this.educationallevel = educationallevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmplymentstatus() {
        return emplymentstatus;
    }

    public void setEmplymentstatus(String emplymentstatus) {
        this.emplymentstatus = emplymentstatus;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeigth() {
        return heigth;
    }

    public void setHeigth(String heigth) {
        this.heigth = heigth;
    }

    public String getMaidenname() {
        return maidenname;
    }

    public void setMaidenname(String maidenname) {
        this.maidenname = maidenname;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public String getNokAddress1() {
        return nokAddress1;
    }

    public void setNokAddress1(String nokAddress1) {
        this.nokAddress1 = nokAddress1;
    }

    public String getNokAddress2() {
        return nokAddress2;
    }

    public void setNokAddress2(String nokAddress2) {
        this.nokAddress2 = nokAddress2;
    }

    public String getNokFirstname() {
        return nokFirstname;
    }

    public void setNokFirstname(String nokFirstname) {
        this.nokFirstname = nokFirstname;
    }

    public String getNokLga() {
        return nokLga;
    }

    public void setNokLga(String nokLga) {
        this.nokLga = nokLga;
    }

    public String getNokMiddlename() {
        return nokMiddlename;
    }

    public void setNokMiddlename(String nokMiddlename) {
        this.nokMiddlename = nokMiddlename;
    }

    public String getNokPostalcode() {
        return nokPostalcode;
    }

    public void setNokPostalcode(String nokPostalcode) {
        this.nokPostalcode = nokPostalcode;
    }

    public String getNokState() {
        return nokState;
    }

    public void setNokState(String nokState) {
        this.nokState = nokState;
    }

    public String getNokSurname() {
        return nokSurname;
    }

    public void setNokSurname(String nokSurname) {
        this.nokSurname = nokSurname;
    }

    public String getNokTown() {
        return nokTown;
    }

    public void setNokTown(String nokTown) {
        this.nokTown = nokTown;
    }

    public String getNspokenlang() {
        return nspokenlang;
    }

    public void setNspokenlang(String nspokenlang) {
        this.nspokenlang = nspokenlang;
    }

    public String getOspokenlang() {
        return ospokenlang;
    }

    public void setOspokenlang(String ospokenlang) {
        this.ospokenlang = ospokenlang;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public String getPfirstname() {
        return pfirstname;
    }

    public void setPfirstname(String pfirstname) {
        this.pfirstname = pfirstname;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPmiddlename() {
        return pmiddlename;
    }

    public void setPmiddlename(String pmiddlename) {
        this.pmiddlename = pmiddlename;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPsurname() {
        return psurname;
    }

    public void setPsurname(String psurname) {
        this.psurname = psurname;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getResidenceAdressLine1() {
        return residenceAdressLine1;
    }

    public void setResidenceAdressLine1(String residenceAdressLine1) {
        this.residenceAdressLine1 = residenceAdressLine1;
    }

    public String getResidenceAdressLine2() {
        return residenceAdressLine2;
    }

    public void setResidenceAdressLine2(String residenceAdressLine2) {
        this.residenceAdressLine2 = residenceAdressLine2;
    }

    public String getResidenceTown() {
        return residenceTown;
    }

    public void setResidenceTown(String residenceTown) {
        this.residenceTown = residenceTown;
    }

    public String getResidenceLga() {
        return residenceLga;
    }

    public void setResidenceLga(String residenceLga) {
        this.residenceLga = residenceLga;
    }

    public String getResidencePostalcode() {
        return residencePostalcode;
    }

    public void setResidencePostalcode(String residencePostalcode) {
        this.residencePostalcode = residencePostalcode;
    }

    public String getResidenceState() {
        return residenceState;
    }

    public void setResidenceState(String residenceState) {
        this.residenceState = residenceState;
    }

    public String getResidencestatus() {
        return residencestatus;
    }

    public void setResidencestatus(String residencestatus) {
        this.residencestatus = residencestatus;
    }

    public String getSelfOriginLga() {
        return selfOriginLga;
    }

    public void setSelfOriginLga(String selfOriginLga) {
        this.selfOriginLga = selfOriginLga;
    }

    public String getSelfOriginPlace() {
        return selfOriginPlace;
    }

    public void setSelfOriginPlace(String selfOriginPlace) {
        this.selfOriginPlace = selfOriginPlace;
    }

    public String getSelfOriginState() {
        return selfOriginState;
    }

    public void setSelfOriginState(String selfOriginState) {
        this.selfOriginState = selfOriginState;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephoneno() {
        return telephoneno;
    }

    public void setTelephoneno(String telephoneno) {
        this.telephoneno = telephoneno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getPoliceId() {
        return policeId;
    }

    public void setPoliceId(String policeId) {
        this.policeId = policeId;
    }

    public boolean isHasNvsRecord() {
        return hasNvsRecord;
    }

    public void setHasNvsRecord(boolean hasNvsRecord) {
        this.hasNvsRecord = hasNvsRecord;
    }

    public boolean isDuplicate() {
        return duplicate;
    }

    public void setDuplicate(boolean duplicate) {
        this.duplicate = duplicate;
    }
}
