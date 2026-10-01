package P1_HandleBrowser;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// get() - takes only string as argument
    d.get("https://testautomationpractice.blogspot.com");
	System.out.println("Current Pg Url: "+d.getCurrentUrl());

	/* Navigate to the other Url
	 * naviagte().to() - takes string format or object of URL as argument
	*/ 
	d.navigate().to("https://practicetestautomation.com/"); // takes URL as string argument
	System.out.println("Navigated Pg Url: "+d.getCurrentUrl());
	
	URL myurl = new URL("https://demowebshop.tricentis.com/");
	d.navigate().to(myurl); // takes URL as URL object format
	System.out.println("My Pg Url: "+d.getCurrentUrl());
	
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
