package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEg1 {

	public static void main(String[] args) {
		boolean flag = false; 
		String name = null;
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i = 0; i < links.size(); i++)
		{
			name = links.get(i).getText();
			System.out.println(name);
			
//			if(name.equals("About"))
//			{
//				System.out.println("Gmail Link is available in Google page");
//				break;
//			}else{
//				System.out.println("Gmail Link is not available in Google page");
//			}
			if(name.equals("About1"))
			{
				flag = true;
				break;
			}
			
		}
		
		if(flag == true)
		{
			System.out.println(name + " Link is available in Google page");
		}
		else
		{
			System.out.println(name + " Link is not available in Google page");
		}

	}

}
