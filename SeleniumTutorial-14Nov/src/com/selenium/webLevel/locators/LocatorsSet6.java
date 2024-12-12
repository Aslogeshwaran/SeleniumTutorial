package com.selenium.webLevel.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSet6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//css selector
		
		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement fullNameField = driver.findElement(By.xpath("input[name^='name']"));
		
		fullNameField.sendKeys("admin");
		
		WebElement chooseEmailID = driver.findElement(By.cssSelector("input[name*='gin']"));	
		
		chooseEmailID.sendKeys("admin2025");
		
		WebElement checkAvailability = driver.findElement(By.cssSelector("table#tblcrtac>tbody>tr:nth-of-type(7)>td:nth-of-type(3)>input.btn_checkavail"));
		
		checkAvailability.click();
	}

}
