package qsp6;

	import java.util.Scanner;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Rtp1 {	// Run Time Polymorphism...
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			Scanner sc = new Scanner(System.in);
			System.out.println("Select The browser which u want to open!!");
			String browserValue = sc.next();
			// To Ignore Case like Uppercase and Lower Case.
			if (browserValue.equalsIgnoreCase("CHROME"))
			{
				// To avoid illealstatexception
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				// to handle connectionFailedException.
				ChromeOptions co = new ChromeOptions(); 
				co.addArguments("--remote-allow-origins=*");
				
				driver = new ChromeDriver(co);// Upcasting.
				driver.manage().window().maximize();
				Thread.sleep(5000); // to provide a delay
				driver.close();// to close the browser
			}
			else if (browserValue.equalsIgnoreCase("FIREFOX")) 
			{
				System.setProperty("webdriver.firefox.driver", "./drivers/firefoxdriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
			}
			else if
				(browserValue.equalsIgnoreCase("EDGE")) 
			{
					System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
					
					EdgeOptions eo = new EdgeOptions();
					eo.addArguments("--remote-allow-origins=*");
					driver = new EdgeDriver(eo);
					
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.get("https://www.flipkart.com/");
				//	driver.close();					
					
			}
				else 
					{
						System.out.println("Enter Valid Browser Name");
					}
		}
	}
			
				
		


