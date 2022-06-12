package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions 
{
	public static void main(String[] args) 
	{
		//mouse actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//1. sendkeys
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions action = new Actions(driver);
		action.sendKeys(searchbar, "Mobile");
		action.build().perform();
		
		//2. press key
		action.keyDown(searchbar, Keys.SHIFT).sendKeys("mobile").keyUp(Keys.SHIFT);
		action.build().perform();
		
		
		
		
		
	}

}
