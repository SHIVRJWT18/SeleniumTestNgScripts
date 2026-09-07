package TestNGRetryFailedTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetrywithinTestclass {
@Test(retryAnalyzer=TestNGRetryFailedTest.RetryAnalyser.class)
public void firstTestcase()
{
 System.out.println("First Testcase should retry again & again");
 Assert.assertEquals(false, true);
}

@Test
public void nextTestcase()
{
 System.out.println("Next Test should run in 1 go");
 Assert.assertEquals(false, true);
}
}
