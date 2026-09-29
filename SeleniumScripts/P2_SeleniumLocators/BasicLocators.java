package P2_SeleniumLocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* Locators:-
 * We can identify various element on the web using locators
   Locators are the address that identify a unique web element within the HTML Page
   Types of Locators:
   1. Id 2. Name 3. Linked Text 4. Partial Linked Text 
   5. TagName 6. CSS Selector 7. XPath 8. ClassName
   
*/	
public class BasicLocators {
    
	public static void main(String[] args) throws InterruptedException {
    WebDriver d = new ChromeDriver();
    d.manage().window().maximize();
    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    d.get("https://practicetestautomation.com/practice-test-login/");
    
    WebElement name = d.findElement(By.name("username"));
    name.sendKeys("admin1236");
    System.out.println("Element by name displayed? "+name.isDisplayed());
    
    WebElement id = d.findElement(By.id("password"));
    id.sendKeys("pksid123");
    System.out.println("Element by id displayed? "+id.isDisplayed());

    WebElement tagname = d.findElement(By.tagName("h2"));
    System.out.println("Element by tagname: "+tagname.getTagName());
    
    WebElement classname = d.findElement(By.className("btn"));
    System.out.println("Element by classname enabled? "+classname.isEnabled());

    WebElement linktext = d.findElement(By.linkText("Privacy Policy"));
    System.out.println("Element by linktext: "+linktext.getText());

    WebElement prtlinktext = d.findElement(By.partialLinkText("mation"));
    System.out.println("Element by partiallinktext: "+prtlinktext.getText());
    Thread.sleep(2000);
    
    // Tagname & Classname used to find multiple WebElements
    List<WebElement> testcases = d.findElements(By.tagName("h5"));
    System.out.println(testcases.size());
    
    List<WebElement> blockseparator = d.findElements(By.className("wp-block-separator"));
    System.out.println(blockseparator.size());
		
    d.close();		
	}

}
