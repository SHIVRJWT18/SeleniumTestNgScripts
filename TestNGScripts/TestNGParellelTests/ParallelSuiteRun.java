package TestNGParellelTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelSuiteRun {
	public WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Thread Number Is " + Thread.currentThread().getId());

	}

       @Test
 	public void ChromeTestMethod()
 	{

	 System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
	 System.setProperty("webdriver.gecko.driver","E:\\SHIV SCRIPTS\\TestData\\geckodriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com");
	 System.out.println(driver.getTitle());

      }

     @AfterTest
     public void afterTest() {
	 System.out.println("After Test Thread Number Is " + Thread.currentThread().getId());
	 driver.close();
}
}