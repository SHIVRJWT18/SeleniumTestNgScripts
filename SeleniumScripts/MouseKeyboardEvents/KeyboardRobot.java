package MouseKeyboardEvents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardRobot {
    static
    {
     System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
    }
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Runtime.getRuntime().exec("Notepad");
	Robot r = new Robot();
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_R);
	r.keyRelease(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_J);
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_W);
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_T);
	}

}
