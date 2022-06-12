package HandleDropDown_ListBox;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Advance_Excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file;
//		for(int i=0; i<=9; i++) 
//		{
//			FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium  all jar files\\BOOK1.xlsx");
//			String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
//			System.out.println(data);
//		}
		
		//get row num
		
		file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium  all jar files\\Fb_FooterLInks.xlsx");
		int rownum = WorkbookFactory.create(file).getSheet("FB_FooterLinks").getLastRowNum();
		System.out.println(rownum);
		
		file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium  all jar files\\Fb_FooterLInks.xlsx");
		short colomnum = WorkbookFactory.create(file).getSheet("FB_FooterLinks").getRow(0).getLastCellNum();
		System.out.println(colomnum);
		
		for(int i=0; i<=rownum; i++) 
		{	for(int j=0; j<colomnum; j++) 
			{
				file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium  all jar files\\Fb_FooterLInks.xlsx");
				String data = WorkbookFactory.create(file).getSheet("FB_FooterLinks").getRow(i).getCell(j).getStringCellValue();
				System.out.print("===>"+ data);
			}
			System.out.println();
		}
		
	}

}
