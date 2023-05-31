package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunchEg {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver(); 
				
		WebDriverManager.iedriver().setup();
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com");
	}

}
