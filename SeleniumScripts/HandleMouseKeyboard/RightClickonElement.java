package HandleMouseKeyboard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickonElement {
	static
    {
    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
    }
	public static void main(String[] args) throws AWTException {
    WebDriver d = new ChromeDriver();
    d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    d.get("https://www.actitime.com/free-online-trial");
	Actions act = new Actions(d);  // Actions is Class which implement Action interface
    WebElement ele = d.findElement(By.xpath("//a[text()='Service Agreement']"));
    act.contextClick(ele).perform();
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_T);
    System.out.println("Right Click On Element done Sucessfully");

    d.close();
 }

}
  //TODO: Need to fix locator













