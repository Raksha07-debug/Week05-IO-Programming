package com.practiceproblem.mergetwojson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.File;

public class MergeTwoJsonFile {
    public static void main(String[] args) {
        ObjectMapper objectMapper=new ObjectMapper();
        try{
            JsonNode node1= objectMapper.readTree(new File("C:\\Week05\\Day02-JSON-Object\\JSON-Object\\src\\main\\resources\\example.json"));
            JsonNode node2=objectMapper.readTree(new File("C:\\Week05\\Day02-JSON-Object\\JSON-Object\\src\\main\\resources\\example2.json"));
            JSONObject json1 = new JSONObject(node1.toString());
            JSONObject json2 = new JSONObject(node2.toString());

            for (String key : json2.keySet()) {
                json1.put(key, json2.get(key));
            }

            System.out.println("Merged JSON: " + json1.toString(4));

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
