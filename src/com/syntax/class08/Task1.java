package com.syntax.class08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.Base;

public class Task1 {
	
//		 Table headers and rows verification
//	 Open chrome browser
//	 Go to “http://166.62.36.207/syntaxpractice/”
//	 Click on “Table” link
//	 Click on “ITable Data Search” link
//	 Verify second table consist of 5 rows and 4 columns
//	 Print name of all column headers 
//	 Print data of all rows
//	 Quit Browser

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/");
		
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		for (WebElement link:links) {
			String linkText=link.getText();
			if (linkText.equals("Table")) {
				link.click();
			}
		}
		driver.findElement(By.linkText("Table Data Search")).click();
		
		List <WebElement> rows=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		
		System.out.println("The text in the rows are: ");
		for (int i=0; i<rows.size(); i++) {
			String textRows=rows.get(i).getText();
			System.out.println(textRows);
		}
		
		System.out.println("number of rows are: "+rows.size()+" in table 2");
		
		System.out.println();
		
		List <WebElement> colums=driver.findElements(By.xpath("//table[@class='table']/thead[2]/tr/th"));
		System.out.println("number of colums are: "+colums.size());
		
		System.out.println("the name of colums headers in table 2 are : ");
		for (WebElement colum:colums ) {
			String columText=colum.getText();
			System.out.print(columText+" ");
		} 
		
		
	}

}


