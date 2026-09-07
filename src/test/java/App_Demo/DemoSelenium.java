package App_Demo;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoSelenium {

	public static void main(String[] args) {
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        chrome.get("https://www.google.com");
        System.out.println("Web Title: "+chrome.getTitle());
        chrome.quit();
	}

}
