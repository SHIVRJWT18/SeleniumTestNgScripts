package TestNGParellelTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelRun {
public static WebDriver d;
  @BeforeClass
  public void Setup()
  {
   System.setProperty("webdriver.chrome.driver","E:\\SHIV SCRIPTS\\TestData\\chromedriver.exe");
   System.setProperty("webdriver.gecko.driver","E:\\SHIV SCRIPTS\\TestData\\geckodriver.exe");
  }


    @Test
	public void Onego()
	{
	 d = new FirefoxDriver();
	 d.get("https://www.amazon.com");
	 System.out.println(d.getTitle());
	 System.out.println("First Thread id : "+ Thread.currentThread().getId());
	}
    @Test
    public void Nextgo()
    {
     d = new ChromeDriver();
     d.get("https://www.amazon.com");
     System.out.println(d.getCurrentUrl());
     System.out.println("Next thread id : "+ Thread.currentThread().getId() );
    }
}
