//package com.example.exceptions;
//
//import org.testng.annotations.Test;
//
//import static org.testng.Assert.assertEquals;
//
//public class StackTraceUsingThrowableDemoTest {
//    @Test
//    public void whenElementIsFecthedUsingThrowable_thenCorrectMethodAndClassIsReturned() {
//        StackTraceElement[] stackTrace = new main.java.com.example.exceptions.StackTraceUsingThrowableDemo().methodA();
//
//        StackTraceElement elementZero = stackTrace[0];
//        assertEquals("main.java.com.example.exceptions.StackTraceUsingThrowableDemo", elementZero.getClassName());
//        assertEquals("methodB", elementZero.getMethodName());
//
//        StackTraceElement elementOne = stackTrace[1];
//        assertEquals("main.java.com.example.exceptions.StackTraceUsingThrowableDemo", elementOne.getClassName());
//        assertEquals("methodA", elementOne.getMethodName());
//
////        StackTraceElement elementThree = stackTrace[2];
////        assertEquals("com.example.exceptions.CurrentStacktraceDemoUnitTest", elementThree.getClassName());
////        assertEquals("whenElementIsFecthedUsingThrowable_thenCorrectMethodAndClassIsReturned", elementThree.getMethodName());
//
//        StackTraceElement elementThree = stackTrace[2];
//        assertEquals("com.example.exceptions.StackTraceUsingThrowableDemoTest", elementThree.getClassName());
//        assertEquals("whenElementIsFecthedUsingThrowable_thenCorrectMethodAndClassIsReturned", elementThree.getMethodName());
//    }
//}
