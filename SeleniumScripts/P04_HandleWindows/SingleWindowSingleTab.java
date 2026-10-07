package P04_HandleWindows;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowSingleTab {

		public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demoqa.com/browser-windows");
		String prntwin = d.getWindowHandle();
		System.out.println("ParentWin: "+prntwin);
		d.close();
	   }
    }
