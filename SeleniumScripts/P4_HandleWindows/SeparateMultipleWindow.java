package P4_HandleWindows;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeparateMultipleWindow {

		public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.automationtesting.in/Windows.html");
		d.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
		d.findElement(By.cssSelector("div > button.btn.btn-info")).click();
		
		Set<String> multiwin = d.getWindowHandles();
		int count   = 0;
		for (String win : multiwin) {
			String urls = d.switchTo().window(win).getCurrentUrl();
			System.out.println(urls);
			count ++;
		}
		System.out.println("No. of Child Tabs: "+count);
	   }
		


	}


