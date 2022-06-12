package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TryCatch 
{
	public static void main(String[] args) 
	{
		// Unchecked exception
		System.out.println("Program is started");
		int a=100;
		try 
		{ //1. arithmetic exception
			System.out.println(a/0);
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("code entered in catch block");
		}
		
		System.out.println("program is ended");
		
		
		
		System.out.println("Program is started");
		int b=100;
		try 
		{ 
			FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium  all jar files\\Fb_FooterLInks.xlsx");
			String data = WorkbookFactory.create(file).getSheet("FB_FooterLinks").getRow(3).getCell(0).getStringCellValue();
			System.out.println(data);
			
			System.out.println(b/0);
		}catch(ArithmeticException e)
		{	
			e.printStackTrace();
			System.out.println("This is arithmetic exception");
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("excel exception");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("regular exception");
		}
		
		System.out.println("program is ended");
		
		
		//2. null pointer exception
//		String s1  = null;
//		System.out.println(s1.length());
		
		//3. Number format exception
		String s = "12345678";       //apply loop over it so you need to convert string into integer
		int count = Integer.parseInt(s);
		System.out.println(count);   //here we did not get any exception
		
		String s2 = "123456 products";
		int count1 = Integer.parseInt(s2);
		System.out.println(count1);   //we can not convert number+text into integer we get number format exception
		
		
		//4. Array out of bound index
		int c[] = new int [5];
		c[8] = 80;                     //adding data 
		System.out.println(c[7]);     //get the data 
		
		//checked exception examples :-
		//1. IO exception
		//2. encrypted exception
		//3. intrrupted exception
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
