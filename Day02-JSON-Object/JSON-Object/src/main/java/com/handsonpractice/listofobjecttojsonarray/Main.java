package com.handsonpractice.listofobjecttojsonarray;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ForwardingIterator;
import com.practiceproblem.convertlisttojsonarray.Car;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            List<com.practiceproblem.convertlisttojsonarray.Car> cars= new ArrayList<>();
            cars.add(new com.practiceproblem.convertlisttojsonarray.Car("BMW", "M5", 2024));
            cars.add(new com.practiceproblem.convertlisttojsonarray.Car("Audi", "A6", 2023));
            cars.add(new Car("Tesla", "Model S", 2022));
            ObjectMapper objectMapper= new ObjectMapper();
            String jsonArray = objectMapper.writeValueAsString(cars);

            objectMapper.writeValue(new File("src/main/resources/objectList.json"), cars);

            System.out.println(jsonArray);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


