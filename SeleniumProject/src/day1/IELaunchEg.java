package day1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunchEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\Selenium6AMRecrodings\\Jars\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();

		driver.get("https://google.com");
	}

}
