package com.syntax.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/syntaxpractice/table-search-filter-demo.html");
		driver.manage().window().fullscreen();
		
		
		System.out.println("************* working with rows *************");
		List <WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr")); // when we have this xpath we have 1/7 so it will return list

		System.out.println("number of rows: "+rows.size());// getting number of rows
	
	
	Iterator <WebElement> it=rows.iterator();
	
	while(it.hasNext()) {
		String rowText=it.next().getText();
		System.out.println(rowText);
		
	}
	
	
	System.out.println();
	System.out.println("************* working with colums *************");
	
	List <WebElement> colums=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
	
	System.out.println("number of colums: "+colums.size());// getting number of colums
	
	for (WebElement col:colums) {
		String colText=col.getText();
		System.out.println(colText); // if we write col---> we will get xpath of the cols
	}
	}

}
