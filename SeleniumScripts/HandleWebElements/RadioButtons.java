package HandleWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	static
    {
    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://testautomationpractice.blogspot.com/");
	WebElement elem = d.findElement(By.xpath("//*[@id=\"monday\"]"));
    System.out.println(elem.isDisplayed());
    System.out.println(elem.isEnabled());
    System.out.println(elem.isSelected());
    Thread.sleep(1000);
    elem.click();
    System.out.println(elem.isEnabled());
    Thread.sleep(3000);
    d.close();




	}

}
