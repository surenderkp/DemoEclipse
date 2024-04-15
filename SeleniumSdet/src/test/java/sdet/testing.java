package sdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testing{
	ChromeOptions chromeoptions ;
	FirefoxOptions firefoxOptions;
	WebDriver wd;
	
   @Parameters({"browser"})
	@BeforeClass(alwaysRun=true)
	public void BC( String browserName) {
		System.out.println("value of browser is :" + browserName);
		switch (browserName) {
		case "chrome" :{
			chromeoptions = new ChromeOptions();
			wd = new ChromeDriver();
			break;
		}
		case "firefox" :{
			firefoxOptions = new FirefoxOptions();
			wd = new FirefoxDriver();
			break;
		}
		default :{
			chromeoptions = new ChromeOptions();
			wd = new ChromeDriver();
			break;
		}
		
		}
	}
	@Test(groups = {"sanity"})
	public  void loginnn() {
		//System.setProperties()
		//WebDriver wd= new ChromeDriver();
		WebDriverWait wait;
		wd.get("https://demo.evershop.io/account/login");
		WebElement e1 = wd.findElement(By.name("email"));
		e1.sendKeys("hello@gmail.com");
		wd.findElement(By.name("password")).sendKeys("12515215");
		System.out.println(e1.isEnabled());
		
		// Implicit Wait
		//wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String expTitle = "Login";
		String actTitle = wd.getTitle();
		if(expTitle.equals(actTitle)) {
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is not passed");
		}
		//System.out.println(actTitle);
		// Explicit wait
		
		wait = new WebDriverWait(wd, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		
		
		//wd.quit();
		}
	@Test
	public  void unsucess() {
//		System.setProperty(keys,path);
	 wd= new ChromeDriver();
	wd.get("https://demo.evershop.io/account/login");
	WebElement e1 = wd.findElement(By.name("email"));
	e1.sendKeys("hello");
	System.out.println(e1.isEnabled());
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	String expTitle = "Google";
	String actTitle = wd.getTitle();
	if(expTitle.equals(actTitle)) {
		System.out.println("test is passed");
	}
	else {
		System.out.println("test is not passed");
	}
	//System.out.println(actTitle);
	wd.close();
	}
		
	}


