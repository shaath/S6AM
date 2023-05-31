package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_KeyboardActionsEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium6AMRecrodings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		WebElement uname = driver.findElement(By.id("txtUsername"));
		Actions act = new Actions(driver);
		
		act.click(uname).perform();
		act.sendKeys(Keys.chord("Admin")).perform();
		Thread.sleep(5000);
		act.doubleClick().perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("C")).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.id("txtPassword"));
		act.click(pass).keyDown(Keys.CONTROL).sendKeys(Keys.chord("V")).keyUp(Keys.CONTROL).build().perform();
		
	}

}
