package com.syntax.SeleniumReview02;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class WebTablePractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // locating the driver
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, true);   //       for the clear output.
		WebDriver driver=new ChromeDriver();
		driver.get("http://testingpool.com/data-types-in-java/");
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// identify table and get row numbers
		
		List <WebElement> rows=driver.findElements(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr"));
		int rowsSize=rows.size();
		System.out.println("total number of rows is: "+rowsSize);
		
		
		//getting colums number
		List <WebElement> colums=driver.findElements(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr[1]/td")); // here we got id of colums
		int columsNumber=colums.size();
		System.out.println("number of colums is: "+columsNumber);
		
	//	System.out.println(colums);
		
		//getting cell data 
		
		for(int i=1; i<rows.size();i++) { // as we are not starting from header we started from i=1 ---> it loops through the rows
			for (int j=1;j<columsNumber;j++) {					// ---> it loops via colums 
				WebElement cellData=driver.findElement(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr["+i+"]/td["+j+"]"));
				String cellDataText=cellData.getText();
		//		System.out.println(cellDataText);		//---> here we are getting all datas in the table
				
				// we want to get second column in the table
				if (j==2) {
					System.out.println(cellDataText);
				}
			}
			}
		
		
		
		
		}
		}

	
