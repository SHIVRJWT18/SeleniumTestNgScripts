package P05_HandleWebElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_InputBoxActionUsingJSE {

	static WebElement elem;
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://testautomationpractice.blogspot.com/");
		
		//1. Way1: Using SendKeys
		elem = d.findElement(By.id("name"));
		elem.click();
		elem.clear();
        elem.sendKeys("Karan Kumar");
        Thread.sleep(2000);
		System.out.println("Name: "+elem.getAttribute("value"));

        
        // Way2: Using Action Class
		elem = d.findElement(By.id("email"));
        Actions actions = new Actions(d);
        actions.click(elem).sendKeys("karankumar123@gmail.com").perform();
        Thread.sleep(2000);
		System.out.println("Email: "+elem.getAttribute("value"));
		
        // Way3: Using Robot Class 
        String address = "Delhi";
        elem = d.findElement(By.id("textarea"));
        elem.click();
        Robot robot = new Robot();
        for (char c : address.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
        }
        Thread.sleep(3000);
		System.out.println("Address: "+elem.getAttribute("value"));
		
		d.close();

	}

}
