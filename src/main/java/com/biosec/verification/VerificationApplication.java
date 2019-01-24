package com.biosec.verification;

import com.biosec.verification.model.AliasRecord;
import com.biosec.verification.model.PersonalDetails;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.reinert.jjschema.v1.JsonSchemaFactory;
import com.github.reinert.jjschema.v1.JsonSchemaV4Factory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VerificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(VerificationApplication.class, args);


//        JsonSchemaFactory schemaFactory = new JsonSchemaV4Factory();
//        schemaFactory.setAutoPutDollarSchema(true);
//        JsonNode aliasSchema = schemaFactory.createSchema(PersonalDetails.class);
//        System.out.println(aliasSchema);
    }

}

