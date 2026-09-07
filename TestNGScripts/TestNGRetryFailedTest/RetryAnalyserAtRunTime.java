package TestNGRetryFailedTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryAnalyserAtRunTime implements IAnnotationTransformer {
@Override
public void transform(ITestAnnotation anot,Class testClass,Constructor testConstructor,Method testMethod)
{
 anot.setRetryAnalyzer(RetryAnalyser.class);
}

}
