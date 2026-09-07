package HandleDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {
        static
	    {
	    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
	    	System.setProperty("webdriver.gecko.driver","./Sel.Drivers/geckodriver.exe");
	    }
		public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.get("https://demoqa.com/select-menu");
	    Select se = new Select(d.findElement(By.id("cars")));
	    System.out.println(se.isMultiple());
	    if(se.isMultiple())
	    {
	    se.selectByIndex(1);
	    se.selectByIndex(2);
        Thread.sleep(1000);

	    se.selectByValue("volvo");
	    se.selectByValue("audi");

	    Thread.sleep(1000);
	    se.selectByVisibleText("Volvo");
	    se.selectByVisibleText("Opel");
	    }
	    d.close();
	}
 }

