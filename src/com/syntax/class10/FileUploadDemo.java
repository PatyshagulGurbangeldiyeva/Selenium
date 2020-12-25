package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class FileUploadDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	String url="https://the-internet.herokuapp.com/";
	
	System.setProperty (ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
	
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	
	//click on File to Upload link
	driver.findElement(By.linkText("File Upload")).click();
	
	// click on choose file
	driver.findElement(By.id("file-upload")).click();
	
														// write the path of the file that you want to send
	driver.findElement(By.id("file-upload")).sendKeys("/Users/vepagurbangeldiyev/Desktop/file.png");
	
	driver.findElement(By.id("file-submit")).click();
	
	Thread.sleep(5000);
	
	}	

}
