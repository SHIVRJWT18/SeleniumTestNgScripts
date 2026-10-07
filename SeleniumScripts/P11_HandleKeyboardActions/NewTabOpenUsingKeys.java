package P11_HandleKeyboardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTabOpenUsingKeys {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://testautomationpractice.blogspot.com/");
		Actions act = new Actions(d);
	    WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));

		WebElement searchbox = d.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		searchbox.sendKeys("Python");
		d.findElement(By.cssSelector(".wikipedia-search-button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Wikipedia1_wikipedia-search-input")));
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1500);
		act.sendKeys(Keys.TAB).perform();
		
		
		// Ctrl+click()
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        List<String> winids = new ArrayList(d.getWindowHandles());
        d.switchTo().window(winids.get(1)); // Switch to new tab
        System.out.println("New Tab title: "+d.getTitle());
        
        d.quit();
	}

}
