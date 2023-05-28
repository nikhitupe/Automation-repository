package qsp6;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {	// Run Time polymorphism
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select The browser which u want to open!!");
		String browserValue = sc.next();
		// To Ignore Case like Upper case and Lower Case.
		if (browserValue.equalsIgnoreCase("CHROME"))
		{
			// To avoid illealstatexception
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			// to handle connectionFailedException.
			//ChromeOptions co = new ChromeOptions(); 
			//co.addArguments("--remote-allow-origins=*");
			
		WebDriver	driver = new ChromeDriver();// Up casting.                          
			driver.manage().window().maximize();
			Thread.sleep(10000); // to provide a delay
			driver.close();// to close the browser
		}
		else if (browserValue.equalsIgnoreCase("FIREFOX")) 
		{
			System.setProperty("webdriver.geckodriver.driver", "./drivers/.geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.close();
		}
		else
			System.out.println("Enter Valid Browser Name");
			
		} 

	}
