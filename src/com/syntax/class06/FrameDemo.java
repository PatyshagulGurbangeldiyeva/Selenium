package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.Base;

public class FrameDemo extends Base{

	public static void main(String[] args) throws InterruptedException {
		// http://uitestpractice.com/Students/Switchto
		
		setUp(); // as we extend  Base class we don't need to call method with class name
		
		/*in order to switch to the frame there are three ways:
		 * 1. By index
		 * 2. By name or Id
		 * 3. By webElement
		 */
		
		String text=driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		System.out.println(text);
		
		// By index
		driver.switchTo().frame(0); // as there are many frmaes you need to show the index of the frame that you want
		
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Vital");
		
		Thread.sleep(1000);
		name.clear();
		driver.switchTo().defaultContent(); // in order to do the other action or go to the another frame we need to get out from previous frame
		
		Thread.sleep(2000);
		
		// By NameOrId
		driver.switchTo().frame("iframe_a");// we wrote here the name of the iframe
		driver.findElement(By.id("name")).sendKeys("Sarmet");
		driver.switchTo().defaultContent();// ---> switching back to the main window as we want to go another frame
		Thread.sleep(1000);
		
		// By webElement
		WebElement firstFrame=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(firstFrame);
		name.clear();
		Thread.sleep(1000);
		name.sendKeys("Asel");
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		tearDown();
		
		
		
	}

}
