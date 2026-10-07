package P10_HandleMouseActions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
    WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://the-internet.herokuapp.com/context_menu");
    Actions act = new Actions(d);
    WebElement elem = d.findElement(By.cssSelector("#hot-spot"));
   
    act.contextClick(elem).perform();
    Thread.sleep(2000);
    Alert alt = d.switchTo().alert();
    System.out.println("Right Click Done: "+alt.getText());
    alt.accept();
    d.close();
	}

}
