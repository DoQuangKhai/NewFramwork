package com.vsii.tsc.project.testcase;

import org.testng.annotations.Factory;

public class SimpleFactory 
{
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { 
                                new SimpleTest("one"), 
                                new SimpleTest("two") 
                            };
    }
}