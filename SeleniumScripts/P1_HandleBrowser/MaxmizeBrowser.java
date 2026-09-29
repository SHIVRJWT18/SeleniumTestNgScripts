package P1_HandleBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class MaxmizeBrowser {

	public static void main(String[] args) {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("start-maximized");

	WebDriver d = new ChromeDriver(co);
	d.get("https://www.guru99.com/");
	System.out.println("Maximize Chrome: "+d.getTitle());

	FirefoxOptions options = new FirefoxOptions();
	options.addArguments("start-maximized");
	d = new FirefoxDriver(options);
    d.get("https://www.autoitscript.com/");
	System.out.println("Maximize Firefox: "+d.getTitle());

    d.quit();



 }

}
