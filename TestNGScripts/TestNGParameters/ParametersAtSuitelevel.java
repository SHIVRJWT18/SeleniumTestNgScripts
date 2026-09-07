package TestNGParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAtSuitelevel {
	@Test
	@Parameters ({"valA","valB"})
	public void sum(int v1,int v2)
	{
	 int result = v1+v2;
	 System.out.println("Final Sum : "+ result);
	}
	@Test
	@Parameters ({"valA","valB"})
	public void multiply(int v1,int v2)
	{
	 int result = v2*v1;
	 System.out.println("Final Prod : "+ result);
	}
	@Test
	@Parameters ({"valA","valB"})
	public void diff(int v1,int v2)
	{
	 int result = v2-v1;
	 System.out.println("Final Diff : "+ result);
	}
}
