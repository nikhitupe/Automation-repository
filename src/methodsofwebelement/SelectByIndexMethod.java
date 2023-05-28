package methodsofwebelement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;                                                                                                       

public class SelectByIndexMethod {// Multi select dropDown...

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("file:///C:/Users/Nikhil%20Tupe/Desktop/Dropdown1/dropdown.html");
	WebElement dropDown = driver.findElement(By.name("menu"));
	Select sel= new Select(dropDown);
	for (int i=0;i<=5;i++)
	{
		
		sel.selectByIndex(i);
		Thread.sleep(1000);
	}
	
	

	}

}
