package HandleDropDown_ListBox;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Basic
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium  all jar files\\Fb_FooterLInks.xlsx");
		String data = WorkbookFactory.create(file).getSheet("FB_FooterLinks").getRow(3).getCell(0).getStringCellValue();
		System.out.println(data);
		
		
		
	}
}
