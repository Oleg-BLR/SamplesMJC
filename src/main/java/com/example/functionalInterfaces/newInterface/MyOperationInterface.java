package com.example.functionalInterfaces.newInterface;

import java.util.List;

@FunctionalInterface
public interface MyOperationInterface<T> {

    List<T> operate(List<T> myList);

}
