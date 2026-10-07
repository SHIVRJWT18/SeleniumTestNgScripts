package P01_HandleBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCloseMethods {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.get("https://testautomationpractice.blogspot.com");
		System.out.println("Current Pg Url: "+d.getCurrentUrl());
		// 1. close() -> Close single browser instance
		d.close();
		
		d = new EdgeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.manage().window().maximize();
	    d.get("https://testautomationpractice.blogspot.com");
		d.findElement(By.xpath("//a[@href='https://www.blogger.com']")).click();

		// 2. quit() -> Close all the browser instances
		d.quit();

	}

}
