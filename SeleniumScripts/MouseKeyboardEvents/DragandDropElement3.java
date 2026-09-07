package MouseKeyboardEvents;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropElement3 {
	static
    {
    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
    }
	public static void main(String[] args) throws AWTException {
    WebDriver d = new ChromeDriver();
    d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    d.get("https://demoqa.com/dragabble");
    d.findElement(By.id("draggableExample-tab-cursorStyle")).click();
    WebElement src = d.findElement(By.id("cursorTopLeft"));
    WebElement des = d.findElement(By.xpath("//span[text()='My cursor is at bottom']"));
    Actions a = new Actions(d);
    a.dragAndDrop(src, des);
    System.out.println("Droped Sucessfully");

    d.close();
	}

}
