package com.selenium.webHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement textboxButton1 = driver.findElement(By.cssSelector("button#btn1"));
		
		textboxButton1.click();
		
		WebElement textboxDisplayed1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#txt1")));
		
		textboxDisplayed1.sendKeys("admin");
		
		driver.switchTo().alert();

		
		
	}

}
