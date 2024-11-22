package com.selenium.Handling;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToPageEnd {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		JavascriptExecutor script=(JavascriptExecutor)driver;//step 1
		
		script.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		script.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
				
		
	}

}
