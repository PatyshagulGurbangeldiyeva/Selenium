package com.syntax.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWithLoop {

	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		
		String parentWindowhandle=driver.getWindowHandle();//----> it will return parent id
		System.out.println("what is the id of parent window handle: "+parentWindowhandle);
		System.out.println();
		
		String signUpTitle=driver.getTitle();
		System.out.println("the title of the main page is: "+signUpTitle);
		
		for (int i=1; i<=3; i++) { // want to click 3 times to the button
			
			driver.findElement(By.id("button1")).click();
			Thread.sleep(2000);
			
		}

		
		Set <String> allWindowhandles=driver.getWindowHandles();
		
		for (String handle:allWindowhandles) {
			System.out.println("Id of Window: "+handle);
			driver.switchTo().window(handle);
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			driver.close();
		}

	}

}
