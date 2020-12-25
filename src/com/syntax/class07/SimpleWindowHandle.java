package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandle {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
		String signUpTitle=driver.getTitle();// -----------------> the page title
		System.out.println("The page title is "+signUpTitle);

		driver.findElement(By.linkText("Help")).click();// we are opening the new window, opening the new window
		
		/*
		 * How to get window handle?
		 * In Selenium we have two method to get the hand of window.
		 * getWindowHandle();---> it will return the first window handle
		 * getWindowHandles();--> to get the ids of window handles  --> returs a Set
		 */
		
		Set<String> allWindowHandles=driver.getWindowHandles();// returns set of String IDs of all windows currently opened by the current instance
		
		System.out.println("number of pages are "+allWindowHandles.size()); //------------> getting the size of opened windows
		System.out.println();
		
		Iterator <String> it=allWindowHandles.iterator(); //-----> here the set IDs will be printed linked automatically 
		String mainWindowHandle=it.next(); // returns Main window
		System.out.println("id of main window "+mainWindowHandle);
		System.out.println();
		
		String childWindowhandle=it.next();// returns Child Window
		System.out.println("id of child window "+childWindowhandle);
		System.out.println();
		
		driver.switchTo().window(childWindowhandle);// here we are switching to child window, as selenium focused in first parent window
		String childWindowTitle=driver.getTitle();
		System.out.println("The child page title is "+childWindowTitle);
		
		driver.close();// will close the current pg (browser) that you opened
		

	}

}
