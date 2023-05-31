package functionalDriveen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BusinessMethods extends GenericMethods {

	public GenericMethods gm;
	public String expval, actval, strPath;
	public FileInputStream fi;
	public Properties pr;

	//Launch
	public String orgLaunch(String br, String url) throws IOException
	{
		strPath = System.getProperty("user.dir") + "//src//com//SeleniumProject//properties//OrgHRM.properties";
		fi = new FileInputStream(strPath);
		
		pr = new Properties();
		pr.load(fi);
		
		expval = "LOGIN";
		gm = new GenericMethods();
		gm.invokeBr(br);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		actval = driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Login
	public String orgLogin(String u, String p){
		expval = "welcome"; 
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Logout
	public String orgLogout() throws InterruptedException{
		expval = "LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Close
	public void orgClose(){
		driver.close();
	}
	
	//Employee Registration
	public String orgEmpReg(String f, String l, String eId)
	{
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eId);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//User Registration
	public String orgUserReg(String ename, String uname, String pwd) throws InterruptedException
	{
		boolean flag = false;
		expval = uname;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("systemUser_employeeName_empName")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).clear();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> uns = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]/a"));
		for (int i = 0; i < uns.size(); i++) {
			actval = uns.get(i).getText();
			if (actval.equalsIgnoreCase(expval)) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
}
