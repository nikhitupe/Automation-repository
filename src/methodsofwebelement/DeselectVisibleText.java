package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectVisibleText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		// By Applying implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Nikhil%20Tupe/Desktop/Dropdown1/dropdown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel= new Select (dropDown);
		Thread.sleep(4000);
		sel.selectByVisibleText("POHA");
		Thread.sleep(2000);
		sel.selectByVisibleText("PANEER");
		Thread.sleep(2000);
		sel.selectByVisibleText("PANEER HANDI");
		Thread.sleep(2000);
		sel.selectByVisibleText("VEG PULAOW");
		Thread.sleep(2000);
		sel.selectByVisibleText("CHIKAN BIRYANI");
		Thread.sleep(2000);
		sel.selectByVisibleText("CHIKAN HANDI");
		Thread.sleep(4000);
		//To deselect all the option
		sel.deselectAll();
	}

}
