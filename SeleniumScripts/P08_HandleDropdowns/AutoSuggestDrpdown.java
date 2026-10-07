package P08_HandleDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Method 1 — Pause JavaScript with F8
   > Open Google and type your search so the autosuggestions appear.
   > Open DevTools (F12 or Ctrl+Shift+I).
   > Go to Sources.
   > Return to the Google page and make the suggestions appear.
   > Quickly press F8.
 */
public class AutoSuggestDrpdown {

	public static void main(String[] args) {
		 WebDriver d = new ChromeDriver();
		 d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 d.get("https://www.google.com/");
		 d.findElement(By.name("q")).sendKeys("Robot");
		 List<WebElement> alllink1 = d.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']//span "));
		 for(WebElement linkelem: alllink1)
	     {
	      	System.out.println(linkelem.getText().trim()); 
	     }	 
	     System.out.println("Totallink: "+alllink1.size());
	     System.out.println("==================================");
	     
		 List<WebElement> alllink2 = d.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
		 for(WebElement linkelem: alllink2)
	     {
	      	System.out.println(linkelem.getText().trim()); 
	     }	 
	     System.out.println("Totallink: "+alllink2.size());
	     d.close();
	}

} 
