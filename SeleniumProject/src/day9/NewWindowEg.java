package day9;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindowEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium6AMRecrodings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://facebook.com");

	}

}
