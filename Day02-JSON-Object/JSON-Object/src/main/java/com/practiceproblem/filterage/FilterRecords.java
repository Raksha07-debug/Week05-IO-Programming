package com.practiceproblem.filterage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilterRecords {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File("src/main/resources/people.json"));

            List<JsonNode> lists = new ArrayList<>();
            for (JsonNode node : rootNode) {
                if (node.has("age") && node.get("age").asInt() > 25) {
                    lists.add(node);
                }
            }

            System.out.println(lists);


        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
