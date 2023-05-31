package driverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functionalDriveen.BusinessMethods;

public class Keyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		String res = null;
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sm = new SimpleDateFormat("YYYYMMddHHmmss");
		String reqDate = sm.format(d);
		System.out.println(reqDate);
		
		String strpath = System.getProperty("user.dir") + "//src//testData//Keyword.xlsx";
		String strOutpath = System.getProperty("user.dir")+"//src//results//KeyRes"+reqDate+".xlsx";
		
		BusinessMethods bm = new BusinessMethods();
		
		FileInputStream fi = new FileInputStream(strpath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet tcSheet = wb.getSheet("Testcase");
		XSSFSheet tsSheet = wb.getSheet("Teststeps");
		XSSFSheet tdSheet = wb.getSheet("TestData");
		
		int tcRc = tcSheet.getLastRowNum();
		int tsRc = tsSheet.getLastRowNum();
		
		for(int i = 1; i <= tcRc; i++)
		{
			tcSheet.getRow(i).createCell(3);
			String exe = tcSheet.getRow(i).getCell(2).getStringCellValue();
//			System.out.println(exe);
			
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcSheettcId = tcSheet.getRow(i).getCell(0).getStringCellValue();
				
				for(int j = 1; j <= tsRc; j++)
				{
					String tsSheettcId = tsSheet.getRow(j).getCell(0).getStringCellValue();
					
					if (tcSheettcId.equalsIgnoreCase(tsSheettcId))
					{
						String key = tsSheet.getRow(j).getCell(3).getStringCellValue();
//						System.out.println(key);
						switch(key)
						{
						case "Launch":
							String br = tdSheet.getRow(1).getCell(0).getStringCellValue();
							String url = tdSheet.getRow(1).getCell(1).getStringCellValue();
							res = bm.orgLaunch(br, url);
							break;
						case "login":
							String u = tdSheet.getRow(1).getCell(2).getStringCellValue();
							String p = tdSheet.getRow(1).getCell(3).getStringCellValue();
							res = bm.orgLogin(u, p);
							break;
						case "logout":
							res = bm.orgLogout();
							bm.orgClose();
							break;
						case "Empreg":
							String f = tdSheet.getRow(1).getCell(4).getStringCellValue();
							String l = tdSheet.getRow(1).getCell(5).getStringCellValue();
							String eId = tdSheet.getRow(1).getCell(6).getStringCellValue();
							res = bm.orgEmpReg(f, l, eId);
							break;
						case "Usereg":
							String ename = tdSheet.getRow(1).getCell(7).getStringCellValue();
							String uname= tdSheet.getRow(1).getCell(8).getStringCellValue();
							String pwd = tdSheet.getRow(1).getCell(9).getStringCellValue();
							res = bm.orgUserReg(ename, uname, pwd);
							break;
						case "Ulogin":
							String un= tdSheet.getRow(1).getCell(8).getStringCellValue();
							String pw = tdSheet.getRow(1).getCell(9).getStringCellValue();
							res = bm.orgLogin(un, pw);
							break;
						default:
							System.out.println("Use a proper keyword");
							break;
						}
						//Updating results in test steps sheet
						tsSheet.getRow(j).createCell(4).setCellValue(res);
						//Updating results in test case sheet
						if (!tcSheet.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail")) 
						{
							tcSheet.getRow(i).getCell(3).setCellValue(res);
						}
						
					}
				}
			}
			else
			{
				tcSheet.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo = new FileOutputStream(strOutpath);
		wb.write(fo);
		wb.close();

	}

}
