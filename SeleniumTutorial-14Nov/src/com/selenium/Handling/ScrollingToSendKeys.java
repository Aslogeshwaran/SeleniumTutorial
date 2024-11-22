package com.selenium.Handling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToSendKeys {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement usernameField = driver.findElement(By.name("login"));
		
		WebElement signinButton = driver.findElement(By.className("signinbtn"));
		
		JavascriptExecutor script=(JavascriptExecutor)driver;//step 1
		
		script.executeScript("arguments[0].value=('email@mail.com');",usernameField);
		
		script.executeScript("arguments[0].click();",signinButton);
		
		
				
		
	}

}
