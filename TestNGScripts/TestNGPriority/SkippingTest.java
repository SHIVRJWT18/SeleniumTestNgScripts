package TestNGPriority;

import org.testng.annotations.Test;

public class SkippingTest {
@Test(priority=0)
public void m1()
{
 System.out.println("Method m1");
}
@Test(priority=-1)
public void m2()
{
 System.out.println("Method m2");
}
@Test(enabled = false)
public void m3()
{
 System.out.println("Method m3");
}

@Test(enabled = true)
public void m4()
{
 System.out.println("Method m4");
}
}
