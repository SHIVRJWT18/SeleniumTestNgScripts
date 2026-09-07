package AnnotationFlow;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodDemo {


@BeforeMethod
public void loginApp()
{
 System.out.println("Login executes before testcases execution");
}

@AfterMethod
public void logoutApp()
{
 System.out.println("Logout executes after testcases execution");
 System.out.println("========================");

}

@Test
public void verfiyHomePage()
{
 System.out.println("First Testcases execution is progressing");
}

@Test
public void verfiyPaymentPage()
{
 System.out.println("Next Testcases execution is progressing");
}

}
