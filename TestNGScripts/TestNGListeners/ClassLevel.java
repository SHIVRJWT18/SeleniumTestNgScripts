package TestNGListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
 * If we direct run this class → It means usage of ITestListeners at Class Level
 * You can also run xml file related to this class → which means usage of ITestListeners at Suite Level
 */
//@Listeners(ITestListenersAtClsLevel.class)
public class ClassLevel
{
	WebDriver d;
@BeforeTest
public void Setup()
{
 System.setProperty("webdriver.chrome.driver","E:\\SHIV SCRIPTS\\TestData\\chromedriver.exe");
 d = new ChromeDriver();
}

@Test
public void CloseBrowser()
{
 d.close();
 Reporter.log("Driver Closed After testing");
}

@Test
public void openBrowser()
{
 d.get("https://www.amazon.com");
 System.out.println(d.getCurrentUrl());
}
private int i =1;
@Test(successPercentage =70,invocationCount=3)
public void verifyTest()
{
 if(i<2) {
	Assert.assertEquals(i, i);
}
 i++;
}
public void skipTest()
{
 throw new SkipException("Skipping the test method");
}

}
