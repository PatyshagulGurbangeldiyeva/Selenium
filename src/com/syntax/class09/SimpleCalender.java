package com.syntax.class09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.Base;
import com.syntax.utils.CommonMethods;

public class SimpleCalender extends Base {
	/*
	 * Step 1- Click on calendar
     * 
     * Step 2- Get all td of table using findElements method
     * 
     * Step 3- using for loop get text of all td elements
     * 
     * Step 4- using if else condition we will check specific date
     * 
     * Step 5- If date is matched then click and break the loop.
	 */

	public static void main(String[] args) throws InterruptedException {
		
		setUp(); //"http://166.62.36.207/humanresources/symfony/web/index.php/auth"
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
		//navigate to leave list
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Leave List")).click();
		
		
		//clicking on calendar
		driver.findElement(By.id("calFromDate")).click();
	
		WebElement monthDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")); // as it has select tagName we will create select class
		
		CommonMethods.selectDdValue(monthDD, "Apr");
		

		WebElement yearDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		CommonMethods.selectDdValue(yearDD, "2021");
		
		
		// selecting day from the calendar
		List<WebElement> fromDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement fromD:fromDate) {
			String text=fromD.getText();
			if (text.equalsIgnoreCase("3")) {
				fromD.click();
				break;// if you will not break you will get exceptions--> so break it or loop will run
			}
		}
		
		Thread.sleep(4000);
	}

}
