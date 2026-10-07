package P10_HandleMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
    WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://testautomationpractice.blogspot.com/");
	WebElement box1 = d.findElement(By.cssSelector("#field1"));
	box1.clear();
	box1.sendKeys("Rakesh Bhadoria");
	
    Actions act = new Actions(d);
    WebElement copyElem = d.findElement(By.cssSelector("[ondblclick='myFunction1()']"));
    act.doubleClick(copyElem).perform();
    Thread.sleep(4000);
    // getText() - captures only inner text of the element
    // getAttribute(attribute) - return value of the attribute
    String textField = d.findElement(By.cssSelector("#field2")).getAttribute("value");
    if(textField.equalsIgnoreCase(box1.getAttribute("value")))
    {	
      System.out.println("Double Click Done: "+textField);
    }
    else
    {
      System.out.println("Double Click not performed");
    }	
    
    d.close();
	}

}
