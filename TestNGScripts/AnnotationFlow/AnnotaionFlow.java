package AnnotationFlow;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotaionFlow {
@Test
public void TCOne()
{
 System.out.println("General Test case Executes");
}
@BeforeMethod
public void beforeMethod()
{
 System.out.println("Before Method Executes");
}
@BeforeClass
public void beforeClass()
{
 System.out.println("Before Class Executes");
}
@BeforeTest
public void beforeTest()
{
 System.out.println("Before Test Executes");
}
@AfterMethod
public void afterMethod()
{
 System.out.println("After Method Executes");
}
@AfterClass
public void afterClass()
{
 System.out.println("After Class Executes");
}
@AfterTest
public void afterTest()
{
 System.out.println("After Test Executes");
}
@BeforeSuite
public void beforeSuite()
{
	 System.out.println("Before Suite Executes");
}
@AfterSuite
public void afterSuite()
{
	 System.out.println("After Suite Executes");
}
@AfterGroups
public void afterGroup()
{
	 System.out.println("After Groups Executes");
}
@BeforeGroups
public void beforeGroup()
{
	 System.out.println("Before Groups Executes");
}


}








