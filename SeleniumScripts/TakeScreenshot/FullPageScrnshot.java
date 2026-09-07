package TakeScreenshot;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class FullPageScrnshot {
	@Test
	public void setup() throws InterruptedException, WebDriverException, IOException
	{
	 System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
	 WebDriver d = new ChromeDriver();
	 d.manage().window().maximize();
	 d.get("https://www.amazon.in/");
     WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));

	 WebElement searchBox = wait.until(
             ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox"))
     );
     searchBox.sendKeys("Mi Mobiles");
     d.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[2]/div[1]/form[1]/div[3]/div[1]")).click();
	 Thread.sleep(500);

	// TODO: fix this locator later
	 WebElement actprice =d.findElement(By.xpath("//span[text()='Redmi 9 (Sky Blue, 4GB RAM, 64GB Storage) | 2.3GHz Mediatek Helio G35 Octa core Processor']/ancestor::div[@class='a-section a-spacing-none']/descendant::span[@class='a-price']"));
	 WebElement disprice= d.findElement(By.xpath("//span[text()='Redmi 9 (Sky Blue, 4GB RAM, 64GB Storage) | 2.3GHz Mediatek Helio G35 Octa core Processor']/../../../../div[3]/div[1]/div/div[1]/div[2]/a/span[2]"));
	 System.out.println(actprice.getText());
	 System.out.println(disprice.getText());
	 JavascriptExecutor js = (JavascriptExecutor)d;
	 js.executeScript("window.scrollBy(0,1700)");

	// ScreenShot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(d);
   //  ImageIO.write(s.getImage(),"PNG",new File("./Photo/fullPageShot.png"));

	 d.close();

}
}