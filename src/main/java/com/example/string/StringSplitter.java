package com.example.string;

import java.util.*;

public class StringSplitter {

    /* @return List of substrings
     */

    public static void main(String[] args) {
        String myString = "My str@ing to split by deli]miters";
        StringSplitter stringSplitter = new StringSplitter();
        Collection<String> myDelimiter1 = new ArrayList<>(Collections.singleton("@ ]"));
        Collection<String> myDelimiter = List.of(new String[]{"@ ]"});
        Collection<String> myDelimiter3 = List.of("@ ]");
//        System.out.println(stringSplitter.splitByDelimiters(myString, myDelimiter));
        List<String> myResult = new ArrayList<>();
        myResult = stringSplitter.splitByDelimiters(myString, myDelimiter3);
        System.out.println(myResult);
        System.out.println(myDelimiter.toString());
        System.out.println(myDelimiter);

    }

    public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
//        StringTokenizer stringTokenizer = new StringTokenizer(source, delimiters.toString());
        StringTokenizer stringTokenizer = new StringTokenizer(source, delimiters.toString());
        List<String> result = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            result.add(stringTokenizer.nextToken());
        }
//        System.out.println(result);
//        System.out.println(result.get(2));
        return result;
    }

}