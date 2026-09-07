package MouseKeyboardEvents;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropElement2 {
	static
    {
    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
    }
	public static void main(String[] args) throws AWTException {
    WebDriver d = new ChromeDriver();
    d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    d.get("https://demoqa.com/droppable/");
    WebElement src = d.findElement(By.id("draggable"));
	WebElement des = d.findElement(By.xpath("//p[text()='Drop here']"));
	int x1 = src.getLocation().getX();
	int y1 = src.getLocation().getY();
	int x2 = des.getLocation().getX();
	int y2 = des.getLocation().getY();
	System.out.println("x1= "+x1+" "+"x2= "+x2+"  "+"y1= "+y1+"  "+"y2= "+y2);
    Actions a = new Actions(d);
    a.dragAndDropBy(src, 100, 100).perform();
    System.out.println("Droped Sucessfully");

    d.close();
 }
}