package TestNGDependentTestcases;

import org.testng.annotations.Test;

public class DependOnSingleGroup {
@Test(groups = {"SignIN"})
public void profile()
{
 System.out.println("View ur profile");
}

@Test(dependsOnGroups = {"SignIN"})
public void logout()
{
System.out.println("Logout the app");
}

@Test(groups = {"SignIN"})
public void login()
{
System.out.println("Login the app");
}

@Test
public void Openapp()
{
System.out.println("App is opened");
}
}
