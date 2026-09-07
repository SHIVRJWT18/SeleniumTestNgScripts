package TestNGGroups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngGrps {
  public  WebDriver d;

@Test(groups= {"MyGroup"})
 public void Setup()
 {
	 System.setProperty("webdriver.chrome.driver", "./Tstng.Drivers/chromedriver.exe");
	 d = new ChromeDriver();
	 d.manage().window().maximize();
	 d.get("https://demoqa.com/");
 }

@Test(groups= {"MyGroup"})
public void chkURL()
{
 System.out.println(d.getCurrentUrl());
 String exptitle = "ToolsQA";
 String curtitle = d.getTitle();
 Assert.assertEquals(curtitle, exptitle);
}
@Test(groups= {"Chkwebpage"})
public void clickElement() throws InterruptedException
{
 d.findElement(By.xpath("//h5[text()='Forms']")).click();
 WebElement ele = d.findElement(By.xpath("//div[text()='Please select an item from left to start practice.']"));
 System.out.println(ele.getText());
 d.navigate().back();
}

}







