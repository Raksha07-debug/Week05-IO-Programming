package com.practiceproblem.readjsonfile;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
public class ReadJson {
    public static void main(String[] args) {

        ObjectMapper  objectMapper= new ObjectMapper();
        try {
            JsonNode rootNode = objectMapper.readTree(new File("C:\\Week05\\Day02-JSON-Object\\JSON-Object\\src\\main\\resources\\example.json"));
            rootNode.fields().forEachRemaining(entry ->
                    System.out.println(entry.getKey() + " : " + entry.getValue().asText())
            );
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
