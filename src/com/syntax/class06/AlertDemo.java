package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.Base;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//http://uitestpractice.com/Students/Switchto
		
		WebDriver driver=Base.setUp();
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		
		// HANDELING SIMPLE ALLERT/POPUPS----> here we have just ok bottom
		Alert simpleAlert=driver.switchTo().alert(); // after allert is popped up we need to switch to the alert
		Thread.sleep(1000);
		String simpleAlertText=simpleAlert.getText(); // here we will get the text inside the alert
		
		System.out.println("this is the text of simple alert: "+simpleAlertText);
		simpleAlert.accept(); // if we want to accept the alert positive we are using accept()
		
		// HANDLING CONFIRMATION ALERT-----> here we have yes or no answers
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert=driver.switchTo().alert();  //----> you need to switch to alert in order do some work on it
		
		Thread.sleep(1000);
		String confirmAlertText=confirmAlert.getText();
		System.out.println(confirmAlertText);
		confirmAlert.dismiss();
		
		
		//HANDLING PROMT ALERTS-----> WE NEED TO GIVE TEXT OR MESSAGE THEN ACCEPT IT
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(1000);
		Alert promptAlert=driver.switchTo().alert();
		
		String prompText=promptAlert.getText();
		System.out.println("this is a text inside the promp alert: "+prompText);
		
		
		promptAlert.sendKeys("Alex");
		Thread.sleep(1000);
		promptAlert.accept();
		Thread.sleep(1000);
		String prompAlertText=driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println("This is the prompt alert text: "+prompAlertText);
		
		if (prompAlertText.contains("Helen")) {
			System.out.println("text was succsesfully added");
		}else {
			System.out.println("text is failed");
		}
		
		Base.tearDown(); // closing url

	}

}
