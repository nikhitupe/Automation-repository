package assigenment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assigenment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//ChromeOptions =new ChromeOptions();
		//addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@Class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		List<WebElement> OptionsS = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> OptionsS1 = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor:"));
	}
}