package com.biosec.verification.repository;

import com.biosec.verification.model.PersonalDetails;
import org.springframework.data.repository.CrudRepository;

public interface PersonalDetailsRepository extends CrudRepository<PersonalDetails, Long> {
}
