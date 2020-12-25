package com.syntax.class09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.Base;

public class DeltaCalendar extends Base{

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//		WebDriver driver=new  ChromeDriver();
//		driver.get("https://www.delta.com");
		
		
		setUp();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@id='calDepartLabelCont']")).click(); // finding calendar
		
		String dMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		while(!dMonth.equals("August")) { // if it is not equal to august click to the next
			driver.findElement(By.linkText("Next")).click();
			Thread.sleep(5000);
			dMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText(); // here we need to relocate
		}
		

		
		// loop through the td and grab the text (days)
		
		
		List<WebElement> fromCells=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']//tr//td"));
		
		for (WebElement fromCell:fromCells) {
			String fromText=fromCell.getText();
			
			if (fromText.equals("15")) {
				fromCell.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		String returnMotnth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
		
		while(!returnMotnth.equals("October")) {
			driver.findElement(By.linkText("Next")).click();
			Thread.sleep(5000);
			returnMotnth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
			
		}
		
		// loop through the td and grab the text (days)
		
		List <WebElement> returnCells=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']//tr//td"));
		
		for (WebElement returnCell:returnCells) {
			String returnText=returnCell.getText();
			if (returnText.equalsIgnoreCase("11")) {
				returnCell.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[@value='done']")).click();
		
	}

}
