package datadrivertesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readfromexal {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//step 1:convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/Book112.xlsx");
		
		//step 2: open workbook
		//workbookfactory.create(fis)--> throws encrypedDocumentException and
		Workbook wb = WorkbookFactory.create(fis);
		
		//step 3 :get control over sheet
		//Sheet sh =wb.getSheet("Sheet1");
		
		
		//step 4 : get control over row
		//Row r= sh.getRow(3);
		//Row r1 =sh.getRow(1);
		
		//step 5 : get control over cell
		//Cell c = r.getCell(1);
	//	Cell c1 =r1.getCell(1);
		
		//step 6 :read data
		//System.out.println(c.getStringCellValue());
		//System.out.println(c1.getNumericCellValue());
		
		
		String data = wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		System.out.println(data);
		
	
		
		//step 7: close wookbook (manudatory step)
		wb.close();
		

	}

}
