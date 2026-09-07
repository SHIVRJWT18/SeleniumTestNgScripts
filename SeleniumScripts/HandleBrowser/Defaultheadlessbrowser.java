package HandleBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Defaultheadlessbrowser {

	public static void main(String[] args) {
        ChromeOptions options1 = new ChromeOptions();
        options1.addArguments("--headless=new"); // modern headless mode

        WebDriver driver = new ChromeDriver(options1);

        driver.get("https://www.autoitscript.com/");
        System.out.println("Headless Chrome Title is: " + driver.getTitle());

        driver.quit();

        FirefoxOptions options = new FirefoxOptions();

        // Enable headless mode
        options.addArguments("--headless");

        // Launch Firefox in headless mode
         driver = new FirefoxDriver(options);

        driver.get("https://www.autoitscript.com/");

        System.out.println("Headless firefox Title is: " + driver.getTitle());

        driver.quit();
	}

}
