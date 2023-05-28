package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClickMethod {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(co);
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.get("http://laptop-tc8i3p4q/login.do");
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");
				Thread.sleep(2000);
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				//driver.close();

	}

}
