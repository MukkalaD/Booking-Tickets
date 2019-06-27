package exploretickets;

import org.testng.annotations.Test;

public class FacebooktestNG {

	@Test
	public void login() {
		System.out.println("login");
	int i=9/0;//this command is written to fail the login test case and then home test case automatically fails
	}
	
	@Test(dependsOnMethods="login")
	public void home() {     //if the login page pass, then home page runs. if login page method fa
		System.out.println("home");
	}
	@Test(dependsOnMethods="login")
	public void search() {
		System.out.println("Search page test");
	}
	@Test(dependsOnMethods="login")
	public void registration() {
		System.out.println("registration page");
		
	}
}
