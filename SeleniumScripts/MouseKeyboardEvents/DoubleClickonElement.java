package MouseKeyboardEvents;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickonElement {
	static
    {
    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
    }
	public static void main(String[] args) throws AWTException {
    WebDriver d = new ChromeDriver();
    d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    d.get("https://demoqa.com/buttons");
	Actions act = new Actions(d);  // Actions is Class which implement Action interface
    WebElement ele = d.findElement(By.xpath("//button[text()='Double Click Me']"));
    act.doubleClick(ele).perform();
    WebElement elmt = d.findElement(By.xpath("//p[text()='You have done a double click']"));
    System.out.println(elmt.getText());
    d.close();
 }

}
