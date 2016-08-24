package com.vsii.tsc.project;

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