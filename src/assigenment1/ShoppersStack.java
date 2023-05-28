package assigenment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStack {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivers","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		// apply the implicitly wait to appear the WebElement...
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//button[@class='navbar_Loginbutton__xIXoV']")).click();
		driver.findElement(By.id("check Delivery")).sendKeys("580023");
		
		// apply the Explicit wait to webelement..
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement checkButton = driver.findElement(By.id("check"));
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		driver.findElement(By.id("check")).click();
		driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@src='https://m.media-amazon.com/images/I/61br13t0jtL._SX679_.jpg']"));
		
		
	
	
	
	
	

			 
			   
			 

}
}