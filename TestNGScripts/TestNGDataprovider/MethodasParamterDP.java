package TestNGDataprovider;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MethodasParamterDP {
@DataProvider(name="Method as Parameter")
public Object[][] data(Method m)
{
 switch(m.getName())
 {
 case "Sum":
 return new Object[][] {{1,2,3},{4,5,9}};
 case "Diff":
 return new Object[][] {{7,5,2},{9,8,1}};
 }
 return null;
 }

@Test(dataProvider = "Method as Parameter")
public void Sum(int x,int y,int result)
{
int S = x+y;
System.out.println("The Result : "+result);
Assert.assertEquals(result, S);
}

@Test(dataProvider = "Method as Parameter")
public void Diff(int x,int y,int result)
{
int D = x-y;
System.out.println("The Result : "+result);
Assert.assertEquals(result, D);
}

}
