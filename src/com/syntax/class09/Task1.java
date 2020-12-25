package com.syntax.class09;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	
//	 Table headers and rows verification
//	Open chrome browser
//	Go to “https://www.aa.com/homePage.do”
//	Enter From and To
//	Select departure as May 14 of 2020
//	Select arrival as November 8 of 2020
//	Click on search
//	Close browser


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//selectiong from date
		driver.findElement(By.xpath("///input[@class='aaDatePicker hasDatepicker'][@id='aa-leavingOn']")).click();
		String leaveMonthtext=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div[@class='ui-datepicker-title']")).getText();
		
		
		

		while(!leaveMonthtext.equals("May 2020")) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			Thread.sleep(5000);
			leaveMonthtext=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div[@class='ui-datepicker-title']")).getText();
			
		}
		
		List <WebElement> leaveDays=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//tbody//td"));
		
		for (WebElement day:leaveDays) {
			String dayText=day.getText();
			
			if (dayText.equalsIgnoreCase("24")) {
				day.click();
			}
		}
		
		
		// here I HAD PROBLEM
		driver.findElement(By.id("aa-returningFrom")).click(); 
		String returnMonthText=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']")).getText();
		
		while (!returnMonthText.equalsIgnoreCase("November 2020")) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			Thread.sleep(5000);
			returnMonthText=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']")).getText();
		}
		
		List <WebElement>returnDays=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//tbody//tr//td"));
	
		for(WebElement returnDay:returnDays) {
			String dayText=returnDay.getText();
			
			if (returnDay.equals("8")) {
				returnDay.click();
			}
		
		}
		
			
			
	
	
	
	
	}

}
