package P04_HandleWindows;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchNewTab_NewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        d.get("https://www.agoda.com/");
        System.out.println("First Url open in default browser: "+d.getCurrentUrl());

        // Selenium 4.X Version onwards - Direct focus to new Tab
        // Launch new web url in new tab
        d.switchTo().newWindow(WindowType.TAB);
        d.get("https://www.goibibo.com/");
        System.out.println("Next Url open in new Tab: "+d.getCurrentUrl());
        
        // Launch new web url in new browser window
        d.switchTo().newWindow(WindowType.WINDOW);
        d.get("https://www.oyorooms.com/");
        System.out.println("Third Url open in new browser window: "+d.getCurrentUrl());
        
        Thread.sleep(2500);
        d.quit();
	}

}
