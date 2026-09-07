package TestNGDependentTestcases;

import org.testng.annotations.Test;

public class DependonMultipleTest {

@Test
public void openBrowser()
{
 System.out.println("Launch the browser");
}

@Test(dependsOnMethods = {"openBrowser"}) // Single test
public void login()
{
 System.out.println("Login the application");
}

@Test(dependsOnMethods = {"openBrowser","login"}) // Multiple test
public void viewProfile()
{
 System.out.println("Click on Profile");
 System.out.println("Profile page is opened");
}

@Test(dependsOnMethods = {"openBrowser","login","viewProfile"})  // Multiple test
public void logout()
{
 System.out.println("Logout the application");
}
}
