package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.syntax.utils.Base;
import com.syntax.utils.ConfigsReader;

public class JSExecuter extends Base{

	public static void main(String[] args) {
		
		// we use javaScript executer in order to perform some actions 
		
		
		setUp(); //  http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement loginBtn=driver.findElement(By.className("button"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	//	js.executeScript("arguments[0].style.backgroundColor='red'",); // changing backround color of an element
		
		js.executeScript("arguments[0].click()", loginBtn);//click on login buttom by using js
		
		
		// how to scoll down
		js.executeScript("window.scrollBy(0,250)");  // up scrolling
		
	//	Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-250)");  // down scrolling
		
		
		

	}

}
