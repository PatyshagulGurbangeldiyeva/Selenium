package com.syntax.selenium.homework03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmsApplication {
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {
		

//		 HRMS Application Login: 
//			 Open chrome browser
//			 Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//			 Enter valid username and password
//			 Click on login button

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		

		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@n123");
		
	}

}
