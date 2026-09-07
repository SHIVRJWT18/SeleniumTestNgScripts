package TestNGPriority;

import org.testng.annotations.Test;

public class SamePriority {
	@Test(priority=1)
	public void Five()
	{
	 System.out.println("Five priority as 1");
	}
	@Test(priority=2)
	public void Three()
	{
	 System.out.println("Three priority as 2");
	}
	@Test(priority=0)
	public void One()
	{
	 System.out.println("One priority as 3");
	}
	@Test(priority=0)
	public void Four()
	{
	 System.out.println("four priority as 0");
	}
	@Test(priority=3)
	public void Two()
	{
	 System.out.println("Two priority as 2");
	}
	@Test
	public void Six()
	{
	 System.out.println("Six priority is not defined");
	}
	}
