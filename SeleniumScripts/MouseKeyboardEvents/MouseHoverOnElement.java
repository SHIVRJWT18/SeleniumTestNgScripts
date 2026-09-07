package MouseKeyboardEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOnElement {
	static
	{
	  System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
    WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://demoqa.com/menu/#");
    Actions act = new Actions(d);
    WebElement ele = d.findElement(By.xpath("//a[text()='Main Item 2']"));
    act.click(ele).perform();
    System.out.println("Mouse Hover On Element done Sucessfully");
    d.close();
	}

}
