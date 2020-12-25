package com.syntax.selenium.homework04;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	
//	Syntax Demo input boxes count: 
//		Open chrome browser
//		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		Click on “Input Forms” links
//		Click on “Simple Form Demo” links
//		Get all input boxes from the page
//		Enter “Hello” to each text box


	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",  "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		Thread.sleep(1000);
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();
		
		List<WebElement> allBoxes=driver.findElements(By.tagName("input"));
		
		
//		for (WebElement box:allBoxes) {
//			box.sendKeys("hello");
//			Thread.sleep(1000);
//		}
//		
//		Thread.sleep(1000); 
//		
//		
		
//		Iterator <WebElement> it=allBoxes.iterator();
//		
//		while(it.hasNext()) {
//			it.next().sendKeys("hello");
//			Thread.sleep(1000);
//		}
		
		Thread.sleep(1000);
		for (int i=0; i<allBoxes.size();i++) {
			allBoxes.get(i).sendKeys("hello");
			Thread.sleep(1000);
		}
		
		driver.quit();
		
	}

}
