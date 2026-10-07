package P06_HandleAlertsPopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// d.get("https://the-internet.herokuapp.com/basic_auth");
		
		// Passing modified url with Username and Password
		
		d.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		
		System.out.println(d.getTitle());
		d.close();

	}

}
