package com.syntax.selenium.homework04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
//	 HRMS Application Login: 
//		 Open chrome browser	
//		 Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//		 Enter valid username and password
//		 Click on login button
//		 Then verify Syntax Logo is displayed.
	
	
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.name("Submit")).click();
		
		
		boolean logoIsDisplayed=driver.findElement(By.xpath("//img[@width='283']")).isDisplayed();
	
		if (logoIsDisplayed) {
			System.out.println("the logo is dislpayed");
		}else {
			System.out.println("the logo is not displayed");
		}
	}

}
