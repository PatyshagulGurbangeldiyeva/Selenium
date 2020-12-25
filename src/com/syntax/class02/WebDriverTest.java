package com.syntax.class02;

public class WebDriverTest {

	public static void main(String[] args) {
		
		SWebDriver driver=new SChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.close();
		
		SWebDriver driver2=new SFireFoxDriver();
		
		driver2.get("https://www.firefox.com");

	}

}
