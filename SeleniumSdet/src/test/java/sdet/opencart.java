package sdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class opencart {
	
	@Test
	public void check() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		//https://www.opencart.com/
		System.out.println("hello");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 WebElement loginclickk =driver.findElement(By.xpath("//a[@class='btn btn-link navbar-btn']"));
		 loginclickk.click();
		//a[@class='btn btn-link navbar-btn']
		 
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement unameEmail=driver.findElement(By.xpath("//input[@name='email']"));
		 unameEmail.sendKeys("surenderprajapati1611@gmail.com");
		//*[@id="input-email"]
		 
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		 pass.sendKeys("Surender@123");
		//*[@id="input-password"]
		 
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		//*[@id="account-login"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]
		 loginButton.click();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));


	
			// TODO Auto-generated method stub
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.close();	
	}
	
	
}
