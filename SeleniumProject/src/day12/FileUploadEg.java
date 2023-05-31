package day12;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadEg {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium6AMRecrodings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(5000);
		WebElement br = driver.findElement(By.id("photofile"));
		
//		br.sendKeys("C:\\Users\\SharatChandra\\Desktop\\8114925.JPG");
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].click();", br);
		
		Thread.sleep(5000);
		
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUpload1.exe");
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUpload2.exe");
		
		Robot r = new Robot();
		
//		r.keyPress(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_C);
//		
//		r.keyPress(KeyEvent.VK_COLON);
//		r.keyRelease(KeyEvent.VK_COLON);
		
		//clip board
		
		Clipboard cp = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		//Set the string to enter
		
		StringSelection ss = new StringSelection("C:\\Users\\SharatChandra\\Desktop\\8114925.JPG");
		
		//Copy the string into clipboard
		cp.setContents(ss, null);
		
		//Pasting copied text
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
