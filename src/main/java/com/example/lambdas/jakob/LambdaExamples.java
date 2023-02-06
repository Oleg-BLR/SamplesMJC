package com.example.lambdas.jakob;

import java.util.Comparator;
import java.util.function.Function;

public class LambdaExamples {
    public static void main(String[] args) {
//        Comparator<String> stringComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
////                return 100;
//                return o1.compareTo(o2);
//            }
//        };

//        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 4, 2, 8, 3));
//        System.out.println(integerList);
////        Collections.sort(integerList, new MyComparator<>().compare());
//        System.out.println(integerList);

//        int compare = stringComparator.compare("hello", "world");
//        System.out.println(compare);
//        System.out.println(stringComparator.compare("hello", "world"));

        Comparator<String> stringComparatorLambda =
                (String o1, String o2) -> {
                    return o1.compareTo(o2);
                };

        int limbdsComparison = stringComparatorLambda.compare("hello", "world");
        int limbdsComparison2 = stringComparatorLambda.compare("world", "hello");
        System.out.println(limbdsComparison);
        System.out.println(limbdsComparison2);

        Comparator<String> stringComparatorLambda2 =
                (o1, o2) -> o1.compareTo(o2);
        int limbdsComparison3 = stringComparatorLambda2.compare("world", "hello");
        System.out.println(limbdsComparison3);

        MyFunction myFunction = () -> {
            System.out.println("myFunction lambda expression");
        };

        myFunction.applyMyFunction();

        int e = 1;

        Function myFunctionFromFunction = (object) -> {
            System.out.println("myFunctionFromFunction implementation + " + object);
            return object;
        };

        myFunctionFromFunction.apply(e);
        System.out.println(myFunctionFromFunction.apply(e));

        Function myFunctionFromFunction2 = (object) -> {
            System.out.println("myFunctionFromFunction implementation + no use of object");
            return null;
        };


        myFunctionFromFunction2.apply(e);
        System.out.println(myFunctionFromFunction2.apply(e));

        MyFunctionWithOneParamrter myFunctionWithOneParamrter = textParameter -> System.out.println(textParameter);

        myFunctionWithOneParamrter.applyMyFunctionWithOneParameter("Use of MyFunctionWithOneParameter");

        MyFuncWithTwoIntParam myFuncWithTwoIntParam = (int1, int2) -> {
            return int1 * int2;
        };

        System.out.println(myFuncWithTwoIntParam.calculateOfMyFuncWithTwoParam(3, 6));

        MyFuncTwoStringParamReturnString myFuncTwoStringParamReturnString = (t1, t2) -> {
            return t1 + " + " + t2;
        };

        String returnValue = myFuncTwoStringParamReturnString.applyMyFuncTwoStringParamReturnString("rr", "dd");
        System.out.println(returnValue);
        System.out.println(myFuncTwoStringParamReturnString.applyMyFuncTwoStringParamReturnString("text1", "text2"));

        MyFuncWithTwoIntParam myFuncWithTwoIntParam02 = myFuncWithTwoIntParam;
        System.out.println(myFuncWithTwoIntParam02.calculateOfMyFuncWithTwoParam(2, 9));
        int f = myFuncWithTwoIntParam02.calculateOfMyFuncWithTwoParam(4, 9);
        System.out.println(f);

    }
}
