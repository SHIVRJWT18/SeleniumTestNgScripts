package HandleDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDemo {
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
    String title = d.getTitle();
    System.out.println(title);
    Thread.sleep(1000);
    Select se = new Select(d.findElement(By.id("oldSelectMenu")));
    se.selectByIndex(6);
    Thread.sleep(1000);
    se.selectByValue("10");
    Thread.sleep(1000);
    se.selectByVisibleText("Purple");
    d.close();
	}

}
