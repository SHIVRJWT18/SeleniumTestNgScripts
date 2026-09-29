package P1_HandleBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String webUrl = "https://testautomationpractice.blogspot.com";
    d.get(webUrl);
	System.out.println("Current Pg Url: "+d.getCurrentUrl());

	// Navigate to the other Url
	d.navigate().to("https://practicetestautomation.com/");
	System.out.println("Navigated Pg Url: "+d.getCurrentUrl());

	// Go back to Previous Page
	d.navigate().back();
	Thread.sleep(3000);
	System.out.println("Back to Current Pg Url: "+d.getCurrentUrl());

	// Go forward to next page
	d.navigate().forward();
	Thread.sleep(3000);
	System.out.println("Forward Pg Url: "+d.getCurrentUrl());

	// Refresh browser
	d.navigate().refresh();
	Thread.sleep(3000);
	System.out.println("Refreshed Pg Url: "+d.getCurrentUrl());

	d.quit();
	}
}
