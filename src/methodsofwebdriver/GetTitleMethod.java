package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitleMethod {
	//is use to get the title of current web page
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		//Thread.sleep(2000);
		String loginPageTitle= driver.getTitle();
		System.out.println("loginPageTitle");
		//driver.close();
		
	}

}
