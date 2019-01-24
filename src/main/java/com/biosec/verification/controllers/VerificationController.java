package com.biosec.verification.controllers;


import com.biosec.verification.model.*;
import com.biosec.verification.repository.AliasRepository;
import com.biosec.verification.repository.MasterRecordRepository;
import com.biosec.verification.repository.PersonalDetailsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class VerificationController {
    private AliasRepository aliasRepository;
    private MasterRecordRepository recordRepository;
    private PersonalDetailsRepository personalDetailsRepository;

    public VerificationController(AliasRepository aliasRepository, MasterRecordRepository recordRepository, PersonalDetailsRepository personalDetailsRepository) {
        this.aliasRepository = aliasRepository;
        this.recordRepository = recordRepository;
        this.personalDetailsRepository = personalDetailsRepository;
    }

    //create master records
    @PostMapping(value = "/record/master",consumes="application/json", produces = "application/json")
    public ResponseEntity<?> createMasterRecord (@Valid @RequestBody MasterRecord record){
        if(record == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        recordRepository.save(record);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //create alias records
    @PostMapping(value = "/record/alias",consumes="application/json", produces = "application/json")
    public ResponseEntity<?> createAliasRecord (@Valid @RequestBody AliasRecord record){
        if(record == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        aliasRepository.save(record);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    //receives the finger data in form of a json object and returns
    @PostMapping(value = "/record",consumes="application/json")
    public ResponseEntity<?> eid(@RequestBody ReqObj enrollmentId) {
        //return data from nvs table (master) and list of data from police db (alias)
        if(enrollmentId == null){
            return new ResponseEntity<>("Check enrollment ID",HttpStatus.BAD_REQUEST);
        }
        List<MasterRecord> masterRecords = new ArrayList<>();
//        MasterRecord masterRecord = recordRepository.findFirstByEnrollmentId(enrollmentId);
        MasterRecord masterRecord = recordRepository.findByEnrollmentId(enrollmentId.getEnrollmentId());
        System.out.println("Master Records");
        System.out.println(masterRecord);
        masterRecords.add(masterRecord);
        //Check alias table
        List<AliasRecord> record = aliasRepository.findByEnrollmentId(enrollmentId.getEnrollmentId());
        // System.out.println(record);
        if(masterRecord == null && record.isEmpty()){
            return new ResponseEntity<>("Master and Alias Records not found",HttpStatus.NOT_FOUND);
        }else {
            //Response to the user containing the nvs and abis response
            EnrollmentVerificationResponse enrollmentVerificationResponse
                    = new EnrollmentVerificationResponse();
            enrollmentVerificationResponse.setAliasRecords(record);
            enrollmentVerificationResponse.setMasterRecords(masterRecords);
//            PidRecord record = cpmGatewayService.fetchUserWithFinger(data.getFingerData());
            //PersonalDetails details = record.getCriminalData().getPersonalDetails();
            //
//            VerificationResp verificationResp = new VerificationResp();
//            verificationResp.setDetails(details);
//            //find case IDs associated with this enrollmentID
//            List<CaseIDRecord> caseIDRecordList = caseIDRecordRepository.
//                    findByEnrollmentId(record.getCriminalData().getEnrollmentId());
//            verificationResp.setCaseIDRecords(caseIDRecordList);
//
//            if(record == null){
//                //user does not exist
//                return new ResponseEntity<>("UsernotFound",HttpStatus.NOT_FOUND);
//            }
            //return personal details and caseIds
            return new ResponseEntity<>(enrollmentVerificationResponse,HttpStatus.OK);
        }

    }


    @PostMapping(value = "/record/something",consumes="application/json")
    public ResponseEntity<?> something(@RequestBody ReqObj something){
        String val = "Something, Something borrowed";
        if(something == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(val,HttpStatus.OK);

    }


}
