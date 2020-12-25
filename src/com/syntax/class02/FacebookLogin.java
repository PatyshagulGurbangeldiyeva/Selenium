package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("syntaxtest@yahoo.com");
		
		driver.findElement(By.id("pass")).sendKeys("syntax123");
		
		driver.findElement(By.id("u_0_b")).click(); // here using id (u_0_b) can cause problems as it is not stable, it is changeable
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot Password?")).click();//-->("Forgot Password?") the text must be same as it written as a text where you want to click
	}

}
