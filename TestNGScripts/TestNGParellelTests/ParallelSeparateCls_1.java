package TestNGParellelTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelSeparateCls_1 {
WebDriver d;

@BeforeTest
public void Setup()
{
 System.setProperty("webdriver.chrome.driver","E:\\SHIV SCRIPTS\\TestData\\chromedriver.exe");
}

@Test
public void FirstChromego()
{
 d = new ChromeDriver();
 d.get("https://www.amazon.com");
 System.out.println(d.getTitle());
 System.out.println("First Thread id : "+ Thread.currentThread().getId());
}

@Test
public void SecondChromego()
{
 d = new ChromeDriver();
 d.get("https://www.myntra.com");
 System.out.println(d.getCurrentUrl());
 System.out.println("Next thread id : "+ Thread.currentThread().getId() );
}

}
