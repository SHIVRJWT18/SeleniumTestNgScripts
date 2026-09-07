package HandleWebElements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoFrame {
    static
    {
    	System.setProperty("webdriver.chrome.driver","E:/SHIV SCRIPTS/Testdata/chromedriver.exe");
    	System.setProperty("webdriver.gecko.driver","E:/SHIV SCRIPTS/Testdata/geckodriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
	WebDriver cd = new ChromeDriver();
	cd.manage().window().maximize();
	cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	cd.get("https://demoqa.com/frames");

    cd.close();
  }
}