package UtilityClassCreation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_utilityClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// 1. Drowning the border around webelement
		WebElement mobileTab = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		UtilityClass.createBorder(driver, mobileTab);
		
		//2. capture the title of webpage
		System.out.println(UtilityClass.getTitle(driver));
		
		//3. click on element
		UtilityClass.click(driver, mobileTab);
		
		//4. refresh the webpage
		UtilityClass.refresh(driver);
		
		//5. create alert popup runtime
		UtilityClass.alertpopup(driver);
		
		
		//6 scrolling action
		UtilityClass.scrollDown(driver, 0, 2000);
		
		Thread.sleep(2000);
		
		//6 scrolling up
		UtilityClass.scrollUp(driver, 0, 200);
		
		WebElement sellbtn = driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
		UtilityClass.scrollIntoView(driver, sellbtn);
		sellbtn.click();
	}

}
