package com.eBankingPractical.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL = "https://demo.guru99.com/v4/";
	public String username = "mngr550393";
	public String password = "maqugan";
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\Windows 10 Pro\\eclipse-workspace\\eBankingPractical\\Drivers\\chrome.exe");
		driver = new ChromeDriver(cop);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
