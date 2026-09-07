package HandlePopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
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
	d.findElement(By.id("confirmButton")).click();
	Alert a = d.switchTo().alert();
	System.out.println(a.getText());
	a.dismiss();
	Thread.sleep(1000);
	d.close();



	}

}
