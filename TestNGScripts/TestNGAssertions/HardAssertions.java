package TestNGAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertions {
	public WebDriver d;
	@BeforeTest
	public void Setup()
	{
	 System.setProperty("webdriver.chrome.driver","E:\\SHIV SCRIPTS\\TestData\\chromedriver.exe");
     d = new ChromeDriver();
    }
@Test
public void OpenBrowser()
{
 Reporter.log("This test verifies the current version of selenium is compatible",true);
 Reporter.log("This test verifies the current version of chrome is compatible",true);
 d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 String exptitle = "OrangeHRM";
 String acttitle = d.getTitle();
 System.out.println("Get title: "+acttitle);
 Assert.assertEquals(acttitle, exptitle,"Verification Not Success");
 d.close();
}
}
