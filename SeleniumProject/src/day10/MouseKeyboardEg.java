package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium6AMRecrodings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		Thread.sleep(5000);
		WebElement img = driver.findElement(By.linkText("Images"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(img).perform();
		Thread.sleep(5000);
		act.contextClick().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.chord("p")).perform();

	}

}
