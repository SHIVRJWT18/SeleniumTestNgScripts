package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenersAtClsLevel implements ITestListener {

@Override
public void onStart(ITestContext ctx)
{
 System.out.println("On Start Method Started");
}

@Override
public void onFinish(ITestContext ctx)
{
 System.out.println("On Finish Method started");
}

@Override
public void onTestStart(ITestResult rslt)
{
 System.out.println("New Test Started " + rslt.getName());
}
@Override
public void onTestSuccess(ITestResult rslt)
{
 System.out.println("onTestSuccess Method " + rslt.getName());
}
@Override
public void onTestFailure(ITestResult rslt)
{
 System.out.println("onTestFailure Method " + rslt.getName());
}
@Override
public void onTestSkipped(ITestResult rslt)
{
 System.out.println("onTestSkipped Method " + rslt.getName());
}
public void onTestFailedButSuccessPercentage(ITestResult rslt)
{
 System.out.println("onTestFailedButSuccessPercentage "+rslt.getName());
}
}
