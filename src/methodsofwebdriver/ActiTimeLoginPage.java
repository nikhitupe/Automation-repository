package methodsofwebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("http://laptop-tc8i3p4q/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");//User Name
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");//Password
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();//Login Button
		Thread.sleep(2000);
		 String loginPageTitle = driver.getTitle();
		System.out.println("loginPageTitle");
		//driver.close();	//How to handle//java.net.SocketException****

}	
}
