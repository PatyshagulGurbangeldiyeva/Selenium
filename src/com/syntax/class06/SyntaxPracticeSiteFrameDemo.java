package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.Base;

public class SyntaxPracticeSiteFrameDemo {

	public static void main(String[] args) {
		
		WebDriver driver=Base.setUp();//http://166.62.36.207/syntaxpractice/bootstrap-iframe.html
		
		driver.switchTo().frame("FrameOne");// switching by using name
		boolean logoIsDis=driver.findElement(By.id("hide")).isDisplayed();// we want to see is the logo there or not
		System.out.println("Logo inside the frame is displayed: "+logoIsDis);
		
		driver.switchTo().defaultContent();// go to the another frame---> you need to go defaul content
		
		driver.switchTo().frame("FrameTwo");// go the the next frame
		boolean enrolIsEnable=driver.findElement(By.className("enroll-btn")).isEnabled();// want to see is enroll botton is enable in this frame
		System.out.println("The enroll bottom in second frame is enable: "+enrolIsEnable);
		
		
	}

}
