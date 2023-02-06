package com.example.functionalInterfaces.newInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyRealisationOfMyOperationInterface {

    public static void main(String[] args) {
        List<Integer> myInitialList = new ArrayList<>(Arrays.asList(2, 4, 7, 9));

        MyRealisationOfMyOperationInterface myRealisationOfMyOperationInterface = new MyRealisationOfMyOperationInterface();
        System.out.println(myRealisationOfMyOperationInterface.myMethodWithInterface().operate(myInitialList));
    }

    public MyOperationInterface<Integer> myMethodWithInterface() {

        MyOperationInterface<Integer> varName = list ->
                list.stream().map(e -> (int) Math.pow(2, e)).collect(Collectors.toList());
        return varName;
    }

    public MyFunctionalInterface<String, Integer> myMethodOfFunctionalInterface() {
//        return (k, v) -> k.stream().collect(Collectors.toMap());

//        return (k, v) -> Stream.concat(k.stream(), v.stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        return (k, v) -> Stream.concat(k.stream(), v.stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return null;
    }


}
