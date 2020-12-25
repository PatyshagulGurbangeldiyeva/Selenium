package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html");
		
		String parentWindowhandle=driver.getWindowHandle();//----> it will return parent id
		System.out.println("what is the id of parent window handle: "+parentWindowhandle);
		System.out.println();
		
		
		String signUpTitle=driver.getTitle();
		System.out.println("the title of the main page is: "+signUpTitle);
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		
		Set <String> allWindowHandles=driver.getWindowHandles();
		System.out.println("number of windows opened: "+allWindowHandles.size());
		
		
//		for (String oneWindowHandle:allWindowHandles) {
//			System.out.println(oneWindowHandle);
//		}
		
		
		Iterator <String> it=allWindowHandles.iterator();
		while(it.hasNext()) {
			String handle=it.next();
			if (!handle.equals(parentWindowhandle)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
				Thread.sleep(6000);
			}
			
		}

	}


}
