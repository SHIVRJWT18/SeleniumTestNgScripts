package TestNGParellelTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelSeparateCls_2 {
	WebDriver driver;

	@BeforeTest
	public void Setup()
	{
	 System.setProperty("webdriver.chrome.driver","E:\\SHIV SCRIPTS\\TestData\\geckodriver.exe");
	}

	@Test
	public void FirstFirefoxgo()
	{
	 driver = new FirefoxDriver();
	 driver.get("https://www.amazon.com");
	 System.out.println(driver.getTitle());
	 System.out.println("First Thread id : "+ Thread.currentThread().getId());
	}

	@Test
	public void SecondFirefoxgo()
	{
	 driver = new FirefoxDriver();
	 driver.get("https://www.myntra.com");
	 System.out.println(driver.getCurrentUrl());
	 System.out.println("Next thread id : "+ Thread.currentThread().getId() );
	}

	}

