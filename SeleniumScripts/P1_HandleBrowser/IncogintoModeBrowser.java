package P1_HandleBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class IncogintoModeBrowser {

	public static void main(String[] args)
	{
	 ChromeOptions co = new ChromeOptions();
	 co.addArguments("--incognito");
	 
     WebDriver d1 = new ChromeDriver(co);
     d1.get("https://www.guru99.com/");
 	 System.out.println("Chrome: "+d1.getTitle());
 	 d1.close();
 	 
 	 FirefoxOptions opts = new FirefoxOptions();
	 opts.addArguments("-private");
     WebDriver d2 = new FirefoxDriver(opts);
     d2.get("https://www.guru99.com/");
 	 System.out.println("Firefox: "+d2.getTitle());
 	 d2.close();


	}

}
