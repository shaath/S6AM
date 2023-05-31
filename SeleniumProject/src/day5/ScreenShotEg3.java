package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotEg3 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();

		WebElement singnIn = driver.findElement(By.linkText("Sign in"));
		
		File src = singnIn.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Selenium6AMRecrodings\\Workspace\\SeleniumProject\\src\\screenshots\\singnIn.png"));
		
	}

}
