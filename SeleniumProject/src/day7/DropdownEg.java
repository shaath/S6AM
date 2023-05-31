package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		Select s = new Select(driver.findElement(By.name("country")));
		
//		s.selectByIndex(4);
//		s.selectByValue("GERMANY");
//		s.selectByVisibleText("FINLAND");
		
		List<WebElement> drops = s.getOptions();
		System.out.println(drops.size());
		
		for (int i = 0; i < drops.size(); i++)
		{
			s.selectByIndex(i);
			String name = drops.get(i).getText();
			System.out.println(name);
		}
		
	}

}
