package com.example.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ParseProfileDataFromStringToMap {

    public static void main(String[] args) {
//        parseProfileDataFromStringToMap("Name= Anna\n" + "Age");
//        parseProfileDataFromStringToMap("Name= Anna\n + Age");
//        parseProfileDataFromStringToMap("Name: Anna\n" +
//                "Age: 25\n" +
//                "Email: anna@mailserver.com\n" +
//                "Phone: 1234567890");
        System.out.println(parseProfileDataFromStringToMap("Name: Anna\n" +
                "Age: 25\n" +
                "Email: anna@mailserver.com\n" +
                "Phone: 1234567890"));
    }

    private static Map<String, String> parseProfileDataFromStringToMap(String stringAsMap) {
        return Arrays.stream(stringAsMap.split(","))
                .map(entry -> entry.split(":"))
                .collect(Collectors.toMap(entry -> entry[0], entry -> entry[1]));
    }


}
