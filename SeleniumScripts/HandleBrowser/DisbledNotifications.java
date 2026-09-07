package HandleBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisbledNotifications {
static
{
 System.setProperty("webdriver.chrome.driver","./Sel.Drivers/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
    ChromeOptions co = new ChromeOptions();
    co.addArguments("--disable-notifications");
    WebDriver d = new ChromeDriver(co);
    Thread.sleep(2500);
    d.navigate().to("https://www.irctc.co.in/nget/train-search");
    System.out.println(d.getTitle());
    d.quit();
	}

}
