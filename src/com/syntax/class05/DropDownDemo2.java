package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.Base;

public class DropDownDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		Base.setUp();// https://demoqa.com/automation-practice-form/
		// as we gave return to method we do not need to extend class, just calling by method class name
		
		WebElement continents=Base.driver.findElement(By.id("continents"));
		
		Select select=new Select(continents);
		
		
		
		List <WebElement> options=select.getOptions();//--> will return list of options
		
		for (WebElement option:options) {
			String text=option.getText();
			System.out.println(text);
			
			if (text.equals("Africa")) {
				option.click();
				String ddText=option.getText();
				if (ddText.equals("Africa")) {
					System.out.println("Africa is selected"+option.isSelected());
				}
				
			}
			
			Thread.sleep(1000);
			select.selectByVisibleText("North America");
			
		}
		
			boolean isMultiple=select.isMultiple();
			
			System.out.println(" the selected drop down is multiple:"+ isMultiple);
	}

}
