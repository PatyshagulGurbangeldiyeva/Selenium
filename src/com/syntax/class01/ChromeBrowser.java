package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. set a system property for mac
																										// here you can write just: drivers/chromedriver 
		System.setProperty("webdriver.chrome.driver","/Users/vepagurbangeldiyev/eclipse-workspace/Selenium/drivers/chromedriver");
		
		// for windows set a system 
		// System.setProperty("webdriver.chrome.driver","/Users/vepagurbangeldiyev/eclipse-workspace/Selenium/drivers/chromedriver.exe");
		
		
		//2. creating webdriver type
		
		WebDriver driver=new ChromeDriver(); //--> why it asked to import it? because it is in different package
											// in this line it says : go ahead and open chrome browser
		
 	   
		// 3. navigate to Syntax application
		
		driver.get("https://www.google.com");
		
		String attribut=driver.findElement(By.id("fakebox-input")).getAttribute("aria-hidden");
		System.out.println(attribut);
		
		  Thread.sleep(2000); // --> we use it in order keep the opened webpg 
			
			
			driver.close(); //---> we use it in order to close the page automatically
			
			String url=driver.getCurrentUrl();
			
			System.out.println(url);
			System.out.println(driver.getTitle());
			
			
			
			

	}

}
