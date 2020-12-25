package com.syntax.selenium.homework09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.CommonMethods;

public class HW1 extends CommonMethods {
//	 Calendar headers and rows verification
//	 Open chrome browser
//	 Go to “https://www.aa.com/homePage.do”
//	 Enter From and To
//	 Select departure as July 14 of 2020
//	 Select arrival as November 8 of 2020
//	 Close browser
//	 Depart Month Year Xpath: "//div[contains(@class, 'ui-corner-left')]/div"
//	 Depart Month Days Xpath: //div[contains(@class, 'ui-corner-left')]/following-sibling::table/tbody/tr/td
//	 Next Button Xpath: //a[@title='Next']
//	 Return Month Xpath: //span[@class='ui-datepicker-month']
//	 Return Days Xpath: //table[@class='ui-datepicker-calendar']/tbody/tr/td
//	 You can put the logic the way you want.

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
														
		WebElement from=driver.findElement (By.name("originAirport"));
		from.clear();		
		from.sendKeys("AID", Keys.TAB); // we use enum in order to pass from suggestions in browser
										// enum, it is similar to class but it has just static variables
		
		
		WebElement to=driver.findElement(By.name("destinationAirport"));
		to.clear();
		to.sendKeys("CTS", Keys.ENTER);
		
		WebElement depart=driver.findElement(By.id("aa-leavingOn"));
		depart.click();
		
		
		
		WebElement monthDepart=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]"));
		String monthDepartText=monthDepart.getText();
		
		while(!monthDepartText.equalsIgnoreCase("July 2020")) {
			WebElement nextBtn=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//a[contains(@class,'ui-corner-all')]"));
			nextBtn.click();
			Thread.sleep(5000);
			
			WebElement monthDepart1=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]"));
			
			
		
		}
	}

}
