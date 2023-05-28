package datadriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


  public class InvalidLoginTestCase {
  
  public static void main(String[] args) throws EncryptedDocumentException,IOException, InterruptedException {
	  
  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  
  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  driver.get("http://laptop-tc8i3p4q/login.do");
  
  // To read the data from external files create the object of Flib.........
  Flib flib = new Flib();
  
 int rc = flib.rowcount("./data/ActiTimeTestData.xlsx","InvalidCrediantial");
 
  for(int i=1;i<=rc;i++) 
  {
	  String invalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx","InvalidCrediantial",i,0);
	  String invalidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx","InvalidCrediantial",i,1);
	  driver.findElement(By.name("username")).sendKeys(invalidUsername);
	  driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).clear();
	  
	  
	  
	  
  }
  
  }
  }
 

