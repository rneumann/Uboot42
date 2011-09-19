package com.dbs.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {

    @Before
    public void setupData() {
        
    }

    @Test
    public void doSomeTesting() {
        //
    }

    @Test(expected = RuntimeException.class)
    public void doSomeMoreTesting() {
        throw new RuntimeException();
    }

    @After
    public void cleanupData() {
        
    }

}
