package sdet;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestClass {
	@Test
	public   void maiiin() throws InterruptedException {
//		System.setProperty(keys,path);
	WebDriver wd= new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://demo.evershop.io/account/login");
	//wd.get("https://www.opencart.com");
	//wd.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).click();
	WebElement e1 = wd.findElement(By.name("email"));
	e1.sendKeys("surenderprajapati1611@gmail.com");
	wd.findElement(By.name("password")).sendKeys("Surender@123");
	wd.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	//System.out.println(e1.isEnabled());
	//wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	String expTitle = "Google";
	String actTitle = wd.getTitle();
	if(expTitle.equals(actTitle)) {
		System.out.println("test is passed");
	}
	else {
		System.out.println("test is not  a passed the");
	}
	// agr element h to true hoga nhi to false ho jayega
	Assert.assertTrue(wd.findElements(By.xpath("//*[@id='app']/div/div[2]/div[2]/ul/li[1]/a")).size()>0,"user is on home page");
	//Assert.assertEquals(expTitle,actTitle);
	//System.out.println(actTitle);
	wd.quit();
	}
	
	
	
	

}
