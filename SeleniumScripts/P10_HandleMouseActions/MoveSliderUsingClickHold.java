package P10_HandleMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveSliderUsingClickHold {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://jqueryui.com/resources/demos/slider/range.html");
	Actions act = new Actions(d);
	WebElement slideToRight = d.findElement(By.cssSelector("#slider-range > span:nth-child(2)"));
	System.out.println("Default location of left point: "+slideToRight.getLocation());
	WebElement slideToLeft = d.findElement(By.cssSelector("#slider-range > span:nth-child(3)"));
	System.out.println("Default location of right point: "+slideToLeft.getLocation());
	Thread.sleep(2000);
	// Default Location of Slider: P1(907, 2070) ||  P2(1014,2070)
     
	act.clickAndHold(slideToRight).moveByOffset(100, 0).release().perform();
	act.clickAndHold(slideToLeft).moveByOffset(-200,0).release().perform();
	System.out.println("New location of left point: "+slideToRight.getLocation());
	System.out.println("New location of right Point: "+slideToLeft.getLocation());

	d.close();


	}

}
