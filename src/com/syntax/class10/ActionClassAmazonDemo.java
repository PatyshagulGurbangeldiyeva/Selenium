package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.Base;

public class ActionClassAmazonDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Base.setUp(); // http://amazon.com
		
		Actions action=new Actions(driver);
		
		WebElement account=driver.findElement(By.id("//a[@id='nav-link-accountList']"));
	
		action.moveToElement(account).perform(); // hover (duraksamak) the mouse over the media
		
		
		
		WebElement element=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));
		

		if (element.getText().contains("Start")) {
			System.out.println("menu displayed");
		}else {
			System.out.println("menu did not displayed");
		}
		
		action.contextClick(element).perform();// how to right click on element
		
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		action.moveToElement(searchBox).click().sendKeys("book").doubleClick().perform(); // we want to write in search box then select the written text by double click
																							// in action class after clear, click methods we can use another methods too, but normally they are final methods
		
		
		action.moveToElement(searchBox).click().keyUp(Keys.SHIFT).sendKeys("movie").perform();// here we use enum to make all the letters capital
		
		
		
		
		
		
		Thread.sleep(5000);
		Base.tearDown();
	}

}
