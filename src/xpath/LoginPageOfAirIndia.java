package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPageOfAirIndia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		//login page link
		driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=MVZMemp3UV9ydzFpNGYtM3VLTzVncE5nRG5xTW9EY0ktSy1FOGR1dVVJRnJD_en-GB_false_&nonce=MVZMemp3UV9ydzFpNGYtM3VLTzVncE5nRG5xTW9EY0ktSy1FOGR1dVVJRnJD&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=BqldklDM4ZCf2veIlqAVk-zXjQgXi2eaGS2XvjCHOBs&ui_locales=en-GB");
		Thread.sleep(2000);
		//Email
		driver.findElement(By.xpath("//input[@name='Email Address']")).sendKeys("Nikhil");
		Thread.sleep(2000);
		//UserName
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("9763");
		Thread.sleep(2000);
		//Sign in
		driver.findElement(By.xpath("//button[@id='next']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
