package P10_HandleMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveSliderUsingDragNDrop {

	// dragAndDropBy(WebElement Element,int x,int y)
	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://jqueryui.com/slider/");
	WebElement iframe = d.findElement(By.className("demo-frame")); 
	d.switchTo().frame(iframe);
	Actions act = new Actions(d);
	WebElement slideToRight = d.findElement(By.cssSelector("#slider > span:nth-child(1)"));
	System.out.println("Default Location of left point: "+slideToRight.getLocation());

	Thread.sleep(2000);
	// Default Location of Slider: P1(907, 2070) 
     
	act.dragAndDropBy(slideToRight,2,0).perform();
	System.out.println("New Location of left point: "+slideToRight.getLocation());

	d.close();


	}

}
