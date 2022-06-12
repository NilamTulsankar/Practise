package Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands 
{
	//webdriver :- webdriver is an interface which perform the actions on browser
	//Thread.sleep(2000); ==>this is selenium wait in milliseconds to control test script execution speed
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		//1. get()
		driver.get("https://www.apollohospitals.com/");
		
		//2. maximize()
		driver.manage().window().maximize();
		
		//3. navigate
		driver.navigate().to("https://www.askapollo.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.justdial.com/Pune/Apollo-Spectra-Hospitals-Opposite-Sanas-Sports-Ground-Near-Saras-Baug-Sadashiv-Peth/020PXX20-XX20-150516123612-W8M4_BZDET");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//5. getcurrenturl
		System.out.println(driver.getCurrentUrl()); 
		
		//6. gettitle
		System.out.println(driver.getTitle());
		
		//7. setsize
		Dimension d = new Dimension(150, 200);
		driver.manage().window().setSize(d);
		
		//8. setposition
		Point p = new Point(50, 100);
		driver.manage().window().setPosition(p);
		
		//4. close
		driver.close();
		
		//9. quit
		driver.quit();
		
		
	}

}
