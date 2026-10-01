package P4_HandleWindows;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSeparateWindow {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.automationtesting.in/Windows.html");
		d.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		d.findElement(By.cssSelector("button.btn.btn-primary")).click();

		Set<String> alltabs = d.getWindowHandles();
		int count   = 0;
		for (String win : alltabs) {
			String gettitle = d.switchTo().window(win).getTitle();
			System.out.println(gettitle);
			count ++;
			if(gettitle.equalsIgnoreCase("Selenium"))
			{
				d.close();
			}	
		}
		System.out.println("No. of Child Tabs: "+count);
		d.quit();
	   }

	}


