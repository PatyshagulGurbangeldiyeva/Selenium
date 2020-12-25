package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.Base;

public class DashBoardPageElements {
	@FindBy(id="welcome")
	public WebElement welcome;
	
	public DashBoardPageElements() {
		PageFactory.initElements(Base.driver, this);
	}

}
