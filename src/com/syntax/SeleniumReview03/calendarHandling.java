package com.syntax.SeleniumReview03;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.CommonMethods;

public class calendarHandling extends CommonMethods  {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		wait(2);
		WebElement datePicker=driver.findElement(By.xpath("//a[text()='Datepicker']"));
		datePicker.click();
		
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement calendar=driver.findElement(By.id("datepicker"));
//		waitClick(calendar); --> here we will have nullPointerException as we will have two drivers
							// 		line 15 we have already initialized our driver. and Selenium will
							// confused
		calendar.click();
		
		String departMonth="August 2020";
		
		while(true) { // we have to initialize our elements in every loop, so we did it here
			WebElement nextBtn=driver.findElement(By.xpath("//span[text()='Next']"));
			String monthText=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			if (!departMonth.equals(monthText)) {
				waitClick(nextBtn);
				
			}else {
				break; 
				
			}
		}
		
		List <WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td']"));
		selectCalendarDate(dates, "10");
		
		//after I tested I want to take a screenshot in order to prove that is worked or failed
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File pic=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pic, new File("screenshots/HRMS/calendar.png"));

		driver.quit();
	}

}
