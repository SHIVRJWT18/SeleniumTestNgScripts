package P01_HandleBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowsers {

	public static void main(String[] args) {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--headless");
	
	WebDriver d1 = new ChromeDriver(co);
	d1.get("https://practicetestautomation.com/practice-test-login/");
	System.out.println("Headless Chrome Title is : "+ d1.getTitle());
	
	FirefoxOptions  fo = new FirefoxOptions();
	fo.addArguments("--headless");
	d1 = new FirefoxDriver(fo);
	d1.get("https://chromewebstore.google.com/");
	System.out.println("Headless Firefox Title is : "+ d1.getTitle());
	d1.close();
	}
}
