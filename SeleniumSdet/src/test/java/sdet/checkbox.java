package sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 //import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class checkbox {
	
	@Test
	public void check() throws InterruptedException {
		
		WebDriver wd= new ChromeDriver();
		wd.get("https://trytestingthis.netlify.app/");
	
		List<WebElement> options = wd.findElements(By.id("option"));

		
		/*	WebElement e1 = wd.findElement(By.id("option"));
		Select s1 = new Select(e1);
		List<WebElement>options = s1.getOptions();  */
		
		
	/*
	s1.selectByValue("option 1");
	Thread.sleep(4000);
		
	s1.selectByValue("option 3");
	Thread.sleep(5000);
	
	s1.selectByIndex(2);
	Thread.sleep(2000);
	}*/

	for( WebElement opt:options) {
		System.out.println(opt.getText());
		
		if(opt.getText().equalsIgnoreCase("option 2")) {
			opt.click();
			Thread.sleep(5000);
		}
		if(opt.getText().equalsIgnoreCase("option 3")) {
			opt.click();
			Thread.sleep(5000);
		}
		
		
	}
	}
	
}
