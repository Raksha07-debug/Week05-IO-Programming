package com.practiceproblem.validatejsonschema;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;

import java.io.File;

public class ValidateJsonSchema {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonData = objectMapper.readTree(new File("src/main/resources/example.json"));
            JsonNode schemaNode = JsonLoader.fromFile(new File("src/main/resources/emailSchema.json"));

            JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonSchema schema = factory.getJsonSchema(schemaNode);

            if (schema.validate(jsonData).isSuccess()) {
                System.out.println("JSON is valid!");
            } else {
                System.out.println("Invalid JSON!");
            }
        } catch (Exception e) {
            // Handle any exceptions that may occur during the validation process
            System.out.println("Exception caught! " + e.getMessage());
        }
    }
}