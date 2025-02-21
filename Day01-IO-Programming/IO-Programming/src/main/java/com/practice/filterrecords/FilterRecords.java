package com.practice.filterrecords;

import org.apache.commons.collections.Buffer;

import java.io.*;

public class FilterRecords {
    public static void main(String[] args) {
        String filePath = "src\\main\\resources\\input.csv";
        System.out.println(filterrecord(filePath));

    }

    public static String filterrecord(String path) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String columns[] = line.split(",");
                if (Integer.parseInt(columns[3]) > 80) {
                    sb.append("ID-" + columns[0] + "  Name-" + columns[1] + "  Age-" + columns[2] + "  Marks-" + columns[3] + "\n");
                }

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return sb.toString();

    }
}