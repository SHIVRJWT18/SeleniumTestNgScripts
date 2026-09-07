package TestNGDependentTestcases;

import org.testng.annotations.Test;

public class DependOnSingleTest {
@Test(dependsOnMethods = {"Openapp"})
public void SignIn()
{
 System.out.println("SignIn execute after Openapp() method");
}

@Test(dependsOnMethods = {"SignIn"})
public void Logout()
{
 System.out.println("Logout execute after SignIn() method");
}

@Test
public void Openapp()
{
	 System.out.println("This will execute as first method");
}

}
