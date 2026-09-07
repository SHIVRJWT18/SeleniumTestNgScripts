package TestNGPriority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PriorityTest {
	WebDriver d;
@Test(priority = 2)
public void openCBrosr()
{
 System.setProperty("webdriver.chrome.driver","E:\\SHIV SCRIPTS\\TestData\\chromedriver.exe");
 d = new ChromeDriver();
 System.out.println("Next Chrome is Launched");
}
@Test(priority = 0)
public void openFBrosr()
{
 System.setProperty("webdriver.gecko.driver","E:\\SHIV SCRIPTS\\TestData\\geckodriver.exe");
 d = new FirefoxDriver();
 System.out.println("First Firefox is Launched");
}
@Test(priority = 3)
public void tearC()
{
 d.close();
}
@Test(priority = 1)
public void tearF()
{
 d.close();
}
}
