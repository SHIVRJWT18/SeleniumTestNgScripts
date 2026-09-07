package TestNGAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion {
@Test
public void launch()
{
 System.setProperty("webdriver.chrome.driver","E:\\SHIV SCRIPTS\\TestData\\chromedriver.exe");
 Reporter.log("This test verifies Selenium compatibility with TestNG");
 Reporter.log("Launching the Chrome Browser");
 WebDriver d = new ChromeDriver();
 d.get("https://www.google.com");
 Reporter.log("The website is google Page",true);
 String exp= "Google";
 String act = d.getTitle();
 Assert.assertEquals(act, exp,"Not matched");
 d.close();
}


@Test
public void assertDemo()
{

//Assert.assertEquals(false, true); // fail
Assert.assertEquals(true, true);
Assert.assertEquals("Rakesh", "Rakesh");
//Assert.assertEquals("Rakesh", 123); // fail
Assert.assertNotEquals("Rakesh", 123);
Assert.assertTrue(1==1);
//Assert.assertTrue(1==3); //fail
//Assert.assertFalse(1==1); //fail
Assert.assertFalse(1==3);
// Assert.fail("Fail this assert");
}

}
