package HandleDropDown_ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_Days 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// how to handle drop downbox or list box
		//1. create the main method
		//2. Launch the browser
		//3. identify a dropdownbox which we have to handle and store in reference variable
		//4. create a select class and pass webelement argument
		//5. use select class methods to select option from the list
			// 1. selectByIndex();
			// 2. selectByValue();
			// 3. selectByVisibleText();
		//6. to check all options use getOption method and store all elements in list. Loop over the list and get required attribute or text
		//7. to check default option use getFirstSelectedOPtion() method and get attribute or text
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		WebElement Alldays = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(Alldays);
		
		//s.selectByIndex(1);
		//s.selectByValue("4");
		//s.selectByVisibleText("10");
		
		List<WebElement> day = s.getOptions();
		for(int i=0; i<day.size(); i++)
		{
			String oneday = day.get(i).getText();
			System.out.println(oneday);
			
		}
		
		String firstOpt = s.getFirstSelectedOption().getText();
		System.out.println(firstOpt);
		
		
	}
}
