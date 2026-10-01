package P6_HandleAlertsPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnExpectedAlert {
    static
    {
    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
    	System.setProperty("webdriver.gecko.driver","./Sel.Drivers/geckodriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://demoqa.com/alerts");
	try {
	     d.findElement(By.id("timerAlertButton")).click();
	     WebDriverWait w= new WebDriverWait(d, null);
	     w.until(ExpectedConditions.alertIsPresent());
	     Alert a = d.switchTo().alert();
	 	 System.out.println(a.getText());
	    }
	catch (Exception e) {
		System.out.println("Alert is not found");
	}

	d.close();
 }
}