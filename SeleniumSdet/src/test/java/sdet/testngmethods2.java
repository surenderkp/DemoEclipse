package sdet;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngmethods2 {
	@BeforeTest
	public void BT() {
		System.out.println("before test");
	}
	@BeforeClass
	public void BC() {
		System.out.println("Before Method");
	}
	@Test(groups = { "regression","smoke"})
	public void tc3() {
		System.out.println("test case 3");
	}
	@Test(groups = {"sanity", "smoke"})
	public void tc4() {
		System.out.println("Test case 4");
	}
	@AfterMethod
	public void AM() {
		System.out.println("After Method");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("Before Method");
	}
	@AfterClass
	public void Ac() {
		System.out.println("After class");
	}
	@AfterTest
	public void AT() {
		System.out.println("After test");
	}
	
	
	
}
