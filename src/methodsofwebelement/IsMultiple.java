package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) {
		// it is use to verify dropDown type
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//it is multiple select dropDown it is gives me output as true
		driver.get("file:///C:/Users/Nikhil%20Tupe/Desktop/Multiple%20Dropdown/dropdown.html");
		
		//it is single select dropDown it is gives me output as False
	//	driver.get("file:///C:/Users/Nikhil%20Tupe/Desktop/SingleSelectDropDown/SINGLESELECT%20DROP%20DOWM.html");
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		
	    Select	sel = new Select(dropDown);
	    boolean verify = sel.isMultiple();
	    System.out.println(verify);

	}

}
