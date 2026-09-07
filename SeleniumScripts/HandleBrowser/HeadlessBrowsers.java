package HandleBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowsers {

	public static void main(String[] args) {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("headless");
	FirefoxOptions  fo = new FirefoxOptions();
	fo.addArguments("headless");


	WebDriver d1 = new ChromeDriver(co);
	WebDriver d2 = new FirefoxDriver(fo);
	d1.get("https://chatgpt.com/");
	System.out.println("Headless Chrome Title is : "+ d1.getTitle());
	d2.get("https://chromewebstore.google.com/");
	System.out.println("Headless Firefox Title is : "+ d2.getTitle());
	d1.close();
	d2.close();
	}
}
