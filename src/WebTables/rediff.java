package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Show More >>']")).click();

		int rownum = driver.findElements(By.xpath("//table[@id='dataTable']//tbody/tr")).size();
		
		int colmnum = driver.findElements(By.xpath("//table[@id='dataTable']//tbody/tr[1]/td")).size();
		
		for(int r =1; r<=rownum; r++) 
		{
			for(int c =1; c<=colmnum; c++) 
			{
				
				String value = driver.findElement(By.xpath("//table[@id='dataTable']//tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(","+value );
				
			}
			System.out.println();
		}
		
		
		
	}

}
