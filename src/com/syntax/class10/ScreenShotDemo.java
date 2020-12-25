package com.syntax.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.utils.Base;
import com.syntax.utils.ConfigsReader;

public class ScreenShotDemo extends Base{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		setUp(); //http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot) driver; // it is downcasting
		File sourceFile=ts.getScreenshotAs(OutputType.FILE); // this method return File
		
		try {
		FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/dashboard.png"));// here we are showing where we want to save 
															// here we create new folder of HRMS in screenshot
		}catch (IOException e){
		
			e.printStackTrace();
			System.out.println("scrennshot was not taken");
		}
		
tearDown();
		
	}

}
