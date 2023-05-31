package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpRegTestNG_TC extends TestNGMaster {

	@Test(dataProvider = "data")
	public void orgEmpreg(String f, String l, String eId){
		System.out.println(f+"---"+l+"---"+eId);
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eId);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(expval, actval, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data(){
		
		Object[][] x = new Object[4][3];
		
		x[0][0] = "Srikar";
		x[0][1] = "V";
		x[0][2] = "SV3241";
		
		x[1][0] = "Nidish";
		x[1][1] = "G";
		x[1][2] = "NG3241";
		
		x[2][0] = "Venki";
		x[2][1] = "CH";
		x[2][2] = "VCH3241";
		
		x[3][0] = "Nagaraj";
		x[3][1] = "V";
		x[3][2] = "NV3241";
		
		return x;
	}
	
	
}
