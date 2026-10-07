package P11_HandleKeyboardActions;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteUsingKeys {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://text-compare.com/");
	WebElement area1 = d.findElement(By.cssSelector("[name='text1']"));
	area1.sendKeys("Welcome to this area. Continue to write.. ");
	
	Actions act = new Actions(d);
	// KeyDown used for Key press and KeyUp used for key release
	
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); // CTRL+A
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform(); // CTRL+C
	act.sendKeys(Keys.TAB).perform();
    Thread.sleep(2000);   
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform(); // CTRL+V
	
	Thread.sleep(2000);
	WebElement area2 = d.findElement(By.cssSelector("[name='text2']"));
	System.out.println("Pasted Text: "+area2.getAttribute("value"));
	d.close();
	

	}

}
