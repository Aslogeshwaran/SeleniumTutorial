package com.selenium.MouseEvents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get(" https://demo.guru99.com/test/simple_context_menu.html");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		Actions actions=new Actions(driver);
		
		WebElement rightClickButton = driver.findElement(By.xpath("/html/body/span"));
		
		actions.contextClick(rightClickButton).perform();
		
		WebElement pasteOption = driver.findElement(By.xpath("/html/body/ul/li[4]/span"));
		
		actions.click(pasteOption).perform();
		
		Alert alert = driver.switchTo().alert();
		 
		System.out.println(alert.getText());
		
		alert.accept();
		
		WebElement doubleClickButton = driver.findElement(By.xpath("/html/body/button"));
		
		actions.doubleClick(doubleClickButton).perform();
		
		System.out.println(alert.getText());
		
		alert.accept();
	}

}
