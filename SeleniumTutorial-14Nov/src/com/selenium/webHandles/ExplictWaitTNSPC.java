package com.selenium.webHandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitTNSPC {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.tnpsc.gov.in/");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement registerUser = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div/a/div/ul/li/h3"));
		
		registerUser.click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> windows = driver.getWindowHandles();
		
		ArrayList<String> list=new ArrayList<String>(windows);
		
		System.out.println(list.size());
		
		driver.switchTo().window(list.get(1));
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		

		
		
	}

}
