package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.Base;

public class HrmsLoginPageElements {
	
	
	// instead of writing findElement we czan use @FindBy(xpath(""))/ public Webelement Name;
	// when we are using @Find... we need to use PageFactory class to initialize our webElements in constructor
	// we are locating the elements from the webpg :
	//   http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	@FindBy(css="input#btnLogin")
	public WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	public WebElement logo;
	
	public HrmsLoginPageElements() {
		PageFactory.initElements(Base.driver,this); //---> it is a class, we are using it to initialize all the elements at once
	}

}
