package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium6AMRecrodings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
//		driver.switchTo().frame(0);
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();
		
//		act.dragAndDropBy(drag, 448, 22).perform();
		
//		act.clickAndHold(drag).moveToElement(drop).click().build().perform();
	
		
	}

}
