package TestNGParameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameters {
@Test
@Parameters ("message")
public void optionalmsg( @Optional ("This message passed as optional messgae") String message)
{
 System.out.println(message);
}
}
