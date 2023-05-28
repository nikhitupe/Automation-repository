package screenshotpackage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotW1 {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//consider we are taking  ss of selenium.dev Wp
		driver.get("https://www.selenium.dev/documentation/");{
			// TODO Auto-generated method stub

			File src = driver.getScreenshotAs(OutputType.FILE);

			File dest = new File("./ScreenShot/ss2.jpg");

			Files.copy(src, dest);


		}
	}
}