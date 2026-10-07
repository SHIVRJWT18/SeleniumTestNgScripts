package P10_HandleMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropAction {

	public static void main(String[] args) {
	    WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Way 1:
	    d.get("https://demoqa.com/droppable/");
	    WebElement src = d.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target = d.findElement(By.xpath("(//*[@id=\"droppable\"])[1]"));
	    Actions act = new Actions(d);
	    act.dragAndDrop(src, target).perform();
	    System.out.println("Droped Sucessfully");
	    
	    // Way 2:
	    d.get("https://the-internet.herokuapp.com/drag_and_drop");
	    src = d.findElement(By.id("column-a"));
		target = d.findElement(By.cssSelector("#column-b"));
		int x1 = src.getLocation().getX();
		int y1 = src.getLocation().getY();
		int x2 = target.getLocation().getX();
		int y2 = target.getLocation().getY();
		System.out.println("x1= "+x1+" "+"x2= "+x2+" || "+"y1= "+y1+"  "+"y2= "+y2);
	    Actions a = new Actions(d);
	    a.dragAndDropBy(src, 100, 100).perform();
	    System.out.println("Droped within coordinate Sucessfully");
	    
	    d.close();

	} 

}
