package screenshotpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotW2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//consider we are taking  ss of selenium.dev WP
		driver.get("https://www.instagram.com/");
		 RemoteWebDriver rwd = (RemoteWebDriver)driver;
	   File src = rwd.getScreenshotAs(OutputType.FILE);
	    
	    File dest = new File("./ScreenShot/ss3.png");
	    
	    Files.copy(src, dest);
	}

}
