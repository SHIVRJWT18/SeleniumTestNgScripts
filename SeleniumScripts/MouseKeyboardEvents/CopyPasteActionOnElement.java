package MouseKeyboardEvents;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteActionOnElement {
	static
    {
    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://demoqa.com/text-box");
	d.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Mr. Rakesh Kumar");
	d.findElement(By.xpath("//input[@type='email']")).sendKeys("rk@gmail.com");
	WebElement curadd = d.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
	curadd.sendKeys("Ahemdabad Gujarat");
	Actions act = new Actions(d);
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	// KeyDown used for Key press and KeyUp used for key release
	act.sendKeys(Keys.TAB).perform();
    Thread.sleep(200);
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

	d.close();


	}

}
