package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.Base;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=Base.setUp(); //https://jqueryui.com/droppable/
		
		// as the actions that we want to do they are in frames we need to switch to frames
		
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.id("draggable"));

		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		//longer way to drag and drop action
	//	action.clickAndHold(drag).moveToElement(drop).release().perform(); // in each action you must write perform at the end of the action!!!!
		
		
		
		//short way of drag and drop
		action.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(5000);
		
		
		
	}

}
