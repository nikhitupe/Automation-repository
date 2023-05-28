package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","./drivers/Chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://laptop-tc8i3p4q/login.do");
		
		WebElement usernameTB1 = driver.findElement(By.name("username"));
		WebElement passward = driver.findElement(By.name("pwd"));
		
		usernameTB1.sendKeys("Admin");
		passward.sendKeys("manager");
		
		Thread.sleep(2000);
		usernameTB1.clear();
		Thread.sleep(2000);
		passward.clear();	
		
	}

}
