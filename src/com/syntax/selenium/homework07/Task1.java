package com.syntax.selenium.homework07;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
//	 Verify element is clickable
//	 Open chrome browser
//	 Go to “https://the-internet.herokuapp.com/”
//	 Click on “Click on the “Dynamic Controls” link
//	 Select checkbox and click Remove
//	 Click on Add button and verify “It's back!” text is displayed   
//	 Close the browser

	public static void main(String[] args) {
		
// here I used wait implicitly
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		WebElement button=driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		button.click();
		if (button.isSelected()) {
			driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		}
		
		WebElement addButtom=driver.findElement(By.xpath("//button[@type='button'][@onclick='swapCheckbox()']"));
		addButtom.click();
		
		WebElement message=driver.findElement(By.xpath("//p[@id='message']")); // if you will not add wait method it will give error exception as selenium works faster
		if (message.isDisplayed()) {
			String textMessage=message.getText();
			System.out.println("the text of the message is "+textMessage+" test is passed");
		}
		
		driver.quit();
	}

}
