package com.testngpkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.sf.saxon.om.SiblingCountingNode;

public class Problem1 {

	public static WebDriver driver=null;
	public static List<WebElement> title;
	public static int remainingvalue;
	public static List<WebElement> getallprices;
	
	public static void main(String str[])
	
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Selenium Setup\\Browser Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://team-scale.com/testo/references/inventory/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		
		getallprices= driver.findElements(By.className("price"));
		
		gettitle(getallprices);	     
		
		}
	
	
	public static void gettitle(List<WebElement> elements)
		     
		     {
		    	 	for (int i=0; i<elements.size();i++)
		    	 	{
		    		 //  System.out.println(elements.get(i).getText());
		 			 String getvalue=elements.get(i).getText();
		 			  remainingvalue=Integer.parseInt(getvalue);
		    	 	  
		    	 	  
		    	 	  
		 			  
		 			  if(remainingvalue<40)
		    
		    	 		  
		    	 		
		    	 {
		    	 		  
		    		 title=driver.findElements(By.xpath("//span[@class='price']/preceding::span[@class='title']"));
		    		 
		    		 
		    		 System.out.println(title.get(i).getText().toString());
		    		 
		    		 
		    	 }
		    	/*else
			     {
			    	 title=driver.findElements(By.xpath("//span[@class='price']/preceding::span[@class='title'][count]"));
			    	 System.out.println(title.get(i).getText().toString()); 
		    	
		     }*/
		     }
	    	
		    }
} 
		



