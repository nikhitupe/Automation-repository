package assigenment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Assigenment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge,driver","./drivers/msedgedriver.exe");
		EdgeOptions eo =new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		WebDriver driver =new EdgeDriver(eo);

	driver.manage().window().maximize();
	Thread.sleep(2000);

	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@Class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	//List<WebElement> options = driver.findElement(By.xpath("//"));
	
	

	}

	
		
	}


