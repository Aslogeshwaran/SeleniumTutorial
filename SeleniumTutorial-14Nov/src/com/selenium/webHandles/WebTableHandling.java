package com.selenium.webHandles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> tableHeadingRows = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/thead/tr"));//1
		
		for(int i=1;i<=tableHeadingRows.size();i++)
		{
			List<WebElement> tableHeadingColumns = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/thead/tr["+i+"]/th"));
			
			for(int j=1; j<=tableHeadingColumns.size(); j++)
			{
				WebElement tableData = driver.findElement(By.xpath("/html/body/div[2]/div[4]/table/thead/tr["+i+"]/th["+j+"]"));
				System.out.print(tableData.getText()+"|");
			}
			System.out.println();
		}
		
		List<WebElement> tableBodyRows = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/tbody/tr"));//1
		
		for(int i=1;i<=tableBodyRows.size();i++)
		{
			List<WebElement> tableBodyColumns = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/tbody/tr["+i+"]/td"));
			
			for(int j=1; j<=tableBodyColumns.size(); j++)
			{
				WebElement tableData = driver.findElement(By.xpath("/html/body/div[2]/div[4]/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(tableData.getText()+"|");
			}
			System.out.println();
		}
		

	}

}
