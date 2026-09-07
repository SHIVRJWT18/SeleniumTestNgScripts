package TestNGDataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InheritedDataProvide {
	@Test(dataProvider = "Myprovider", dataProviderClass = Data.class)
	public void Validatedata(String val)
	{
	 System.out.println("Passed value :" + val);
	}

	}

 class Data
{
		@DataProvider (name="Myprovider")
		 Object[][] provider()
		{
		 return new Object[][] {{"A"},{"B"}};
		}

}
