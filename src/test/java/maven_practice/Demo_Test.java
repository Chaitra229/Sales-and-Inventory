package maven_practice;

import org.testng.annotations.Test;

public class Demo_Test {
	@Test(groups = "smokesuite")
	public void testScript_3() {
		System.out.println("--TestScript-3--");
	}
	@Test
	public void testScript_4() {
		System.out.println("--TestScript-4--");
	}
}
