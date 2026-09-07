package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
        static
	    {
	    	System.setProperty("webdriver.chrome.driver", "./Sel.Drivers/chromedriver.exe");
	    }
		public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.jio.com/");
		Thread.sleep(9000);
	    TakesScreenshot ts = (TakesScreenshot)d;
	    File f1 = ts.getScreenshotAs(OutputType.FILE);
	    File f2 = new File("./Photo/pic1.png");
	    FileUtils.copyFile(f1, f2);
	    FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File("./Photo/pic2.png"));

		 d.close();

	}

}
