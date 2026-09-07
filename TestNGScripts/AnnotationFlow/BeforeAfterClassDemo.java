package AnnotationFlow;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterClassDemo {

@BeforeSuite
public void openBrowser()
{
 System.out.println("==========Before==Suite==========");
 System.out.println("Launch browser only once before testcases execution starts");
}

@AfterSuite
public void closeBrowser()
{
 System.out.println("==========After==Suite==========");
 System.out.println("Close browser only once after all testcases execution compelted");
}

@BeforeTest
public void openUrl()
{
 System.out.println("==========Before==Test==========");
 System.out.println("Launch Url only once before testcases execution starts");
}

@AfterTest
public void closeOtherTab()
{
 System.out.println("==========After==Test==========");

 System.out.println("Close other tabs only once after all testcases execution compelted");
}

@BeforeClass
public void registerUser()
{
 System.out.println("==========Before==Class==========");
 System.out.println("Register User only once before testcases execution starts");
}

@AfterClass
public void deleteUser()
{
 System.out.println("==========After==Class==========");
 System.out.println("Delete User only once after all testcases execution compelted");
}

@BeforeMethod
public void loginApp()
{
 System.out.println("==========Before==Method==========");
 System.out.println("User start Login process before testcases execution");
}

@AfterMethod
public void logoutApp()
{
 System.out.println("==========After==Method==========");
 System.out.println("User should Logout after testcases execution");
}

@Test
public void verifyHomePage()
{
 System.out.println("First Testcases execution is progressing");
}

@Test
public void verifyPaymentPage()
{
 System.out.println("Next Testcases execution is progressing");
 System.out.println("==========XXXXXXX==========");
}


}
