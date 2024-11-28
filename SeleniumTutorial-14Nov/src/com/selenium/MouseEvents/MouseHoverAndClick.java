package com.selenium.MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAndClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement companiesLink = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/nav/ul/li[2]/a/div"));
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(companiesLink).perform();
		
		WebElement salaryCalculatorLink = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/nav/ul/li[2]/div/ul[3]/li[5]/a/div"));
		
		actions.click(salaryCalculatorLink).perform();
		 
		
	}

}
