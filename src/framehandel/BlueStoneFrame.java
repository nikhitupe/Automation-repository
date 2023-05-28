package framehandel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		// WebElwment frameElement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
		
		// Switch the controls to frame for click on chat Box
		driver.switchTo().frame("fc_widget");//By using nameOrId
		
		//driver.findElement(By.xpath("//div[@id='chat-icon']/ancestor::div[@class='d-hotline h-btn animated zoomIn faster     ']")).click();
		
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(chatBox)).click();
		// switch the controls to default WebPage
	    driver.switchTo().defaultContent();
	    
	    // insert the inputs from testBox.....
	    driver.findElement(By.id("chat-fc-name")).sendKeys("Nikhil-123");
	    driver.findElement(By.id("chat-fc-email")).sendKeys("nikhiltupe47@gmail.com");
	    driver.findElement(By.id("chat-fc-phone")).sendKeys("9763826454");
	    
	    }

}
