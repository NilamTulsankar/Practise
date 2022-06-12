package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int Th_row = driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr")).size();
		System.out.println(Th_row);
		int TH_column = driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr/th")).size();
		System.out.println(TH_column);
	
		int Tb_row = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr")).size();
		int Tb_column = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr[1]/td")).size();
		
		//for headers
		for(int hr = 1; hr<=Th_row; hr++) 
		{
			for(int hc = 1; hc<TH_column; hc++) 
			{
			 WebElement headervalue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr["+hr+"]/th["+hc+"]"));	
			 System.out.print("," + headervalue.getText());
			}
			System.out.println();
		}
		
		//for body
		for(int r = 1; r<=Tb_row; r++) 
		{
			for(int c= 1; c<Tb_column; c++) 
			{
			 WebElement bodyvalue = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+r+"]/td["+c+"]"));
			 System.out.print(","+bodyvalue.getText());
			}
			System.out.println();
		}
		
	}
}
