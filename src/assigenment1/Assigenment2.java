package assigenment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assigenment2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args){// throws InterruptedException{
		System.setProperty("weddriver.chrome.driver","./driver/chromedriver.exe");

		   ChromeOptions co = new ChromeOptions();
		   
		   co.addArguments("--remote-allow-origins=*");
		   
		   WebDriver driver = new ChromeDriver(co);
		 
		   driver.manage().window().maximize();
		   driver.get("https://www.instagram.com/");
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  // driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		   driver.findElement(By.name("username")).sendKeys("admin");
		   driver.findElement(By.name("password")).sendKeys("nikhil");
		 // Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		  driver.close();

	}

}
