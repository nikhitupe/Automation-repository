package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkTextLocator {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        
        driver =new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get(" file:///C:/Users/Nikhil%20Tupe/Desktop/html/flipkart.html");

        driver.findElement(By.linkText("FlipkartLink")).click();
	}

}
