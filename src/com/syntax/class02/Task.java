package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
//	Open chrome browser
//	Go to “http://newtours.demoaut.com/”
//	Click on Register Link
//	Fill out all required info
//	Click Submit
//	User successfully registered
//	(Create 2 scripts using different locators)

	public static void main(String[] args) {
		String url="http://newtours.demoaut.com/";
			
			
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.name("userName")).sendKeys("paty");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("login")).click();

	}

}
