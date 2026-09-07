package TestNGDependentTestcases;

import org.testng.annotations.Test;

public class DependsonMultipleGroup {
	@Test(groups = {"SignIN"})
	public void profile()
	{
	 System.out.println("View ur profile");
	}

	@Test(groups = {"SignOut"})
	public void logout()
	{
	 System.out.println("Logout the app");
	}

	@Test(groups = {"SignIn"})
	public void login()
	{
	 System.out.println("Login the app");
	}

	@Test(groups = {"LaunchApp"})
	public void Openapp()
	{
	 System.out.println("App is opened");
	}

}
