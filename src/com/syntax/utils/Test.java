package com.syntax.utils;

public class Test extends Base {

	public static void main(String[] args) {
		// i want to open the driver
		// by using driver I want to get title
		// and last I want to close the browser
		
		
		setUp();
		String title=driver.getTitle();
		System.out.println(title);

	}

}
