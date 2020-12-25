package com.syntax.SeleniumReview02;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // locating the driver
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement alertButton=driver.findElement(By.id("alert"));
		alertButton.click(); // as we clicked we have alert
		
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		alert.accept();

		
		//clicking to the time alert
		
		List<WebElement> alerts=driver.findElements(By.xpath("//button[@style='background-color:DarkGreen']"));
		
		for (WebElement timingAlert:alerts) {
			String timingAlertText=timingAlert.getText();
			if (timingAlertText.equalsIgnoreCase("Timing Alert")) {
				timingAlert.click();
				
			}
		}
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		alert.accept();
	}

}
