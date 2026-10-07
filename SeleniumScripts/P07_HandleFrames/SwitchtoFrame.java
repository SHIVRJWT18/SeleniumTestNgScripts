package P07_HandleFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Way 1: driver.switchTo().frame(id);
// Way 2: driver.switchTo().frame(name);
// Way 3: driver.switchTo().frame(WebElement elem);
// Way 4: driver.switchTo().frame(index);
// d.switchTo().defaultContent();

public class SwitchtoFrame {

	public static void main(String[] args) throws InterruptedException {
	WebDriver cd = new ChromeDriver();
	cd.manage().window().maximize();
	cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	cd.get("https://ui.vision/demo/webtest/frames/");
    
	// Frame 1
	WebElement frame1 = cd.findElement(By.xpath("//frame[@src='frame_1.html']"));
	cd.switchTo().frame(frame1);
    
    cd.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Rakesh Bhadoria");
    Thread.sleep(3000);
    
    cd.switchTo().defaultContent(); // Switch to Main window
    
    // Frame 2
    cd.switchTo().frame(cd.findElement(By.xpath("//frame[@src='frame_2.html']")));
    cd.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Tannu Bhadoria");
    Thread.sleep(3000);
    
    cd.switchTo().defaultContent(); // Switch to Main window
    
    cd.close();
  }
}