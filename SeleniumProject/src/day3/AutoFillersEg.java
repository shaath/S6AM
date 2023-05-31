package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("hy");
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath("//section[@id='search']//ul/li"));
															
		
		int len = list.size();
		System.out.println(len);
		
		for (int i = 0; i < len; i++) {
			WebElement ele = list.get(i);
			String name = ele.getText();
			System.out.println(name);
			
			if(name.equalsIgnoreCase("Miyapur, Hyderabad"))
			{
				ele.click();
				break;
			}
		}

	}

}
