package assigenment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HAndelFilpkartWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge,driver","./drivers/msedgedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
		
		driver.findElement(By.xpath("//button[@class='L0z3Pu']")).click();
		
		
	}

}
