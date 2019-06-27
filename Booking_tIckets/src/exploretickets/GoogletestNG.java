package exploretickets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogletestNG {
@BeforeMethod
public void SetProperty() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
Thread.sleep(1000);
}

@Test(priority=1)
public void Titlepage() {
	WebDriver driver=new ChromeDriver();
	driver.getTitle();
	String title= driver.getTitle();
	System.out.println(title);
	
	Assert.assertEquals(title, "Google");//in the place google if you give google 123, you will get error message
}
@Test(priority=2)
public void googlelogotest() {
	WebDriver driver=new ChromeDriver();
	boolean b=driver.findElement(By.xpath("//*[@id=\'hplogo\']")).isDisplayed();
	
	Assert.assertTrue(b);
}
@Test(priority=3)
public void maillink() {
	WebDriver driver=new ChromeDriver();
	boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
}
@AfterMethod
public void quit() {
	WebDriver driver=new ChromeDriver();
	driver.quit();
}
	
}
