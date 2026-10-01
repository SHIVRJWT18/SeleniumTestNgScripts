package P5_HandleWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://testautomationpractice.blogspot.com/");
	// 1. Select radio for male
	WebElement male = d.findElement(By.cssSelector(".form-check-input[value=\"male\"]"));
    System.out.println("Radio inital status: "+male.isSelected());
    male.click();
    System.out.println("Radio now status: "+male.isSelected());
    System.out.println("=================");
    //2. select female radio if male is already selected
    List<WebElement> radio = d.findElements(By.cssSelector(".form-check-input[type=\"radio\"]"));
    for(int i=0;i<radio.size()-1;i++)
    {
     if(radio.get(i).isSelected()==true)
     {
      radio.get(i+1).click();
      System.out.println("Radio "+(i+1)+" is selected");
     }	 
    }
	WebElement female = d.findElement(By.cssSelector(".form-check-input[value=\"female\"]"));
    System.out.println("Radio now status: "+female.isSelected());

    d.close(); 



	}

}
