package MouseKeyboardEvents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseRobot {
	static
    {
     System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
    }
	public static void main(String[] args) throws AWTException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    d.get("https://www.toolsqa.com/selenium-training");
    Dimension i = d.manage().window().getSize();
    int x = i.getHeight();
    int y = i.getWidth();
    System.out.println("X = "+ x+ "     "+"Y = "+y);
    int x0 = x/3;
    int y0 = y/3;
    System.out.println("X = "+ x0+ "     "+"Y = "+y0);
    Robot r = new Robot();
     r.mouseMove(x,y);
     r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
     r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
     System.out.println("Mouse actions by robot class done Sucessfully");

     d.close();
	}



}
