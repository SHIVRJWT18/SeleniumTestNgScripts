package P10_HandleMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
    WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://the-internet.herokuapp.com/hovers");
    
	Actions act = new Actions(d);
    WebElement elem1 = d.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
    
    // Way 1:
    act.click(elem1).perform(); // perform() - Internally build the action then execute
    Thread.sleep(2000);
    String hoverElem = d.findElement(By.xpath("(//h5)[1]")).getText();
    System.out.println("Mouse Hovered On:-  "+hoverElem);
    
    // Way 2: 
    WebElement elem2 = d.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
    act.moveToElement(elem2).build().perform(); // build() - Create an action | perfrom() - Execute the action
    Thread.sleep(2000);
    hoverElem = d.findElement(By.xpath("(//h5)[2]")).getText();
    System.out.println("Mouse Hovered On:-  "+hoverElem);
    
    // Way 3: 
    WebElement elem3 = d.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));
    act.moveToElement(elem3).click().perform(); // perform() - Internally build all the action then execute
    Thread.sleep(2000);
    hoverElem = d.findElement(By.xpath("(//h5)[3]")).getText();
    System.out.println("Mouse Hovered On:-  "+hoverElem);
    d.close();
	}

}
