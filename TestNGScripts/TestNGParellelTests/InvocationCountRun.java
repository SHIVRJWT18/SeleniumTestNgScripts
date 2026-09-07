package TestNGParellelTests;

import org.testng.annotations.Test;

public class InvocationCountRun {
@Test(threadPoolSize=4,invocationCount=4,timeOut=1000)
public void method1()
{
 System.out.println("ThreadId is :"+ Thread.currentThread().getId());
}
}
