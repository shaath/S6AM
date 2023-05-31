package day8;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarEg {

	public static void main(String[] args) throws InterruptedException {
		String dateSel = "5/January/2024";
		String[] dateSplit = dateSel.split("/");
		String expmonthYear = dateSplit[1]+" "+dateSplit[2];
		System.out.println(expmonthYear);
		String expDay = dateSplit[0];
		System.out.println(expDay);
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium6AMRecrodings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.findElement(By.xpath("//*[local-name()='path' and @stroke='#1A1A1A']")).click();
		
		driver.findElement(By.xpath("//button/*[local-name()='svg']/*[local-name()='mask']/..")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 250)", "");
		
		//Month and Year Selection
		String monthYear = driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[1]/div[@class='DayPicker-Caption']/div")).getText();
//		System.out.println(monthYear);
		
		while(!expmonthYear.equalsIgnoreCase(monthYear))
		{
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow']")).click();
			Thread.sleep(5000);
			monthYear = driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[1]/div[@class='DayPicker-Caption']/div")).getText();
		}
		
		//Getting Day and clicking on it
		
		List<WebElement> cells = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[contains(@class,'DayPicker-Day') and @aria-disabled='false']"));
		System.out.println(cells.size());
		for (int i = 0; i < cells.size(); i++)
		{
			String actDay = cells.get(i).getAttribute("aria-label");
			System.out.println(actDay);
			
			String d = actDay.split(" ")[2];
			System.out.println(d);
			
			if (d.charAt(0) == '0')
			{
				d = d.replace("0", "");
			}
			
			if (expDay.equals(d)) {
				cells.get(i).click();
				break;
			}
			
		}
	}

}
