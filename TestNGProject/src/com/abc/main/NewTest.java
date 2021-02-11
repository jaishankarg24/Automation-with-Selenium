package com.abc.main;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test(priority = 1)
  public void f1() {
	  System.out.println("Test1 method");
  }
  
  @Test(priority = 2)
  public void f2() {
	  System.out.println("Test2 method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before Test method");
  }
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Test method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

}

/*
Before class
before Test method
Test1 method
After Test method
before Test method
Test2 method
After Test method
After class
PASSED: f1
PASSED: f2

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 2, Failures: 0, Skips: 0
===============================================
*/