package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class mouseover {
	@Test(groups = {"sanity"})
	public static void mouseovers() throws InterruptedException {
		ChromeDriver wd = new ChromeDriver();
		wd.get("https:/www.amazon.in");
		Actions a1 = new Actions(wd);
		WebElement element = wd.findElement(By.id("nav-link-accountList"));
		WebElement element2 = wd.findElement(By.id("nav-orders"));
		Thread.sleep(3000);
		a1.moveToElement(element).perform();
		a1.contextClick(element2).perform();
	}
}
