package MouseKeyboardEvents;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropElement1 {
	static
    {
    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
    }
	public static void main(String[] args) throws AWTException {
    WebDriver d = new ChromeDriver();
    d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    d.get("https://demoqa.com/droppable/");
    WebElement src = d.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement des = d.findElement(By.xpath("(//*[@id=\"droppable\"])[1]"));
    Actions act = new Actions(d);
    act.dragAndDrop(src, des).perform();
    System.out.println("Droped Sucessfully");
    d.close();


	}
 }