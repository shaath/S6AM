package day5;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEg3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			WebElement ele = links.get(i);
			String name = ele.getText();
			System.out.println(name);

			ele.click();
			Thread.sleep(5000);
			System.out.println(driver.getTitle()+"-----"+driver.getCurrentUrl());
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\Selenium6AMRecrodings\\Workspace\\SeleniumProject\\src\\screenshots\\"+name+".png"));
			
			driver.navigate().back();
			Thread.sleep(5000);
			links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
		}

	}

}
