package P06_HandleAlertsPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	// Confiramtion Alert - OK and Cancel
	d.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
	Alert a = d.switchTo().alert();
	System.out.println(a.getText()); 
	a.accept(); // close alert with OK button
    System.out.println(d.findElement(By.cssSelector("#result")).getText());

	Thread.sleep(2000);
	d.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
	a = d.switchTo().alert();
	System.out.println(a.getText());
	a.dismiss(); // close alert with Cancel button
    System.out.println(d.findElement(By.cssSelector("#result")).getText());

	d.close();



	}

}
