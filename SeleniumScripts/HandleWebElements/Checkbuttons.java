package HandleWebElements;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbuttons {
        static
	    {
	    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
	    }
		public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://testautomationpractice.blogspot.com/");
		WebElement elem = d.findElement(By.xpath("//*[@id=\"male\"]"));
	    System.out.println("Male Gender display? "+elem.isDisplayed());
	    System.out.println("Male Gender Enable? "+elem.isEnabled());
	    System.out.println("Male Gender Selected? "+elem.isSelected());
	    Thread.sleep(1000);
	    elem.click();
	    System.out.println("Male Gender Selected? "+elem.isEnabled());
	    Thread.sleep(3000);
	    d.quit();

	}

}
