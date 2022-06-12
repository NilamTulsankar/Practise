package Pop_up;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup 
{
	public static void main(String[] args) 
	{
		Set<String> winds;
		Iterator<String> iterator;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 winds= driver.getWindowHandles();
		 iterator = winds.iterator();
		 String firstwindow = iterator.next();
		 System.out.println(firstwindow);
		 System.out.println(driver.getCurrentUrl());
		 
		 driver.findElement(By.xpath("//a[text()='Instagram']")).click();
		 
		 winds = driver.getWindowHandles();
		 iterator = winds.iterator();
		 iterator.next();
		 String secondwindow = iterator.next();
		 System.out.println(secondwindow);
		 driver.switchTo().window(secondwindow);
		 System.out.println(driver.getCurrentUrl());
		 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("NILAM");
	
		 
	
	
	
	}
	

}
