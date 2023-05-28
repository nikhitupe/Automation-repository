package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PartialLinkTextLocator {
    
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        
        driver =new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get(" file:///C:/Users/Nikhil%20Tupe/Desktop/html/flipkart.html");
        
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("FlipkartLink")).click();
        

	}

}
