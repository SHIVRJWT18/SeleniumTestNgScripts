package P01_HandleBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisbledNotifications {

	public static void main(String[] args) throws InterruptedException {
    ChromeOptions co = new ChromeOptions();
    co.addArguments("--disable-notifications");
    WebDriver d = new ChromeDriver(co);
    Thread.sleep(2500);
    d.get("https://www.irctc.co.in/nget/train-search");
    System.out.println(d.getTitle());
    d.close();
	}

}
