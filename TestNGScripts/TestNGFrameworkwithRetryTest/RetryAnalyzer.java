package TestNGFrameworkwithRetryTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
int counter =0;

@Override
public boolean retry(ITestResult result)
{
 Retrywhenfailed rwf = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Retrywhenfailed.class);
 if((rwf !=null) && (counter<rwf.value()))
 {
  counter++;
  return true;
 }
 return false;
}
}
