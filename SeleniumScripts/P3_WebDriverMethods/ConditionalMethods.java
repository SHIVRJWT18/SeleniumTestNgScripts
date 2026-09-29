package P3_WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://practicetestautomation.com/practice-test-login/");

		// 1. isDisplayed() -> Check display status
	    WebElement name = d.findElement(By.name("username"));
	    System.out.println("Element by name displayed? "+name.isDisplayed());

		// 2. isEnabled() -> Check operational status
	    WebElement id = d.findElement(By.id("password"));
	    System.out.println("Element by id enabled? "+id.isEnabled());

		// 3. isSelected() -> Check selection status
	    WebElement classname = d.findElement(By.className("btn"));
	    System.out.println("Element by classname selected? "+classname.isSelected());

	    d.close();
	}

}
