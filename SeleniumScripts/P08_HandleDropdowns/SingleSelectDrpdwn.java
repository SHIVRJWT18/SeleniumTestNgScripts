package P08_HandleDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDrpdwn {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
    d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    d.get("https://demoqa.com/select-menu");
    
    WebElement drpdown = d.findElement(By.id("oldSelectMenu")); 
    Select se = new Select(drpdown);
    
    se.selectByIndex(6);
    System.out.println("Selected by IndexOption: "+se.getFirstSelectedOption().getText());
    Thread.sleep(1000);
    
    se.selectByValue("10");
    System.out.println("Selected by ValueOption: "+se.getFirstSelectedOption().getText());
    Thread.sleep(1000);
    
    se.selectByVisibleText("Purple");
    System.out.println("Selected by VisibleTextOption: "+se.getFirstSelectedOption().getText());
    Thread.sleep(1000);
    
    // Capture dropdown options
    // getOptions() - Return all options from dropdown as WebElement
    List<WebElement> option = se.getOptions();
    System.out.println("Count: "+option.size());
    
    // Way 1: Iterating over element 
    for(int i=0;i<option.size();i++) {
     System.out.println(option.get(i).getText());
    }
    
    System.out.println("_________________");
    
    //Way 2: ForEach Loop
    for(WebElement elem : option)
    {
     System.out.println(elem.getText());	
    }	
    
    
    
    d.close();
	
	}

}
