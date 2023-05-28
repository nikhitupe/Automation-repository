package methodsofwebelement;


import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Nikhil%20Tupe/Desktop/SingleSelectDropDown/SINGLESELECT%20DROP%20DOWM.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropDown);
		List<WebElement> allOptions = sel.getOptions();
		TreeSet<String>	tr =new TreeSet<String>();
		
		for (int i=0;i<allOptions.size();i++)
		{
			String op = allOptions.get(i).getText();
			tr.add(op);
		}
		for(String Option:tr)
		{
			System.out.println(Option);
			
		}
		Thread.sleep(2000);
		driver.quit();
	}

}

