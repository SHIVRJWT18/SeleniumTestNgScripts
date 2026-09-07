package HandleDropdowns;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GettingOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.get("https://demoqa.com/select-menu");
	    String title = d.getTitle();
	    System.out.println(title);
	    Thread.sleep(1000);
	    Select se = new Select(d.findElement(By.id("oldSelectMenu")));
	    WebElement fstopt = se.getFirstSelectedOption();
	    System.out.println(fstopt.getText());
	    Select sel = new Select(d.findElement(By.id("cars")));
	    List<WebElement> opt = sel.getOptions();
	    for(WebElement we: opt)
	    {
	     System.out.println(we.getText());
        }
	    d.close();

      }
}