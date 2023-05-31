package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlOpsEg {

	public static void main(String[] args) throws IOException {
		
		String strPath = System.getProperty("user.dir")+"//src//testData//TestData.xlsx";
		FileInputStream fi = new FileInputStream(strPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
		XSSFRow r = ws.getRow(3);
		XSSFCell c = r.getCell(0);
		
		String f = c.getStringCellValue();
		System.out.println(f);


	}

}
