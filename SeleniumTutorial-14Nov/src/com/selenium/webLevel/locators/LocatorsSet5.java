package com.selenium.webLevel.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSet5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//relative xpath
		
		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement fullNameField = driver.findElement(By.xpath("//input[@type='text'][@maxlength='61']"));
		
		fullNameField.sendKeys("admin");
		
		WebElement chooseEmailID = driver.findElement(By.xpath("//input[starts-with(@name,'login')]"));	
		
		chooseEmailID.sendKeys("admin2025");
	}

}
