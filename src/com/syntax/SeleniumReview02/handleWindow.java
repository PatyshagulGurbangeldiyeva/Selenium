package com.syntax.SeleniumReview02;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // locating the driver
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click new browser window
		WebElement newBrowserWindowB=driver.findElement(By.xpath("//button[text()='New Browser Window']"));

		
		newBrowserWindowB.click();// as we clicked here we will get new window browser
	//	driver.manage().window().fullscreen();
		
		
		String parentWindow=driver.getWindowHandle();// getting parent window ID
		System.out.println(parentWindow);
		
		Thread.sleep(5000);
		driver.close();// so we are closing current first window
					// even you close the main window selenium didn't focus on the second window. So you need to switch
		
		
		Set <String> allWindows=driver.getWindowHandles();
		Iterator <String> it=allWindows.iterator();
		while (it.hasNext()){
			String childWindow=it.next();
			
			if(!parentWindow.equals(childWindow)) {//--> switching to the other window by comparing parent window, as first window is parent window so we want to switch from parent
		driver.switchTo().window(childWindow);
			
			}
		}
		
		driver.manage().window().fullscreen();
		WebElement header=driver.findElement(By.xpath("//strong[contains(text(), 'Agile Testing')]"));// getting the header from second window
		String headerText=header.getText();
		System.out.println(headerText);

	}

}
