package com.syntax.selenium.homework06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlerTask {
//	JavaScript alert text verification
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Alerts & Modals” links
//	Click on “Javascript Alerts” links
//	Click on button in “Java Script Alert Box” section
//	Verify alert box with text “I am an alert box!” is present
//	Click on button in “Java Script Confirm Box” section
//	Verify alert box with text “Press a button!” is present
//	Click on button in “Java Script Alert Box” section
//	Enter text in the alert box
//	Quit browser

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			WebDriver driver=new ChromeDriver();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		
		List<WebElement> links=driver.findElements(By.xpath("//a[@class='dropdown-toggle']"));
		
		for (WebElement link:links) {
			String linkText=link.getText();
			if (linkText.equals("Alerts & Modals")) {
				Thread.sleep(2000);
				link.click();
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Javascript Alerts")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		Alert alert1=driver.switchTo().alert();
		String alertText1=alert1.getText();
		
		if (alertText1.equalsIgnoreCase("I am an alert box!")) {
			System.out.println("Alert text is : "+alertText1+". Test case is passed");
			Thread.sleep(2000);
			 alert1.accept();
		}else {
			System.out.println("Test case is failed");
		}
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][@onclick='myConfirmFunction()']")).click();
		Alert alert2=driver.switchTo().alert();
		
		String alert2Text=alert2.getText();
		System.out.println(alert2Text);
		if (alert2Text.equalsIgnoreCase("Press a button!")) {
			System.out.println("the text in the alert2 is: "+alert2Text+ "Test case is passed");
			Thread.sleep(2000);
			alert2.accept();
		}else {
			System.out.println("test case is failed");
		}
		
		
		Thread.sleep(1000);
		
		String name="Paty";
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][@onclick='myPromptFunction()']")).click();
		Alert alert3=driver.switchTo().alert();
		
		

	
		String alert3Text=alert3.getText();
		
		
		System.out.println(alert3Text);
		
		if (alert3Text.equals("Please enter your name")) {
			System.out.println("the text in the alert3 is: "+alert3Text+ "Test case is passed");
			alert3.sendKeys(name);
			alert3.accept();
		}else {
			System.out.println("test case is failed");
		}
		
		 String enteredtext=driver.findElement(By.id("prompt-demo")).getText();
		 System.out.println(enteredtext);
		Thread.sleep(3000);
		
		//driver.quit();
		
		}

	}


