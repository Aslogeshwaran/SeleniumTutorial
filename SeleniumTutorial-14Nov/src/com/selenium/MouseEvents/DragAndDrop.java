package com.selenium.MouseEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		Actions actions=new Actions(driver);
		
		driver.switchTo().frame(0);//index
		
		WebElement fromPlace = driver.findElement(By.xpath("/html/body/div[1]"));
		
		WebElement toPlace = driver.findElement(By.xpath("/html/body/div[2]"));
		
		actions.dragAndDrop(fromPlace, toPlace).perform();
		
	}

}
