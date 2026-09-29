package P2_SeleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* CSS - Cascading Style Sheets 
 * Possible Combination -
 * tagname + id => tag#id
 * tagname + classname => tag.classname
 * tagname + attributevalue => tag[attribute="value"]
 * tagname + class + attribute =>tag.classname[attribute="value"]  
*/
public class CSSLocators {

	public static void main(String[] args) {
	    WebDriver d = new ChromeDriver();
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.manage().window().maximize();
	    d.get("https://practicetestautomation.com/practice-test-login/");
	    
	    // tag+ id 
	    String tagid = d.findElement(By.cssSelector("div#form")).getText();
	    System.out.println("Text of tagId: "+tagid);
	    System.out.println("__________________________");
	    
	    // tag + class
	    String tagclass = d.findElement(By.cssSelector("button.btn")).getText();
	    System.out.println("Text of tagClass: "+tagclass);
	    System.out.println("__________________________");
	    
	    // tag + attribute
	    String tagattribute = d.findElement(By.cssSelector("label[for=\"password\"]")).getText();
	    System.out.println("Text of tagAttribute: "+tagattribute);
	    System.out.println("__________________________");
	    
	    // tag + class + attribute 
	    String tagclassattribute = d.findElement(By.cssSelector("button.btn[id=\"submit\"]")).getText();
	    System.out.println("Text of tagClassAttribute: "+tagclassattribute);
	    System.out.println("__________________________");
	    
	    // tag is optional for id, class and attribute
	    boolean tagOptionalforClass = d.findElement(By.cssSelector(".design-credit")).isDisplayed();
	    System.out.println(tagOptionalforClass);
	    
	    boolean tagOptionalforid = d.findElement(By.cssSelector("#form")).isDisplayed();
	    System.out.println(tagOptionalforid);
	    
	    boolean tagOptionalforattribute = d.findElement(By.cssSelector("[id=\"error\"]")).isDisplayed();
	    System.out.println(tagOptionalforattribute);
	    
	    boolean tagOptionalforclassattribute = d.findElement(By.cssSelector(".btn[id=\"submit\"]")).isDisplayed();
	    System.out.println(tagOptionalforclassattribute);
	    d.close();
	}

}
