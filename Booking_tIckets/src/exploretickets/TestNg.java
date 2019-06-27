package exploretickets;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	//Preconditional annotations
@BeforeSuite
public void setup() {
	System.out.println("Set the property");
}
@BeforeTest
public void launchbrowser() {
	System.out.println("launch the browser");
}
@BeforeClass
public void login() {
 System.out.println("login to the app");
}
@BeforeMethod
public void enterURL() {
	System.out.println("enter the URL");
}
//Test cases
@Test
public void Google() {
	System.out.println("Google title test");
}
//Post conditional annotations
@AfterMethod 
public void logOut(){
	System.out.println("logout from the app");
}
@AfterClass
public void deletecookies() {
System.out.println("Delete all cookies");	
}
@AfterTest
public void closebrowser() {
	System.out.println("close the chrome browser");
}
@AfterSuite
public void generatereport() {
	System.out.print("Generate the test reports");
}



}
