package MouseKeyboardEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOnTooltip {
	static
	{
	  System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
    WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://demoqa.com/tool-tips");
    Actions act = new Actions(d);
    WebElement ele = d.findElement(By.xpath("//*[@id=\"texToolTopContainer\"]/a[1]"));

    System.out.println(ele.getText());
    act.click(ele).perform();
    //WebElement tooltip = d.findElement(By.xpath("//a[text()='Contrary']"));
    System.out.println(ele.getText());

    d.close();
	}
} //TODO: Need to fix locator
