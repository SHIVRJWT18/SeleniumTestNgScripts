package TestNGDataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDtaproviderExcel {
private static WebDriver d;

 @BeforeClass
 public void Setup()
 {
  System.setProperty("webdriver.gecko.driver","E:\\SHIV SCRIPTS\\TestData\\geckodriver.exe");
 }

 @DataProvider(name ="Auth")
 public static Object[][] credentilas()
 {
  return new Object[][] {{"gunjankaushik","Password@123"},{"Deepak","Pass123"},{"Ravikumar","Monet@123"}};
 }

@Test(dataProvider = "Auth")
public void act(String Email,String Password)
{
 d = new FirefoxDriver();
 d.manage().window().maximize();
 d.get("https://demoqa.com/login");
 d.findElement(By.id("userName")).sendKeys(Email);
 d.findElement(By.id("password")).sendKeys(Password);
 d.findElement(By.id("login")).click();
}







}
