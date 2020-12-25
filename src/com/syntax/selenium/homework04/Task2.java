package com.syntax.selenium.homework04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
//	 HRMS Application Negative Login: 
//		 Open chrome browser
//		 Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//		 Enter valid username
//		 Leave password field empty
//		 Verify error message with text “Password cannot be empty” is displayed.

	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("Submit")).submit();
	  WebElement error=driver.findElement(By.id("spanMessage"));
		String msg=error.getText();// we are getting element's sentence and it gives us String
		
		
		
		
		if (error.isDisplayed()) {
			System.out.println(msg);
		}else {
			System.out.println("password is not emty");
		}
		
	}
}

