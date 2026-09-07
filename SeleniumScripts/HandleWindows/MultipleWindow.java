package HandleWindows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
        static
	    {
	    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
	    }
		public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demoqa.com/browser-windows");
        d.findElement(By.xpath("//button[@id='windowButton']")).click();
		String prntwin = d.getWindowHandle();
		System.out.println(prntwin);
		Set<String> multiwin = d.getWindowHandles();
		int count   = 0;
		for (String win : multiwin) {
			System.out.println(win);
			count ++;
		}
		System.out.println("No. of Child Tabs: "+count);
	   }



	}


