package excelread;

import java.io.IOException;

public class ExcelExample2 {

	public static void main(String[] args) throws IOException {
		
		String s=ExcelExample1.ReadStringdata(1, 0);
		System.out.println(s);
		String l=ExcelExample1.ReadIntegerdata(1, 1);
		System.out.println(l);
		

	}

}
