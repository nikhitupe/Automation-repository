package javascriptexicutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownAndScrollUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		
		//To perform a Scrolling Operations..
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 Thread.sleep(2000);
		 // Scroll Down
		 jse.executeScript("window.scrollBy(0,350)");
		 Thread.sleep(2000);
		 // To Scroll up
		 jse.executeScript("window.scrollBy(0,-350)");

	}

}
