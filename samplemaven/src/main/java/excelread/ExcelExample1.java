package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExample1 {
	
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String ReadStringdata(int row,int col)throws IOException
	{
		f=new FileInputStream("C:\\Users\\Dell\\git\\samplejava\\samplemaven\\src\\main\\resources\\Example1.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(row);
		XSSFCell c=r.getCell(col);
		return c.getStringCellValue();
	}
	public static String ReadIntegerdata(int row,int col)throws IOException
	{
		f=new FileInputStream("C:\\Users\\Dell\\git\\samplejava\\samplemaven\\src\\main\\resources\\Example1.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(row);
		XSSFCell c=r.getCell(col);
		int a=(int)c.getNumericCellValue();
		return String.valueOf(a);
	}

}
