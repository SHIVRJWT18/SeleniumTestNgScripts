package P6_HandleAlertsPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	// Normal Alert with OK button 
	d.get("https://the-internet.herokuapp.com/javascript_alerts");
	d.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]")).click();
	Alert act = d.switchTo().alert();
	System.out.println(act.getText());
    act.accept();
    System.out.println(d.findElement(By.cssSelector("#result")).getText());
    d.close();

}
}