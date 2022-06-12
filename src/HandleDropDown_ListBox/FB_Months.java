package HandleDropDown_ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Months 
{
	//create main method
	//launch the browser
	//select the dropdown box which need to be handle and store in reference variable
	//use select class method and pass webelement argument
	//to check all options use getAllOptions method and store all elements in list. loop over the list and required attribute or text  
	// to get first default option use getfirstSelectedOption method and get attribute or text().
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s =new Select(months);
		
		s.selectByIndex(10);
		s.selectByValue("5");
		s.selectByVisibleText("Nov");
		
		List<WebElement> singleMonth = s.getOptions();
		
		for(WebElement aMonth:singleMonth) 
		{
			System.out.println(aMonth.getText());
		}
		
		WebElement FirstMonth = s.getFirstSelectedOption();
		String aMonth = FirstMonth.getAttribute("value");
		System.out.println(aMonth);
	}

}
