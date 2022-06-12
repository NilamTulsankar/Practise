package Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hidden_Division_Popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.busonlineticket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='No']")).click();
		driver.findElement(By.xpath("//a[text()=' Bus']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//i[@class='fa fa-calendar-alt'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='31']")).click();
		

	}

}
