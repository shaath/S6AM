package day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium6AMRecrodings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(5000);

		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();
		
	}

}
