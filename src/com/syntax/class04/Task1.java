package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static String url="https://www.amazon.com/";

	public static void main(String[] args) {
	
//		TC 1: Amazon link count: 
//			Open chrome browser
//			Go to “https://www.amazon.com/”
//			Get all links
//			Get number of links that has text
//			Print to console only the links that has text
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		List <WebElement>lists=driver.findElements(By.tagName("a"));
		
		int count=0;
		
		for (WebElement list:lists) {
			String text=list.getText();
			if (!text.isEmpty()) {
				System.out.println(text);
				count++;
			}
		}
		System.out.println("total number of links with text is: "+count);

	}

}
