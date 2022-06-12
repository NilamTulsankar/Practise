package Pop_up;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserEX2 
{
	public static void main(String[] args) 
	{
		Set<String> winds;
		Iterator<String> iterator;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/default.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//id for first window
		winds = driver.getWindowHandles();
		iterator = winds.iterator();
		String firstwindow = iterator.next();
		System.out.println(firstwindow);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='JS Window']")).click();
		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
		//id of second window
		winds=driver.getWindowHandles();
		iterator =winds.iterator();
		iterator.next();
		String seconwindow = iterator.next();
		System.out.println(seconwindow);
		driver.switchTo().window(seconwindow);
		System.out.println(driver.getCurrentUrl());
		WebElement ck = driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]"));
		ck.click();
	}

}
