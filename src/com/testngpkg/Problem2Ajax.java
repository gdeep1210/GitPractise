package com.testngpkg;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Problem2Ajax {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void main(String str[]) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Selenium Setup\\Browser Drivers\\chromedriver.exe");
		if(driver==null)
		{
			driver=new ChromeDriver();
			driver.get("https://team-scale.com/testo/references/ajax/");
			driver.manage().window().maximize();
		}
		wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("manufacture")));
		
		Select element=new Select(driver.findElement(By.id("manufacture")));
		getname(element);
		
		
	}
		public static void getname(Select sel) throws InterruptedException
		{
			
		sel.selectByVisibleText("Samsung");
		sel.selectByIndex(1);
		wait=new WebDriverWait(driver, 20);
		WebElement ajaxHolder1=driver.findElement(By.id("model"));
		Thread.sleep(7000);
		 driver.findElements(By.tagName("option"));
		System.out.println( driver.findElements(By.tagName("option")).get(1).getText().toString());
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("manufacture")));
		System.out.println();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Select model=new Select(driver.findElement(By.id("model")));
		//String text=driver.findElement(By.id("model")).getText().toString();
		//driver.findElement(By.id("answer")).sendKeys(text);
		
		
		}
		
		
		
		
		
		
	
	
	}


