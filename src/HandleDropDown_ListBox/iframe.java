package HandleDropDown_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

//		driver.switchTo().frame("iframeResult");
//		Thread.sleep(2000);
//		WebElement Clickme = driver.findElement(By.xpath("//a[@id='w3loginbtn']"));
//		Clickme.click();
		
		driver.switchTo().defaultContent();
		
		WebElement ClickTheme = driver.findElement(By.xpath("//a[@title='Change Theme' and @onclick='retheme()']"));
		ClickTheme.click();
	}

}
