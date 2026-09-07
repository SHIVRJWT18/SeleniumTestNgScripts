package HandleWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
        static
	    {
	    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
	    }
		public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.demoqa.com/webtables");
		WebElement we = d.findElement(By.xpath("//div[text()='alden@example.com']"));
		System.out.println(we.getText());

	}

}
