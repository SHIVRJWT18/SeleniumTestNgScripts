package HandleFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoNestedFrame {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	d.get("https://demoqa.com/nestedframes");
	// Parent Frame 
	int countfrm = d.findElements(By.tagName("iframe")).size();
	System.out.println(countfrm);
	
	WebElement Pfrm = d.findElement(By.id("frame1"));
	d.switchTo().frame(Pfrm);
	
	WebElement ptxt =  d.findElement(By.xpath("//body[contains(text(),'Parent frame')]"));
	System.out.println(ptxt.getText());
    d.switchTo().frame(0); // Prefer to use index if no multiple frame present
    
    // Child Frame
	WebElement Ctxt = d.findElement(By.xpath("//p[contains(text(),'Child Iframe')]"));
	System.out.println(Ctxt.getText());

    d.switchTo().defaultContent();
    
    WebElement Mtxt = d.findElement(By.xpath("//div[contains(text(),'Sample')]"));
    System.out.println(Mtxt.getText());
    d.close();

	}
}
