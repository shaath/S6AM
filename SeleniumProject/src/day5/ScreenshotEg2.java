package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotEg2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String currProjectPath = System.getProperty("user.dir");
		System.out.println(currProjectPath);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://bing.com");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		
		File src = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(currProjectPath + "\\src\\screenshots\\bingFullPage2.jpg"));

	}

}
