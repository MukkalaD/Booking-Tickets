package exploretickets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicebooking_tickets {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.expedia.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
   Actions a=new Actions(driver);
   a.moveToElement(driver.findElement(By.id("tab-flight-tab-hp"))).build().perform();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//*[@id=\"tab-flight-tab-hp\"]")).click();
   
   Actions b=new Actions(driver);
 b.moveToElement(driver.findElement(By.id("flight-type-multi-dest-label-hp-flight"))).build().perform();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"flight-type-multi-dest-label-hp-flight\"]")).click();
   
 
 Actions c=new Actions(driver);
 c.moveToElement(driver.findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]"))).build().perform();
 driver.findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]")).sendKeys("Washington, DC (WAS-All Airports)");
 
 Actions d=new Actions(driver);
 d.moveToElement(driver.findElement(By.xpath("//*[@id=\"flight-destination-hp-flight\"]"))).build().perform();
 driver.findElement(By.xpath("//*[@id=\"flight-destination-hp-flight\"]")).sendKeys("Hyderabad, India (HYD-Rajiv Gandhi Intl.)");
 
 Actions e=new Actions(driver);
 e.moveToElement(driver.findElement(By.id("flight-departing-single-hp-flight"))).build().perform();
 driver.findElement(By.name("starDate")).click();
 Thread.sleep(1000);
 driver.findElement(By.xpath("//*[@id=\"flight-departing-wrapper-single-hp-flight\"]/div/div/div[2]/table/tbody/tr[5]/td[3]/button")).click();
 
 //Actions f=new Actions(driver);
 //f.moveToElement(driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/button"))).build().perform();
 //driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/button")).click();

 Actions g=new Actions(driver);
//g.moveToElement(driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div"))).build().perform();	 
Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button/span[1]/svg/path[1]")).click();
	
Actions h=new Actions(driver);
h.moveToElement(driver.findElement(By.xpath("//*[@id=\"flight-2-origin-hp-flight\"]"))).build().perform();
driver.findElement(By.xpath("//*[@id=\"flight-2-origin-hp-flight\"]")).sendKeys("Washington, DC (WAS-All Airports)");
	
Actions i=new Actions(driver);
i.moveToElement(driver.findElement(By.xpath("//*[@id=\"flight-2-destination-hp-flight\"]"))).build().perform();
driver.findElement(By.xpath("//*[@id=\"flight-2-destination-hp-flight\"]")).sendKeys("Hyderabad, India (HYD-Rajiv Gandhi Intl.)");

//Actions j=new Actions(driver);
//j.moveToElement(driver.findElement(By.id("flight-2-departing-hp-flight"))).build().perform();
//driver.findElement(By.xpath("//*[@id=\"flight-2-departing-hp-flight\"]")).click();
//Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"flight-2-departing-wrapper-hp-flight"]/div/div/div[2]/table/tbody/tr[5]/td[3]/button")).
	
Actions k=new Actions(driver);
k.moveToElement(driver.findElement(By.id("flight-advanced-options-hp-flight"))).build().perform();
driver.findElement(By.xpath("//*[@id=\"flight-advanced-options-hp-flight\"]")).click();
driver.findElement(By.id("advanced-flight-refundable-hp-flight")).click();
driver.findElement(By.id("flight-advanced-preferred-airline-hp-flight")).click();
driver.findElement(By.xpath("//*[@id=\"flight-advanced-preferred-airline-hp-flight\"]/option[22]")).click();
driver.findElement(By.id("flight-advanced-preferred-class-hp-flight")).click();
driver.findElement(By.xpath("//*[@id=\"flight-advanced-preferred-class-hp-flight\"]/option[2]")).click();
driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[7]/label/button")).click();




	}

}
