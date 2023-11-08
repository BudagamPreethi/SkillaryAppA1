package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class anotations {
@BeforeSuite
	public void suiteconfig() {
	System.out.println("before suit");
	
	}
@BeforeTest
public void testconfig() {
	System.out.println("before test");
	
	}
@AfterMethod
public void methodTearDown() {
	System.out.println("after method");
	
	}
@AfterClass
public void classTearDown() {
	System.out.println("Afterclass");
	
	}

@AfterTest
public void testTearDown() {
	System.out.println("Aftertest");
	
	}
@AfterSuite
public void suiteTearDown() {
	System.out.println("Aftersuite");
	
	}

}
