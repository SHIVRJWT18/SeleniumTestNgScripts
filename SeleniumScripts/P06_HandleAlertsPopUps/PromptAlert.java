package P06_HandleAlertsPopUps;

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
	d.get("https://the-internet.herokuapp.com/javascript_alerts");
	d.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
	Alert a = d.switchTo().alert();
	System.out.println(a.getText());
	a.sendKeys("Rajawat");
	a.accept();
    System.out.println(d.findElement(By.cssSelector("#result")).getText());

	d.close();

	}
}
