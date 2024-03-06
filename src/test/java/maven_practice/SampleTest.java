package maven_practice;

import org.testng.annotations.Test;

public class SampleTest {
	@Test(groups = "smokesuite")
	public void testScript_1(){
		System.out.println("--TestScript-1--");
	}
	@Test(groups = "integrationsuite")
	public void testScript_2() {
		System.out.println("--TestScript-2--");
	}
}
