package prashu;

import org.testng.annotations.Test;

public class Sample1Test 
{
	@Test(groups={"smokesuite","regressionsuite"})
	public void samplescript_1()
	{
		System.out.println("-----test script 1-----");
	}
	
	@Test(groups="smokesuite")
	public static void samplescript_2()
	{
		Systemmmm.out.println("-----test script 22222-----");
	}
}
