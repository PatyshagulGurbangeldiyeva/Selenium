package com.syntax.test;

import com.syntax.pages.HrmsLoginPage;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HrmsLoginTest extends CommonMethods {

	public static void main(String[] args) {
		

		setUp();// http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
		HrmsLoginPage login=new HrmsLoginPage();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
	
		sendText(login.password,ConfigsReader.getProperty("password"));
	
		isDisplayed(login.loginBtn);
		waitClick(login.loginBtn);
		
		wait (5);
		
	//	tearDown();
		
	}

}
