package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFetchFromExcel {
	
	public static void DataFetch(int i,int j) throws EncryptedDocumentException, IOException
	{
		
		String path="C:\\Users\\Dell\\Desktop\\Test.xlsx";

		FileInputStream file = new FileInputStream(path);
		
		Sheet sheet =  WorkbookFactory.create(file).getSheet("Sheet1");
				
				for( i=0;i<=sheet.getLastRowNum();i++)
				{
					for( j=0;j<2;j++)
					{
						try
						{
						
						
						String value = sheet.getRow(i).getCell(j).getStringCellValue();
						
						System.out.print(value);
						
						
						}
						
						catch(Exception e)
						{
							Long value1 = (long) sheet.getRow(i).getCell(j).getNumericCellValue();
							
							
							System.out.print(value1);
							
						}
						System.out.print(" ");
					}
					
	               System.out.println();
					
				}
				
				
				
		}
	
		
	}


