package com.cydeo.step_definitions;

import com.cydeo.utilities.DBUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks_DB {

    @Before("@db")
    public void setUpDB(){
        System.out.println("Connecting to database...");
        DBUtils.createConnection();
    }

    @After("@db")
    public void tearDownDB(){
        System.out.println("close database connection...");
        DBUtils.destroy();
    }
}
