package com.syntax.SeleniumReview02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitReview {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // locating the driver
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		
		driver.manage().window().fullscreen();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// click to the bottom download
		WebElement startDownloadB=driver.findElement(By.cssSelector("button[class='btn btn-primary']")); 
		startDownloadB.click();
		
		
		
		//Verify that the document is downloaded
		
		WebDriverWait wait=new WebDriverWait(driver,20);//NoSuchElementException---> we had as we don't have wait and selenium couldn't find the element as it works faster than browser
														// so we need to creat Wait
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Complete!']")));
		WebElement completeStatus=driver.findElement(By.xpath("//div[text()='Complete!']")); // finding element of complete
		String completeStatustext=completeStatus.getText();
		System.out.println(completeStatustext);
		
		WebElement closeButton=driver.findElement(By.xpath("//button[text()='Close']"));
		wait.until(ExpectedConditions.elementToBeClickable(closeButton));
		closeButton.click();
		

	}

}
