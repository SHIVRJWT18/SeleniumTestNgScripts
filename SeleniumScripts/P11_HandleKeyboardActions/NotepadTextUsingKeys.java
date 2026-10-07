package P11_HandleKeyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotepadTextUsingKeys {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//ProcessBuilder builder = new ProcessBuilder("notepad.exe");
	//Process process = builder.start();
	
	new ProcessBuilder("notepad.exe").start();
	Robot robot = new Robot();
	robot.delay(1000);
	// Type "RAJAWAT"
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyRelease(KeyEvent.VK_R);
	robot.keyRelease(KeyEvent.VK_SHIFT);

	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);

	robot.keyPress(KeyEvent.VK_J);
	robot.keyRelease(KeyEvent.VK_J);

	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);

	robot.keyPress(KeyEvent.VK_W);
	robot.keyRelease(KeyEvent.VK_W);

	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);

	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_T);
	}

}
