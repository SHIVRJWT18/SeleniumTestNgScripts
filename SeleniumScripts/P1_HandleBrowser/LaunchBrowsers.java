package P1_HandleBrowser;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {

	public static void main(String[] args) throws InterruptedException {

		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://demoqa.com/swagger");
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		cdriver.manage().window().maximize();
		System.out.println(cdriver.getTitle());
		
		WebDriver fdriver = new FirefoxDriver();
		fdriver.get("https://www.irctc.co.in/nget/train-search");
		fdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		fdriver.manage().window().maximize();

		System.out.println(fdriver.getTitle());
		fdriver.close();
		
		WebDriver edriver = new EdgeDriver();
		edriver.get("https://www.makemytrip.com/");
		edriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    edriver.manage().window().maximize();

		System.out.println(edriver.getTitle());
		edriver.close();
		
		
		
	}

}
