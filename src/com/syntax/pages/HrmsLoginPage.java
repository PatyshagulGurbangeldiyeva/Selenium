package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class HrmsLoginPage extends CommonMethods { // from here we are getting methods

	// the goal of this class is to store the elements---> no actions no methods
	
public	WebElement username=driver.findElement(By.id("txtUsername"));
public	WebElement password=driver.findElement(By.id("txtPassword"));
public	WebElement loginBtn=driver.findElement(By.id("btnLogin"));
public WebElement login=driver.findElement(By.id("divLogo"));
}
