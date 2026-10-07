package P10_HandleMouseActions;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDropWithinCoordinates {

	public static void main(String[] args) throws AWTException, InterruptedException {
    WebDriver d = new ChromeDriver();
    d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    d.get("https://the-internet.herokuapp.com/drag_and_drop");

    WebElement src = d.findElement(By.id("column-a"));
    WebElement target = d.findElement(By.id("column-b"));

    // Get source coordinates
    int x1 = src.getLocation().getX();
    int y1 = src.getLocation().getY();

    // Get target coordinates
    int x2 = target.getLocation().getX();
    int y2 = target.getLocation().getY();

    // Print coordinates
    System.out.println("Source Coordinates:");
    System.out.println("x1 = " + x1);
    System.out.println("y1 = " + y1);

    System.out.println("\nTarget Coordinates:");
    System.out.println("x2 = " + x2);
    System.out.println("y2 = " + y2);

    // Calculate relative offset
    int xOffset = x2 - x1;
    int yOffset = y2 - y1;

    System.out.println("\nCalculated Offset:");
    System.out.println("xOffset = " + xOffset);
    System.out.println("yOffset = " + yOffset);

    // Create Actions object
    Actions a = new Actions(d);

    // Drag source using calculated coordinates
    a.dragAndDropBy(src, xOffset, yOffset).perform();

    Thread.sleep(2000);

    System.out.println("\nDragged and dropped successfully using coordinates.");


    d.close();
 }
}