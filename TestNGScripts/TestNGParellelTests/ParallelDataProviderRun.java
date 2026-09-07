package TestNGParellelTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelDataProviderRun {
@Test(dataProvider = "Paralleldp")
public void method1(int numbr)
{
 System.out.println("ThreadId for : "+numbr+ " is "+Thread.currentThread().getId());
}

@DataProvider(name="Paralleldp", parallel=true)
public Object[][] data()
{
   return new Object[][] {    //InnerClass
		new Object[] {1},
		new Object[] {2},
		new Object[] {3},
		new Object[] {4},
		new Object[] {5},
};
}

}


