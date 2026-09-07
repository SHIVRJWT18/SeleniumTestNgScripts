package HandleBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String webUrl = "https://testautomationpractice.blogspot.com";
	// Launch the Uri
	d.get(webUrl);
	// Get the Page title
	String getTitle = d.getTitle();
	System.out.println("Get Pg Title: "+getTitle);

	// Get the Page Source
    String getPgSrc = d.getPageSource();
	System.out.println("Get Pg Src: "+getPgSrc);

	// Get the Current Url
	String CurrentUrl = d.getCurrentUrl();
	System.out.println("Get Pg Url: "+CurrentUrl);

	// Close the browser
	d.quit();
   }
}
