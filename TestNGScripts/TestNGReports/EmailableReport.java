package TestNGReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmailableReport {
     WebDriver driver;
    @Test
	public void report()
	     {
		  System.setProperty("webdriver.chrome.driver","./Tstng.Drivers/chromedriver.exe") ;
	      String baseUrl = "https://www.toolsqa.com/";
	      System.out.println("Launching Google Chrome browser");
	      driver = new ChromeDriver();
	      driver.get(baseUrl);
	      Reporter.log("We used Google Chrome Ver 96 for this test");
	      String testTitle = "Tools QA";
	      String originalTitle = driver.getTitle();
	      Assert.assertEquals(originalTitle, testTitle);
	     }

}
