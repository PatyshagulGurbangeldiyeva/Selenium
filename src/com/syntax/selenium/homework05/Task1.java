package com.syntax.selenium.homework05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	
//	Amazon Department List Verification
//	Open chrome browser
//	Go to “http://amazon.com/”
//	Verify how many department options available.
//	Print each department 
//	Select Computers


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com/");
		
		WebElement departments=driver.findElement(By.name("url"));
		
		Select select=new Select(departments);
		
		List <WebElement> options=select.getOptions();
		
		System.out.println("how many department options available: "+options.size());
		
		
		Iterator <WebElement> it=options.iterator();

		while (it.hasNext()) {
			String name=it.next().getText();
			System.out.println(name);
		}
		
		select.selectByVisibleText("Computers");
		
		driver.quit();
		
	}


}
