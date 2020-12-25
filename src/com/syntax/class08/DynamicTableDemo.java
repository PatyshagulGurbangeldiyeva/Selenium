package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.Base;

public class DynamicTableDemo extends Base {

	public static void main(String[] args) throws InterruptedException {
		
		setUp(); 
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String expectedValue="Bob Feather";

		List <WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		
		for (int i=0; i<rows.size();i++){
			String rowText=rows.get(i+1).getText(); // as we don't want to have header
			System.out.println(rowText);
			
			if (rowText.contains(expectedValue)) {
				driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[1]")).get(i).click();
				break;
			}
		}
		
		
		
	}

}
