package TestNGParellelTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SerialRun {
	public WebDriver d;
@Test
public void Firstgo()
{
 System.setProperty("webdriver.chrome.driver","E:\\SHIV SCRIPTS\\TestData\\chromedriver.exe");
 d = new ChromeDriver();
 d.get("https://www.amazon.com");
 System.out.println(d.getTitle());
}

@Test
public void Secondgo()
{
 System.setProperty("webdriver.gecko.driver","E:\\SHIV SCRIPTS\\TestData\\geckodriver.exe");
 d = new FirefoxDriver();
 d.get("https://www.myntra.com");
 System.out.println(d.getTitle());
}
}
