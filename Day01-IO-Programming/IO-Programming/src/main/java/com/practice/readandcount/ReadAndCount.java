package com.practice.readandcount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndCount {
    public static void main(String[] args) {

        String filePath = "C:\\Week05\\Day01-IO-Programming\\IO-Programming\\src\\main\\resources\\readcount.csv";
        System.out.println(countRow(filePath));
    }

    public static int countRow(String path) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
