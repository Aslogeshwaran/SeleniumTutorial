package com.selenium.webHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWait {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement textboxButton1 = driver.findElement(By.xpath("html/body/div[2]/div[6]/div/div/div[2]/div/div/div/div/article/div/button[1]"));
		
		textboxButton1.click();
		
		WebElement textBox1Field = driver.findElement(By.xpath("html/body/div[2]/div[6]/div/div/div[2]/div/div/div/div/article/div/h3/input"));
		textBox1Field.sendKeys("admin");
		
//		WebElement maleRadioButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[2]/label/input"));
//		
//		boolean displayed = maleRadioButton.isDisplayed();
//		
//		boolean enabled = maleRadioButton.isEnabled();
//		
//		boolean beforeClickSelected = maleRadioButton.isSelected();
//		
//		System.out.println(displayed);//true
//		
//		System.out.println(enabled);//true
//		
//		System.out.println(beforeClickSelected);//false
//		
//		maleRadioButton.click();
//		
//		boolean afterClickSelected = maleRadioButton.isSelected();
//		
//		System.out.println(afterClickSelected);//true
		
		
	}

}
