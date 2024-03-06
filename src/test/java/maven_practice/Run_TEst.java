package maven_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Run_TEst {
	@Test
	public void testScript_5() {
		Reporter.log("--TestScript-5--", true);
	}
	@Test(groups = "smokesuite")
	public void testScript_6() {
		System.out.println("--TestScript-6--");
	}
}
