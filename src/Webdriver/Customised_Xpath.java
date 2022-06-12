package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customised_Xpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.apollohospitals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Customized x paths
		//1. basic xpath
		driver.findElement(By.xpath("//input[@name='s']"));
		
		//2. text()
		driver.findElement(By.xpath("//a[text()='Centres of Excellence']"));
		
		//3. contains
		driver.findElement(By.xpath("//a[contains(@title, 'Book an')]"));
		
		//4. starts-with
		driver.findElement(By.xpath("//li[starts-with(@class, 'menu-item menu-item-type-custom')]"));
		
		//5. logical operators
		//1. and operator
		driver.findElement(By.xpath("//a[@title='Read More' and @target='_blank']"));
		
		//2. or operator
		driver.findElement(By.xpath("//input[@id='search' or @name='s']"));
		
		
		
		
	}

}
