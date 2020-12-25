package com.syntax.class07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class TaskFacebook extends CommonMethods{

	public static void main(String[] args) { // the methods that we called in utilities package
		
		
		// using common methods login to the facebook
		
		setUp();
		
		
		//identify element name
		WebElement userName=driver.findElement(By.name("firstname"));
		sendText(userName, ConfigsReader.getProperty("username") );
		
		//identify element lastName
		WebElement lastName=driver.findElement(By.name("lastname"));
		sendText(lastName, ConfigsReader.getProperty("lastName"));
		
		//identify element email
		WebElement email=driver.findElement(By.name("reg_email__"));
		sendText(email, ConfigsReader.getProperty("email"));
		
		//identify element rewrite email
		WebElement confirmEmail=driver.findElement(By.name("reg_email_confirmation__"));
		sendText(confirmEmail, ConfigsReader.getProperty("email"));
		
		//identify element password
		WebElement newPassword=driver.findElement(By.name("reg_passwd__"));
		sendText(newPassword, ConfigsReader.getProperty("password"));
		
		// identify gender radioB
		List <WebElement> radioB=driver.findElements(By.xpath("// input[@class='_8esa']"));
		clickRadioOrCheckbox(radioB, "1");
		
		// identifying dd month by value
		WebElement month=driver.findElement(By.id("month"));
		selectDdValue(month, "Dec");// it did n ot give exception when I wrote December? why
		
		
		// identifying dd by index
		
		WebElement  day=driver.findElement(By.name("birthday_day"));
		selectDdValue(day, 4);
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		selectDdValue(year, 10);
		
	}

		
	}


