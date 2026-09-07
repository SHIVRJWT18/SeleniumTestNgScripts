package HandleWebElements;



import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLink {
	static
    {
    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
    }
	public static void main(String[] args) {
    WebDriver d = new ChromeDriver();
    d.manage().window().maximize();

    d.get("https://demoqa.com/links");
	List<WebElement> ele = d.findElements(By.tagName("a"));
	System.out.println(ele.size());
	for(int i=1;i<ele.size();i++)
	{
	 WebElement elem = ele.get(i);
	 String url = elem.getAttribute("href");
	 System.out.println(url);
	 VerifyLink(url);
	// VerifyLink("https://demoqa.com/");
	}
   }

	public static void VerifyLink(String linkurl)
	{
	try {
	 URL url = new URL(linkurl);
	 HttpURLConnection urlconnec = (HttpURLConnection)url.openConnection();
	 urlconnec.setConnectTimeout(5000);
	 urlconnec.connect();
	 if(urlconnec.getResponseCode()>=400)
	 {
	  System.out.println("Broken Link = "+ urlconnec.getResponseMessage());
	 }
	 else
	 {
	  System.out.println("Working Link = "+ urlconnec.getResponseMessage());
	 }
	}
	catch (Exception e) {
		}

	}


	}

