package P3_WebDriverMethods;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/*  Types of wait Commands:
 * Implicit Wait - Single time/one stmt and applicable for all the elements
 * Explicit Wait - It will consider condition with time and specific to the element
 * Fluent Wait
 * */

public class WaitingMethods {
  
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		// 1. Implicit Wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        d.get("https://demowebshop.tricentis.com/");
        System.out.println(d.getTitle());
        d.findElement(By.name("q")).sendKeys("camera");
	   
	    
	    // 2. Explicit Wait 
	    WebDriverWait mywait = new WebDriverWait(d,Duration.ofSeconds(10)); // declaration
	    WebElement serch = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Search'])[1]")));
	    serch.click();
	    
	    WebElement advserch = mywait.until(ExpectedConditions.elementToBeClickable(By.name("As")));
	    System.out.println(advserch.isDisplayed());
	    
	    //3. Fluent Wait
	    Wait<WebDriver> fluwait = new FluentWait<WebDriver>(d)       // declaration
	                              .withTimeout(Duration.ofSeconds(10))
	                              .pollingEvery(Duration.ofSeconds(4))
	                              .ignoring(NoSuchElementException.class);
	    		
	   WebElement prddetails = fluwait.until(new Function<WebDriver,WebElement>() {
			                       public WebElement apply(WebDriver d) {
		                           return d.findElement(By.cssSelector("h2.product-title [href='/digital-slr-camera']"));
			                       }  
	                               });
	   System.out.println("Product: "+prddetails.getText());
	   
	   d.close();
	   
			   
	}

}
