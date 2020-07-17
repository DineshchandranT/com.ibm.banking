package com.ibm.banking.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {
	
	WebDriver driver;
	
	@BeforeTest
	public void ChromesetUp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	@Test
	public void verifyTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
