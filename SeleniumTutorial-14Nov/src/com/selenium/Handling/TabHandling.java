package com.selenium.Handling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement createNewButton = driver.findElement(By.partialLinkText("Crea"));

		createNewButton.click();
		
		WebElement termsLink = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[10]/p/a[1]"));
		
		termsLink.click();
		
		Set<String> windows = driver.getWindowHandles();//step 1
		
		ArrayList<String> list=new ArrayList<String>(windows);//step 2
		
		System.out.println(list.size());//skip this line is used to get how many tabs opened 2
		
		driver.switchTo().window(list.get(1));//step 3 2 windows 0 1
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement emailField = driver.findElement(By.name("email"));
		
		emailField.sendKeys("email@mail.com");
		
		driver.switchTo().window(list.get(0));
		
		WebElement firstNameField = driver.findElement(By.name("firstname"));
		
		firstNameField.sendKeys("admin");
				
		
	}

}
