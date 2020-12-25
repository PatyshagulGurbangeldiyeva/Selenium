package com.syntax.selenium.homework02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static String url="http://newtours.demoaut.com";

	public static void main(String[] args) {
		
//		Using xPath ONLY
//		TC 2: Mercury Tours Registration: 
//		Open chrome browser
//		Go to “http://newtours.demoaut.com/”
//		Click on Register Link
//		Fill out all required info (skip dropdowns)
//		Click Submit
//		User successfully registered

		
		// in order to connect to browser we need to make a path btw selennium and browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		// create webdriver
		WebDriver driver=new ChromeDriver();
		
		// navigate to url
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click(); // here I used text() as tag name did't work not unique
		driver.findElement(By.xpath("//input[@maxlength='60']")).sendKeys("Kyla");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Mark");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("3456523");
		driver.findElement(By.xpath("//input[@size='40']")).sendKeys("Arapaho road");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Apt 345");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Garland");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Texas");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("75004");
		driver.findElement(By.xpath("//select[@name='country' ]")).click();
		driver.findElement(By.xpath("//option[@value='2']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Kyla");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("12345");
		driver.findElement(By.xpath(("//input[contains(@src,'/submit.gif')]"))).click();
		
		
		
		
		
		
		
		
	}

}
