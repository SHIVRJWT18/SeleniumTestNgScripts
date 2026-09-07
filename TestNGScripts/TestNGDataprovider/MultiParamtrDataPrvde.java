package TestNGDataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiParamtrDataPrvde {
@DataProvider(name="Multiprovide")
public Object[][] rawdata()
{
 return new Object[][] {{2,3,5},{1,8,9}};
}

@Test(dataProvider = "Multiprovide")
public void excute(int a , int b, int result)
{
 int sum =a+b;
 System.out.println("The Result :" +sum);
 Assert.assertEquals(result, sum);
}
}
