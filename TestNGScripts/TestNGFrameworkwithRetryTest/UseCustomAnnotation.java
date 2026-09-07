package TestNGFrameworkwithRetryTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UseCustomAnnotation {
@Test
@Retrywhenfailed(10)
public void methodOne()
{
 System.out.println("Method One should retry multiple times");
 Assert.assertEquals(false, true);
}
@Test
public void methodTwo()
{
 System.out.println("Method Two should run in single go");
 Assert.assertEquals(false, true);
}
}
