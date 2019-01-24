package com.biosec.verification.repository;

import com.biosec.verification.model.AliasRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AliasRepository extends CrudRepository<AliasRecord, Long> {
/*
*
* Responsible for saving and retrieving processed data from and into the Alias table
*
* */

    AliasRecord findFirstByEnrollmentId(String enrollmentId);


    List<AliasRecord> findByEnrollmentId(String enrollmentId);

//    List<AliasRecord> findByPersonalDetailsTitle(String title);

}
