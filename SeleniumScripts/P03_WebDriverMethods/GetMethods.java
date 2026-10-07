package P03_WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String webUrl = "https://testautomationpractice.blogspot.com";
	
	// 1. get() -> Launch the Url on the browser
	d.get(webUrl);
	
	// 2. getTitle() -> Return the title of the page
	String getTitle = d.getTitle();
	System.out.println("Get Pg Title: "+getTitle);

	// 3. getPageSource() -> Return the source code of page
    String getPgSrc = d.getPageSource();
	System.out.println("Get Pg Src: "+getPgSrc);

	// 4. getCurrentUrl() -> Return the Url of the page
	String CurrentUrl = d.getCurrentUrl();
	System.out.println("Get Pg Url: "+CurrentUrl);

	// 5. getWindowHandle() -> Return id of the single browser window
	String windowaddress = d.getWindowHandle();
	System.out.println("Get Pg Address: "+windowaddress);
	
	// 6. getWindowHandles() -> Return id of the multiple browser window 
	d.findElement(By.xpath("//a[@href='https://www.blogger.com']")).click();
	Set<String> multiwin = d.getWindowHandles();
	System.out.println("Get all Pg Address: "+multiwin);

	 d.quit();
   }
}
