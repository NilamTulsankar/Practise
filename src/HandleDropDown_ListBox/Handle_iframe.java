package HandleDropDown_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handle_iframe
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		driver.switchTo().frame("iframeResult");
		
		WebElement Clickme = driver.findElement(By.xpath("//button[text()='Click Me!']"));
		Clickme.click();
		
		driver.switchTo().defaultContent();
		
		WebElement ClickTheme = driver.findElement(By.xpath("//a[@title='Change Theme' and @onclick='retheme()']"));
		ClickTheme.click();
		
		driver.close();
	}

}
