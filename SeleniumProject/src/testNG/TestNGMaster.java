package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import functionalDriveen.GenericMethods;

public class TestNGMaster extends GenericMethods{
	
	public GenericMethods gm;
	public String expval, actval, strPath;
	public FileInputStream fi;
	public Properties pr;
	
	public String br = "firefox", url = "http://orangehrm.qedgetech.com";
	public String u = "Admin", p = "Qedge123!@#";
	public String f = "V", l = "Vinayak", eId = "SS3215";
	public String ename = f+" "+l, uname = "AAAAAA"+f+l+"5432167890", pwd = "Test@5432167890";
	
	@BeforeSuite
	public void orgLaunch() throws IOException{
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
		
		Assert.assertEquals(expval, actval, "Launch Failed");
	}
	
	@BeforeTest
	public void orgLogin(){
		
		expval = "welcome"; 
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		Assert.assertEquals(expval, actval, "Login Failed");
	}
	
	@AfterTest
	public void orgLogout() throws InterruptedException{
		
		expval = "LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		Assert.assertEquals(expval, actval, "Logout Failed");
	}
	
	@AfterSuite
	public void orgClose(){
		driver.close();
	}
}
