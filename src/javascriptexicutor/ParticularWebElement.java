package javascriptexicutor;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("");

	}

}
