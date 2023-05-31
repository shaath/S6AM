package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium6AMRecrodings\\Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com");

	}

}
