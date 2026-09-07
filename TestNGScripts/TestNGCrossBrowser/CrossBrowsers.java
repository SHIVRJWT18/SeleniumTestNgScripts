package TestNGCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsers {
	public static WebDriver d;
@BeforeClass
@Parameters("browser")
public void Setup(String browser)
{
	 System.setProperty("webdriver.chrome.driver","E:\\SHIV SCRIPTS\\TestData\\chromedriver.exe");
	 System.setProperty("webdriver.gecko.driver","E:\\SHIV SCRIPTS\\TestData\\geckodriver.exe");
if(browser.equalsIgnoreCase("chrome"))
 {
    d = new ChromeDriver();
 }
 else if(browser.equalsIgnoreCase("firefox"))
 {
	d = new FirefoxDriver();
 }
}
 @Test
 public void OpenWeb()
 {

	 d.get("https://demoqa.com/upload-download");
	 System.out.println(d.getTitle());
 }

}

