package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.bluestone.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.id("denyBtn")).click();
			//identify Coin
			WebElement target = driver.findElement(By.xpath("//a[text()='Coins']"));
			
			Actions ac = new Actions(driver);
			ac.moveToElement(target).perform();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@title='Band']")).click();
			//driver.findElement(By.xpath("//"))
			
	}
}
