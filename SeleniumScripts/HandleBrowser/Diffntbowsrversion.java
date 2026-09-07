package HandleBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Diffntbowsrversion {

	public static void main(String[] args) {
        ChromeOptions options1 = new ChromeOptions();

        // Path to specific Chrome version installed on your system
        options1.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

        WebDriver driver = new ChromeDriver(options1);

        driver.get("https://www.google.com");
        System.out.println("Chrome Title: " + driver.getTitle());

        driver.quit();

        FirefoxOptions options2 = new FirefoxOptions();

        // Path to specific Firefox version installed
      //  options2.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        WebDriver driver1 = new FirefoxDriver(options2);

        driver1.get("https://www.google.com");
        System.out.println("Firefox Title: " + driver1.getTitle());

        driver1.quit();

	}

}
