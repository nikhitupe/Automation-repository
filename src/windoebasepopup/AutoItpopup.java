package windoebasepopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoItpopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// enter url
		driver.get("http://laptop-tc8i3p4q/login.jsp");
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("LoginButton")).click();
		// home page
		// Click on Setting
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		Thread.sleep(2000);
		// Click on Logo & color button
		driver.findElement(By.xpath("//a[contains(.,'Logo &')]")).click();
		Thread.sleep(2000);

		// Click On radio Button
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		// driver.findElement(By.xpath("//input[@id ='uploadNewLogoOption']")).click();
		Thread.sleep(4000);
		// Click on Choose file Button
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Thread.sleep(4000);
		// Create obj of Actions Class
		Actions act = new Actions(driver);

		Thread.sleep(2000);
		// Use This Method for DoubleClick....
		act.doubleClick(target).perform();

		Thread.sleep(2000);

		File File = new File("./Autoit/FileUpload1.exe");
		Thread.sleep(2000);
		String absolutePath = File.getAbsolutePath();

		Runtime.getRuntime().exec(absolutePath);
		// Close the Browser...
		//driver.quit();

	}

}
