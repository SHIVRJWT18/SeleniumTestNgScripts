package TestNGRetryFailedTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetrywithinRuntime {
	@Test
	public void firstTestcase()
	{
	 System.out.println("First Testcase should run in 1 go");
	 Assert.assertEquals(true, true);
	}
	@Test
	public void nextTestcase()
	{
	 System.out.println("Next Test should retry again at runtime");
	 Assert.assertEquals(false, true);
	}
}
