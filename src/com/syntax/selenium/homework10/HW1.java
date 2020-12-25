package com.syntax.selenium.homework10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HW1 {
	
//	Drag and Drop verification
//	Open chrome browser
//	Go to “http://www.uitestpractice.com/”
//	Click on “Droppable” link
//	Using mouse drag “Drag me to my target” to the “Drop Here”
//	Close the browser

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.uitestpractice.com/");
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		// longer way to drag and drop the element
		
//		action.clickAndHold(drag).moveToElement(drop).release().perform();
		
		
		// shorter way of drag and drop
		
		action.dragAndDrop(drag, drop).perform();
		
		

	}

}
