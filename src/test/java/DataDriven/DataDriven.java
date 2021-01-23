package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {

		
		FileInputStream fis=new FileInputStream("D:\\Automation\\TestData.xlsx");
		//We need to create FileInputStream class object for hold the excel sheet address
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//We need to create XSSFWorkbook class object for control on excel sheet
		
		int sheets=workbook.getNumberOfSheets();
		//System.out.println(sheets);
		//getNumberOfSheets method will return how many sheet avilabel in excel
		
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
				//getSheetName() will return sheet name in excel
				
			{
				 XSSFSheet sheet= workbook.getSheetAt(i);
				 
				 Iterator<Row> row =sheet.iterator();//Sheet is collection of row
				 //This iterator() method has ability to move the row
				 
				 Row Firstrow =row.next();
				 //next() method is actually move the row
				 
				  Iterator<Cell> ce= Firstrow.cellIterator();//row is the collection of cell
				//This cellIterator() method has ability to move the row
				  
				  int k=0;
				  int coloumn = 0;
				  
				 while (ce.hasNext()) 
				 //hasNext() method returns next cell object is present or not in boolean format
				 
				{
					 
					Cell value= ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("UserName"))
					{
						coloumn=k;
					}
					
					k++;
					
				}
				 
				     System.out.println(coloumn);
			}
			
			
			 
			   
		}
		

	}

}
