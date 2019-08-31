package com.testngpkg;

import java.text.DateFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Datepickermethod {
	
	public static WebDriver driver;
	public static WebElement oPencalender;
	public static String datevalue="02.08.2019";
	
	
	public static void main(String str[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Selenium Setup\\Browser Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://team-scale.com/testo/references/date_picker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		oPencalender=driver.findElement(By.xpath("//input[@value = 'Open calendar']"));
		oPencalender.click();
		
		String arr[]=datevalue.split("[.]");
		
		System.out.println("The value of the first array :-" + arr[0]);
		
		if(arr[1].equalsIgnoreCase(getmonth()))
		{
		List<WebElement> dates=driver.findElements(By.xpath("//div[@id='cal-frame']/table[@class='curr']/table/tbody/tr/td[@class='eformDay']"));	
		for(int i=0;i<dates.size();i++)
		{
			
			
		if(Integer.parseInt(arr[0])==Integer.parseInt(dates.get(i).getText().toString()))
			
			{
			dates.get(i).click();
			System.out.println(dates.get(i).toString());
			break;
			}
			else{
				System.out.println("Date entered is wrong");
			}
		}
			
		}
		
		
		
	}
	
	
		public static String getmonth()
		{
	
		WebElement mOnthyear=driver.findElement(By.xpath("//div[@class='header']/span[3][@class='month-year']"));
		String month=mOnthyear.getText();
		
		String aRRaymonth[]=month.split(" ");
		System.out.println(aRRaymonth.length);
		System.out.println("01");
		System.out.println((aRRaymonth[0]));
		String nAmemonth;
		switch(aRRaymonth[0])
		
{
	case "JANUARY":
		nAmemonth= "01";	
		return nAmemonth;
		
				
		case "FEBRUARY":
			nAmemonth= "02";	
			return nAmemonth;
			
		
		case "MARCH":
			nAmemonth= "03";	
			return nAmemonth;
			
		
		case "APRIL":
			nAmemonth= "04";	
			return nAmemonth;
			
	
		case "MAY":
			nAmemonth= "05";	
			return nAmemonth;
			
		
		case "JUNE":
			nAmemonth= "06";	
			return nAmemonth;
			
			
		
		case "JULY":
			nAmemonth= "07";	
			return nAmemonth;
	
		case "AUGUST":
			nAmemonth= "08";	
			return nAmemonth;
			
	
		case "SEPTEMBER":
			nAmemonth= "09";	
			return nAmemonth;
			
		
		case "OCTOBER":
			nAmemonth= "10";	
			return nAmemonth;
			
		case "NOVEMBER":
			nAmemonth= "11";;	
			return nAmemonth;
	
		case "DECEMBER":
			 nAmemonth= "12";
			return nAmemonth;
				
		
				}
		return null;
	

	

}}