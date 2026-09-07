package TestNGAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
@Test
public void Openapp()
{
 System.setProperty("webdriver.chrome.driver","E:\\SHIV SCRIPTS\\TestData\\chromedriver.exe");
 WebDriver d = new ChromeDriver();
 SoftAssert soft = new SoftAssert();
 Reporter.log("This testcase is used for title verification",true);
 d.get("https://www.amazon.in");
 String exptitle1 = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
 String exptitle2 = "ToolsQA";
 String acttitle = d.getTitle();
 soft.assertEquals(acttitle, exptitle1, "Verification not success");
 System.out.println("*******Checking for next*****");
 soft.assertEquals(acttitle, exptitle2,"Verification is success");
 d.close();
 soft.assertAll(); // mandatory to fail the soft assert otherwise it will pass the testcase

}
}
