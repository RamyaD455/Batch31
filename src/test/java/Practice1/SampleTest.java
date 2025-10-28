package Practice1;

import org.testng.annotations.Test;

public class SampleTest {  //class name should end with test bcz we are using @Test
	@Test(groups="smoke")
	public void appleTest()
	{
		System.out.println("apple tested");
		System.out.println("grapes tested");
	}

}
