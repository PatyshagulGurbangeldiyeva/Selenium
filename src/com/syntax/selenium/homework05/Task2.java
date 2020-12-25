package com.syntax.selenium.homework05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	
//	 Select and Deselect values
//	 Open chrome browser
//	 Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	 Click on “Input Forms” links
//	 Click on “Select Dropdown List” links
//	 Select value from “Select List Demo” section
//	 Verify value has been selected
//	 Select 4 options from “Multi Select List Demo”
//	 Deselect 1 of the option from the dd
//	 Quit browser

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("//a[text()='Select Dropdown List']")).click();
		
		WebElement days=driver.findElement(By.id("select-demo"));
		
		Select select=new Select(days);
		
		select.selectByIndex(3);
		
		

	}

}
