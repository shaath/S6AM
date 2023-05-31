package functionalDriveen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadingEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String strPath = System.getProperty("user.dir") + "//src//com//SeleniumProject//properties//OrgHRM.properties";
		String strPath1 = System.getProperty("user.dir") + "//src//com//SeleniumProject//properties//OrgHRM123.properties";
		
		FileInputStream fi = new FileInputStream(strPath);
		Properties pr = new Properties();
		pr.load(fi);
		
		System.out.println(pr.getProperty("x"));
		
		pr.put("course", "Selenium");
		Thread.sleep(10000);
		System.out.println(pr.getProperty("course"));
		
		FileOutputStream fo = new FileOutputStream(strPath1);
		pr.store(fo, "New key added to the properties file");
		
		
		
	}

}
