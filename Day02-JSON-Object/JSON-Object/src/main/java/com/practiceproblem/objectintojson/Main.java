package com.practiceproblem.objectintojson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<Car> cars = new ArrayList<>();
            cars.add(new Car("Rolls Roycce", "sports", 1998));
            cars.add(new Car("TATA", "curv", 2024));
            cars.add(new Car("Tesla", "xvii", 2007));


            ObjectMapper objectMapper = new ObjectMapper();
            String jsonArray = objectMapper.writeValueAsString(cars);

            objectMapper.writeValue(new File("src/main/resources/objectList.json"), cars);

            System.out.println(jsonArray);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
