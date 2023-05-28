package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelectorUppercase {

	static WebDriver driver;  
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
	    Thread.sleep(2000);
	    //INPUT FOR USER NAME
	    driver.findElement(By.name("username")).sendKeys("nikil");
	    Thread.sleep(2000);
	    //INPUT FOR PASSWARD
	    driver.findElement(By.name("password")).sendKeys("6532653932");
	    Thread.sleep(2000);
	    // CSS SELECTOR...
	    driver.findElement(By.cssSelector("button[class*=' _acas _']")).click();
	    
	    

	}

}
