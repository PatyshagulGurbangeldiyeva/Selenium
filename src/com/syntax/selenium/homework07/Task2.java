package com.syntax.selenium.homework07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2 {
//	 Verify element is enabled
//	 Open chrome browser
//	 Go to “https://the-internet.herokuapp.com/”
//	 Click on “Click on the “Dynamic Controls” link
//	 Click on enable button
//	 Enter “Hello” and verify text is entered successfully
//	 Close the browser
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		

		driver.findElement(By.xpath("//button[@type='button' and @onclick='swapInput()']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
		
		WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
	
		Thread.sleep(2000);
		text.sendKeys("Hello");
		
		String textAfterSend=driver.findElement(By.id("message")).getText();
		
		System.out.println(textAfterSend);
		
		Thread.sleep(2000);
		if (textAfterSend.equalsIgnoreCase("It's enabled!")) {
			
			System.out.println("the text is:"+textAfterSend+" test passed");
		}
		
	//	driver.quit();
		
		                     

}
}
