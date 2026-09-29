package HandleDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HD2_MultiSelectDrpdwn {

		public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.get("https://demoqa.com/select-menu");
	    
	    Select se = new Select(d.findElement(By.id("cars")));
	    System.out.println("Check Multiple?: "+se.isMultiple());
	    
	    if(se.isMultiple())
	    {
	    se.selectByIndex(1);
	    se.selectByIndex(2);
        Thread.sleep(1000);

	    se.selectByValue("volvo");
	    se.selectByValue("audi");

	    Thread.sleep(1000);
	    se.selectByVisibleText("Volvo");
	    se.selectByVisibleText("Opel");
	    }
	    
        // Get all selected options
        List<WebElement> selectedOptions = se.getAllSelectedOptions();

        System.out.println("Selected options:");

        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
	    
	    d.close();
	}
 }

