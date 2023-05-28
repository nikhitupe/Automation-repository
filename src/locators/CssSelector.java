package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelector {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("weddriver.chrome.driver","./driver/chromedriver.exe");

	   ChromeOptions co = new ChromeOptions();
	   
	   co.addArguments("--remote-allow-origins=*");
	   
	   driver = new ChromeDriver(co);
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.instagram.com/accounts/login/");

	   Thread.sleep(2000);
	   
	   driver.findElement(By.name("username")).sendKeys("Nikhil.Tupe");
	   
	   driver.findElement(By.name("password")).sendKeys("123456");
	   // identify the web element uniquely using Css Selector..
	   driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
	}

}
