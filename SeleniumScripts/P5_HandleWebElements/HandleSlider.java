package P5_HandleWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSlider {
    static
    {
    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
    	System.setProperty("webdriver.gecko.driver","./Sel.Drivers/geckodriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://demoqa.com/slider/");
	Actions act = new Actions(d);
	WebElement x1 = d.findElement(By.xpath("//input[@value='25']"));
	act.moveToElement(x1, 75, 0).perform();
	x1.click();
    System.out.println("Slider Move Sucessfully");

	d.close();


	}

}
