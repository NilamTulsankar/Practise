package HandleDropDown_ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Year 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Years = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s =new Select(Years);
		
//		s.selectByIndex(20);
//		s.selectByValue("1995");
//		s.selectByVisibleText("2000");		
		
		List<WebElement> AllYears = s.getOptions();
		System.out.println(AllYears.size());
		for(int i=0; i<AllYears.size(); i++) 
		{
			String C = AllYears.get(i).getText();
			System.out.println(i+"      "+C);
		}
		
		String firstYear = s.getFirstSelectedOption().getText();
		System.out.println(firstYear);
		
	}

}
