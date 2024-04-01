package excelread;

import java.io.IOException;

public class excelNew2 {

	public static void main(String[] args)throws IOException {
		String s=excelNew1.ReadIntegerdata(1, 0);
		System.out.println(s);
		String l=excelNew1.ReadStringdata(1, 1);
		System.out.println(l);
		

	}

}
