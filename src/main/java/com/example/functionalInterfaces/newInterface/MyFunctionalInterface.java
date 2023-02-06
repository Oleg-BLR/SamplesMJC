package com.example.functionalInterfaces.newInterface;

import java.util.List;
import java.util.Map;

public interface MyFunctionalInterface <K, V>{

    //    Map<T>
    Map<K, V> myFunction(List<K> listForFunctiionKeys, List<V> listForFunctionValues);

}
