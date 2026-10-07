package P08_HandleDropdowns;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Bootstrap drop down - It is a hidden drop down, which is not having select tag.
public class BootstrapDrpdown {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver d = new ChromeDriver();
	 d.manage().window().maximize();
	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 d.get("https://coreui.io/bootstrap/docs/forms/multi-select/");
     System.out.println("Get Title: "+d.getTitle());
  
     // Single Select Dropdown:
     WebElement sdrpdwn = d.findElement(By.xpath("//div[contains(@class,'docs-sidebar-framework')]//button"));
     sdrpdwn.click();
     List<WebElement> optn = d.findElements(By.xpath("//div[text()='Framework:']/following::ul[1]//a"));
     System.out.println("Count: "+optn.size());
     for(int i=0;i<optn.size();i++)
     {
      WebElement elem = optn.get(i);
      System.out.println(elem.getText());
     }	 
     d.findElement(By.xpath("//div[text()='Framework:']/following::ul[1]//a[normalize-space()='Angular']")).click(); 
     sdrpdwn = d.findElement(By.xpath("//div[text()='Framework:']/following-sibling::div//button"));
     System.out.println("Get Text: " +sdrpdwn.getText());
     
     // Multi Select Dropdown:
     d.get("https://coreui.io/bootstrap/docs/forms/multi-select/");
     JavascriptExecutor js = (JavascriptExecutor)d; 
     WebElement dropdwn = d.findElement(By.xpath("//input[@id='search-ms1']"));
     js.executeScript("arguments[0].scrollIntoView({block:'center'});",dropdwn);
     Thread.sleep(5000);
     dropdwn.click();
     optn = d.findElements(By.xpath("//select[@id='ms1']/following-sibling::div[2]//div"));
     System.out.println("M Count: "+optn.size());
     System.out.println("==Get All Multi Options==");
     for(WebElement elem :optn)
     {
      System.out.println(elem.getText());	 
     }	
     
     for(WebElement elem :optn)
     {
      if(elem.getText().equals("Laravel") || elem.getText().equals("Django") || elem.getText().equals("Bootstrap"))
      {
    	  js.executeScript("arguments[0].scrollIntoView({block:'center'});",elem);
    	  Thread.sleep(5000);
    	  elem.click();
      }	  
     }	
     System.out.println("==Multi Selected Options==");
     List<WebElement> getSelected = d.findElements(By.xpath("//select[@id='ms1']/following-sibling::div[1]/div[1]//div"));
     for(WebElement elem :getSelected)
     {
       System.out.println(elem.getText());	 
     }	 
   
      d.close();

      }
}