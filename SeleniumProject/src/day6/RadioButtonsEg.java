package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		List<WebElement> radios= driver.findElements(By.xpath("//input[contains(@name, 'group')]"));
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++) 
		{
			String name = radios.get(i).getAttribute("value");
			System.out.println(name);
			
//			if(name.equalsIgnoreCase("Milk"))
//			{
//				radios.get(i).click();
//			}
//			else if(name.equalsIgnoreCase("Water"))
//			{
//				radios.get(i).click();
//			}
			
			if(name.equalsIgnoreCase("Butter") || name.equalsIgnoreCase("Beer"))
			{
				radios.get(i).click();
			}
		}
		
	}
}
