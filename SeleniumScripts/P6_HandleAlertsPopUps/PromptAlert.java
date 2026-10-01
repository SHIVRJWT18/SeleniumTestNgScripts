package P6_HandleAlertsPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://demoqa.com/alerts");
	d.findElement(By.id("promtButton")).click();
	Alert a = d.switchTo().alert();
	System.out.println(a.getText());
	a.sendKeys("Rajawat");
	a.accept();
	d.close();

	}
}
