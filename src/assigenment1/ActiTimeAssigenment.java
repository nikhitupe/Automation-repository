package assigenment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeAssigenment {

	public static void main(String[] args) {
	System.setProperty("weddriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver =new  ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://laptop-tc8i3p4q/login.jsp");
	
	
	WebDriverWait wait;
	if(driver.getTitle().equals("actiTIME - Login"))
	{
		System.out.println("Home page Title is matched!!, Test case passed!! ");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("LoginButton")).click();
		
	}
	else
	{
		System.out.println("Home page Title is not  matched!!, Test case Faild!!");
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
	}
	// String homepageTitle = driver.getTitle();
	
	if(wait.until(ExpectedConditions.titleContains("actiTime - Enter Time-Track")).equals(wait));
	{
		System.out.println("Home page Title is matched!!, Test case passed!!");
	}
	else{
		System.out.println("Home page Title is not  matched!!, Test case Faild!!");
	}

	}

}
//System.out.println("Home page Title is matched!!, Test case passed!! ");