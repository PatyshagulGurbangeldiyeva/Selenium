package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.Base;

public class DropDownDemo1 extends Base {

	public static void main(String[] args) throws InterruptedException {
		// here we will work with utils package. that automatically connected to the browsers and files
		// if we will use utils packages we have to extend or create a class
		
	//	Base.setUp(); ---> we can access in that way by using class name and method if we don't want to extend the class
		
		setUp(); // if we extended the class we will just use the method, here we are going to url what we have in our file config
		//http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html
		
		WebElement weekDD=driver.findElement(By.id("select-demo"));
		
		Select select=new Select(weekDD); // here we are creating the class of Select( classes start with upper case)
		
		
		
		/*
		 * Selenium provides three different ways to select a value from a DD. 
		 * 1. byIndex();
		 * 2. ByVisibleText(String str);
		 * 3. ByValue();
		 */
		
		
		// before we need to know what options do we have
		
		List<WebElement> options=select.getOptions();
		
		System.out.println("Number of options in Drop Down"+options.size());
		
		
		//1 way:
		
		
	//	select.selectByIndex(3);
		
		// we can use for loop:
		
		for (int i=1; i<options.size(); i++) {
			select.deselectByIndex(i);
		}
		
		
		//2 way.using selectByVisibleText(value)
		
		select.selectByVisibleText("Friday");
		
		Thread.sleep(1000);
		tearDown();
		
		
		

	}

}
