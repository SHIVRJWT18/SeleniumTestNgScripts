package P5_HandleWebElements;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbuttons {

		public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://testautomationpractice.blogspot.com/");
		
		//1. Select specific Checkbox
		WebElement elem = d.findElement(By.cssSelector("input#sunday"));
		System.out.println("Checkbox intial status: "+elem.isSelected());
        elem.click();
		System.out.println("Checkbox now status: "+elem.isSelected());
		System.out.println("=========================");
		
        //2. Select all checkboxes
		List<WebElement> elem1 = d.findElements(By.cssSelector(".form-check-input[type=\"checkbox\"]"));
		for(WebElement chbx : elem1)
		{
	        chbx.click();
			System.out.println("Checkbox now status: "+chbx.isSelected());	
		}		
	    System.out.println("=========================");
	    
	    /*3. Unselect last 3 checkboxes 
	    * Total no. of checkbox - how many you want -> starting index 
	    * e.g 7-3= 4
	    */
	    for(int i=4;i<elem1.size();i++)
	    {
			System.out.println("Checkbox"+ (i+1) +" status: "+elem1.get(i).isSelected());	
            elem1.get(i).click();
			System.out.println("Checkbox"+ (i+1) +" status: "+elem1.get(i).isSelected());	
	    }	
	    
	    System.out.println("=========================");

	    //4. Select first ,forth and last check box only 
	    for (int i = 0; i < elem1.size(); i++) {
	    boolean shouldBeSelected = (i == 0 || i == 3 || i == 6);
	    
	    if (shouldBeSelected && !elem1.get(i).isSelected()) {
	     elem1.get(i).click();
	    } 
	        
	    else if (!shouldBeSelected && elem1.get(i).isSelected()) {
	            elem1.get(i).click();
	    }

	    System.out.println("Checkbox " + (i + 1) + " status: " + elem1.get(i).isSelected());
	    }
	    
	    d.close();
	}

}
