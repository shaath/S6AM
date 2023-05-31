package day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium6AMRecrodings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(5000);

		Alert alt = driver.switchTo().alert();
		
		alt.dismiss();

	}

}
