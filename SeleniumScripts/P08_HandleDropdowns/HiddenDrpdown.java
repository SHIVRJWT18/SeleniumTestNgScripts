package P08_HandleDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Hidden drop down - Drop down present in the DOM but not visible on the UI
public class HiddenDrpdown {

	public static void main(String[] args) {
     WebDriver cd = new ChromeDriver();
     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     
     cd.findElement(By.name("username")).sendKeys("Admin");
     cd.findElement(By.name("password")).sendKeys("admin123");
     cd.findElement(By.xpath("//*[@id=\"app\"]//button")).click();
     System.out.println("Get Page Title: "+ cd.getTitle());
     
     cd.findElement(By.xpath("//a[@class='oxd-main-menu-item active'] ")).click();
     
     cd.findElement(By.xpath("//label[text()='Sub Unit']/following::div[@class='oxd-select-text-input']'] ")).click();
   
     cd.close();
     
     
     
	 
	
	}

}
