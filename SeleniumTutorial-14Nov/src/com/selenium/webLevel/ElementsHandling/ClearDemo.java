package com.selenium.webLevel.ElementsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement emailField=driver.findElement(By.id("email"));
		
		WebElement passwordField=driver.findElement(By.name("pass"));
		
		emailField.sendKeys("email@mail.com");
		
		passwordField.sendKeys("Password@123");
		
		emailField.clear();
	}

}
