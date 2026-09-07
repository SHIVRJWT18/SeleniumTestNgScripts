package AnnotationFlow;

import org.testng.annotations.Test;

// TestNG executes the test methods based on alphabetical order by default.

public class MethodPrecedence {
@Test
public void Gamma()
{
 System.out.println("Execution ends at C");
}
@Test
public void Beta()
{
 System.out.println("Now comes B");
}
@Test
public void Alpha()
{
 System.out.println("Execution starts from A");
}

}
