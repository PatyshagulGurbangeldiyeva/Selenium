package com.syntax.selenium.homework02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	
	public static void main(String[] args) throws InterruptedException {

//		Mercury Tours Registration: 
//			Open chrome browser
//			Go to “http://newtours.demoaut.com/”
//			Click on Register Link
//			Fill out all required info (skip dropdowns)
//			Click Submit
//			User successfully registered
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click(); // as here by using css it doesn't unique we will use xpath
		Thread.sleep(500);
		driver.findElement((By.cssSelector("input[name^='first']"))).sendKeys("Lara");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys("Mac");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[size='15']")).sendKeys("2348753");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input#userName")).sendKeys("lara@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name$='ss1']")).sendKeys("Arapaho 450");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Richerdson");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name$='Code']")).sendKeys("Texas");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name^='postal']")).sendKeys("34875");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("select[name='country']")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("option[value='5']")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Lara");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("12345lara");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name^='confirm']")).sendKeys("12345lara");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[src^='/images/']")).click();
		Thread.sleep(2000);
		
		
		
		

	}

}
