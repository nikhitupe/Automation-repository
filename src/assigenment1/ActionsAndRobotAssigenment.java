package assigenment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsAndRobotAssigenment {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter url of(BlueStone)
		driver.get("https://www.bluestone.com/");
	
		driver.findElement(By.id("denyBtn")).click();
	
		driver.findElement(By.xpath("//a[text()= 'Watch Jewellery ']")).click();
		
		
	}

}
