package com.syntax.selenium.homework01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPageTitleVarification {
	
//	 Amazon Page Title Verification: 
//		Open chrome browser
//		Go to “https://www.amazon.com/”
//		Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // it makes connection with chrome driver
	
		WebDriver driver=new ChromeDriver(); //--> in order to call Chrome we need to set system. 
			
		driver.get("https://www.amazon.com/");
		
		String actualUrl=driver.getTitle();
		
		String expectedUrl=("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		
		if (actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Varification successfull!");
		}else {
			System.out.println("Varification failed");
		}
		driver.close();
	}

}
