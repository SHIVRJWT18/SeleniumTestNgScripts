package P1_HandleBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Diffntbowsrversion {

	public static void main(String[] args) {
        ChromeOptions options1 = new ChromeOptions();

        // Path to specific Chrome version installed on your system
        options1.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver = new ChromeDriver(options1);
        driver.get("https://www.google.com");
        System.out.println("Old Chrome Version Title: " + driver.getTitle());

        /*   FirefoxOptions options2 = new FirefoxOptions();
        options2.setBinary("<Path to specific Firefox version installed>");
        driver = new FirefoxDriver(options2);
        driver.get("https://www.google.com");
        System.out.println("Firefox Title: " + driver.getTitle());
      */  
        driver.quit();

	}

}
