package sdet;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngMethods {
	@Test(groups = {"sanity", "regression","smoke"})
	public void hello() {
		System.out.println("hello");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("Before Method");
	}
	@Test(groups = {"smoke"})
	public void tc1() {
		System.out.println("test case 1");
	}
	@Test(groups = {"sanity"})
	public void tc2() {
		System.out.println("Test case 2");
	}
	@AfterMethod
	public void AM() {
		System.out.println("After Method");
	}
	
	
	
}
