package TestNGParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAtTestlevel {
@Test
@Parameters ({"valA","valB"})
public void Sum(int v1,int v2)
{
 int total = v1+v2;
 System.out.println("Final Sum : "+ total);
}
}
