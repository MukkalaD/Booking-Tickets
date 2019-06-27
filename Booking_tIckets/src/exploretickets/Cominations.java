package exploretickets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cominations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Alerts
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.goindigo.in/#");
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/header/div/nav/ul/li[5]/span/a")).click();
	System.out.println(driver.getTitle());
	
	
	
	
	
	
	//**************ALERTS*************\\
	//driver.findElement(By.xpath("//*[@id=\"navUiMobile\"]/ul[2]/li[1]/a")).click();
	//driver.findElement(By.xpath("//*[@id=\"bookingflightTab\"]/div[2]/div[1]/ul[1]/li[3]/a")).click();
	//driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[3]/button")).click();
	//System.out.println(driver.switchTo().alert().getText());
	//driver.switchTo().alert().accept();
	}

}
