package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.Base;

public class DynamicTableAnotherWay extends Base {

	public static void main(String[] args) throws InterruptedException {
		
		setUp(); 
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		
		WebElement table=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']"));
		List <WebElement> rows=table.findElements(By.tagName("//tr"));
		
		for (int i=1; i<rows.size();i++) {
			String rowText=rows.get(i-1).getText();
			
			if (rowText.contains("Bob Feather")) {
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[1]")).click();
				break;
			}
		}

	}

}
