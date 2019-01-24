package com.biosec.verification.repository;

import com.biosec.verification.model.MasterRecord;
import org.springframework.data.repository.CrudRepository;

public interface MasterRecordRepository extends CrudRepository<MasterRecord, Long> {

    // TODO : add Method to search by enrollment id
    MasterRecord findFirstByEnrollmentId(String enrollmentId);
    // TODO : add Method to update a record by enrolment id



    //Update the record w
//    @Modifying
//    @Query("update MasterRecord u set u.batchId = :batchId,u.birthcountry = :birthcountry,u.birthdate = :birthdate" +
//            ",u.birthlga = :birthlga,u.birthstate = :birthstate,u.cardstatus = :cardstatus,u.centralID = :centralID" +
//            ",u.documentno = :documentno,u.educationallevel = :educationallevel,u.email = :email,u.emplymentstatus = :emplymentstatus" +
//            ",u.firstname = :firstname,u.gender = :gender,u.heigth = :heigth,u.maidenname = :maidenname" +
//            ",u.maritalstatus = :maritalstatus,u.middlename = :middlename,u.nin = :nin,u.nokAddress1 = :nokAddress1" +
//            ",u.nokAddress2 = :nokAddress2,u.nokFirstname = :nokFirstname,u.nokLga = :nokLga,u.nokMiddlename = :nokMiddlename" +
//            ",u.nokPostalcode = :nokPostalcode,u.nokState = :nokState,u.nokSurname = :nokSurname" +
//            ",u.nokTown = :nokTown,u.nspokenlang = :nspokenlang,u.ospokenlang = :ospokenlang,u.othername = :othername" +
//            ",u.pfirstname = :pfirstname,u.photo = :photo,u.pmiddlename = :pmiddlename,u.profession = :profession" +
//            ",u.psurname = :psurname,u.religion = :religion,u.residenceAdressLine1 = :residenceAdressLine1,u.residenceAdressLine2 = :residenceAdressLine2" +
//            ",u.residenceTown = :residenceTown,u.residenceLga = :residenceLga,u.residencePostalcode = :residencePostalcode,u.residenceState = :residenceState,u.residencestatus = :residencestatus" +
//            ",u.selfOriginLga = :selfOriginLga,u.selfOriginPlace = :selfOriginPlace,u.selfOriginState = :selfOriginState,u.signature = :signature " +
//            ",u.surname = :surname ,u.telephoneno = :telephoneno ,u.title = :title ,u.trackingId = :trackingId, u.hasNvsRecord = :hasNvsRecord, u.duplicate = :duplicate" +
//            "where u.enrollmentId = :enrollmentId")
//    int updateUserStatus(@Param("batchId") String batchId,
//                         @Param("birthcountry") String birthcountry,
//                         @Param("birthdate") String birthdate,
//                         @Param("birthlga") String birthlga,
//                         @Param("birthstate") String birthstate,
//                         @Param("cardstatus") String cardstatus,
//                         @Param("centralID") String centralID,
//                         @Param("documentno") String documentno,
//                         @Param("educationallevel") String educationallevel,
//                         @Param("email") String email, @Param("emplymentstatus") String emplymentstatus,
//                         @Param("firstname") String firstname,
//                         @Param("gender") String gender,
//                         @Param("heigth") String heigth,
//                         @Param("maidenname") String maidenname,
//                         @Param("maritalstatus") String maritalstatus,
//                         @Param("middlename") String middlename,
//                         @Param("nin") String nin,
//                         @Param("nokAddress1") String nokAddress1,
//                         @Param("nokAddress2") String nokAddress2,
//                         @Param("nokFirstname") String nokFirstname,
//                         @Param("nokLga") String nokLga,
//                         @Param("nokMiddlename") String nokMiddlename,
//                         @Param("nokPostalcode") String nokPostalcode,
//                         @Param("nokState") String nokState,
//                         @Param("nokSurname") String nokSurname,
//                         @Param("nokTown") String nokTown,
//                         @Param("nspokenlang") String nspokenlang,
//                         @Param("ospokenlang") String ospokenlang,
//                         @Param("othername") String othername,
//                         @Param("pfirstname") String pfirstname,
//                         @Param("photo") String photo,
//                         @Param("pmiddlename") String pmiddlename,
//                         @Param("profession") String profession,
//                         @Param("psurname") String psurname,
//                         @Param("religion") String religion,
//                         @Param("residenceAdressLine1") String residenceAdressLine1,
//                         @Param("residenceAdressLine2") String residenceAdressLine2,
//                         @Param("residenceTown") String residenceTown,
//                         @Param("residenceLga") String residenceLga,
//                         @Param("residencePostalcode") String residencePostalcode,
//                         @Param("residenceState") String residenceState,
//                         @Param("residencestatus") String residencestatus,
//                         @Param("selfOriginLga") String selfOriginLga,
//                         @Param("selfOriginPlace") String selfOriginPlace,
//                         @Param("selfOriginState") String selfOriginState,
//                         @Param("signature") String signature,
//                         @Param("surname") String surname,
//                         @Param("telephoneno") String telephoneno,
//                         @Param("title") String title,
//                         @Param("trackingId") String trackingId,
//                         @Param("hasNvsRecord") boolean hasNvsRecord,
//                         @Param("duplicate") boolean duplicate,
//                         @Param("enrollmentId") String enrollmentId);

    MasterRecord findByEnrollmentId(String enrollmentId);

}
