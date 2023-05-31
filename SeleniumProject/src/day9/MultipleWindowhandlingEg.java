package day9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowhandlingEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium6AMRecrodings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com/");
		String gmail = driver.getWindowHandle();
//		System.out.println(gmail);
		
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(8000);
		Set<String> s = driver.getWindowHandles();
		
		for (String wid : s) {
			System.out.println(wid);
			driver.switchTo().window(wid);
			Thread.sleep(5000);
//			String title = driver.getTitle();
//			
//			if (title.contains("Privacy Policy")) {
//				driver.findElement(By.xpath("//header[@id='gb']//div[@class='oTqstd']//a[text()='Technologies']")).click();
//				break;
//			}
			
			try 
			{
				driver.findElement(By.xpath("//header[@id='gb']//div[@class='oTqstd']//a[text()='Technologies']")).click();
				break;
			}
			catch (Exception e) 
			{
				System.out.println("The expected element not available in this page");
			}
			
		}
		driver.switchTo().window(gmail);
//		driver.findElement(By.xpath("//header[@id='gb']//div[@class='oTqstd']//a[text()='Technologies']")).click();

		driver.quit();
	}

}
