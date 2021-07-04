package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example1 {
	
	
	
	@Test
	public void browserOpen() {
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Java%20Softwares/Selenium%20Software/Offline%20Website/index.html");
			String name = driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
		  Assert.assertEquals(name,"Sign in to start your session" );
	}

}
