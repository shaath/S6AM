package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functionalDriveen.BusinessMethods;

public class ExcelOpsEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sm = new SimpleDateFormat("YYYYMMddHHmmss");
		String reqDate = sm.format(d);
		System.out.println(reqDate);
		String strPath = System.getProperty("user.dir")+"//src//testData//TestData.xlsx";
		String strOutpath = System.getProperty("user.dir")+"//src//results//EmpRes"+reqDate+".xlsx";
		FileInputStream fi = new FileInputStream(strPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(0);
//		XSSFCell c = r.getCell(0);
		
//		String f = c.getStringCellValue();
//		System.out.println(f);
		
		int rc = ws.getLastRowNum();
		System.out.println(rc);
//		int cc = r.getLastCellNum();
//		System.out.println(cc);
		
		BusinessMethods bm = new BusinessMethods();
		bm.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		bm.orgLogin("Admin", "Qedge123!@#");
		
		for(int i = 1; i <= rc; i++)
		{
			String f = ws.getRow(i).getCell(0).getStringCellValue();
			String l = ws.getRow(i).getCell(1).getStringCellValue();
			String eid = ws.getRow(i).getCell(2).getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+eid);
			
			String res = bm.orgEmpReg(f, l, eid);
			
			ws.getRow(i).createCell(3).setCellValue(res);
		}
		FileOutputStream fo = new FileOutputStream(strOutpath);
		wb.write(fo);
		wb.close();
		
		bm.orgLogout();
		bm.orgClose();
		
	}

}
