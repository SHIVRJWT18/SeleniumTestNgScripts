package HandleDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectDemo {

		public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demoqa.com/select-menu");
        Select sel = new Select(d.findElement(By.id("cars")));
		List<WebElement> opt1 = sel.getOptions();
		for(WebElement we1 : opt1) {
			System.out.println(we1.getText());
		}
	    if(sel.isMultiple())
	    {
		 sel.selectByVisibleText("Volvo");
		 sel.selectByVisibleText("Audi");
		 sel.selectByVisibleText("Saab");
		 sel.selectByVisibleText("Opel");
	     sel.deselectByValue("volvo");
		 sel.deselectByVisibleText("Audi");

		List<WebElement> opt2 = sel.getAllSelectedOptions();
		for(WebElement we2 : opt2) {
			System.out.println("Now Selected options are : "+ we2.getText());
		}
	    }
	    d.close();
	}


}
