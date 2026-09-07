package TestNGDataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide
{
@DataProvider (name="Myprovider")
public Object[][] provider()
{
 return new Object[][] {{"A"},{"B"}};
}

@Test(dataProvider = "Myprovider")
public void Validatedata(String val)
{
 System.out.println("Passed value :" + val);
}

}
