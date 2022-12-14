package com.example.exceptions;

import com.example.exceptions.StackTraceUsingThreadDemo;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StackTraceUsingThreadDemoTest {
    @Test
    public void whenElementIsFetchedUsingThread_thenCorrectMethodAndClassIsReturned() {
        StackTraceElement[] stackTrace = new StackTraceUsingThreadDemo().methodA();

        StackTraceElement elementZero = stackTrace[0];
        assertEquals("java.lang.Thread", elementZero.getClassName());
        assertEquals("getStackTrace", elementZero.getMethodName());

        StackTraceElement elementOne = stackTrace[1];
        assertEquals("com.example.exceptions.StackTraceUsingThreadDemo", elementOne.getClassName());
        assertEquals("methodB", elementOne.getMethodName());

        StackTraceElement elementTwo = stackTrace[2];
        assertEquals("com.example.exceptions.StackTraceUsingThreadDemo", elementTwo.getClassName());
        assertEquals("methodA", elementTwo.getMethodName());

        StackTraceElement elementThree = stackTrace[3];
        assertEquals("com.example.exceptions.StackTraceUsingThreadDemoTest", elementThree.getClassName());
        assertEquals("whenElementIsFetchedUsingThread_thenCorrectMethodAndClassIsReturned", elementThree.getMethodName());
    }
}
