package com.testngpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {

	/*
	 * *Setup system property for Mozilla Browser
Setup system property for Mozilla Browser
Launch the Mozilla browser
Login to app
enter URL
Google Title Test
Logout from the APP
enter URL
search the text
Logout from the APP
Close all the browsers
Delete all cookies
PASSED: googletitletest
PASSED: search
	 */
	
	
	
	
	
//pre-condition Annotations

	@BeforeSuite//1
	public void setup()
	{
		System.out.println("Before suite--Setup system property for Mozilla Browser");
	}
	
	@BeforeTest//2
	public void launchBrowser()
	{
		System.out.println("Before Test--Launch the Mozilla browser");
	}
	
	@BeforeClass //3
		public void login()
	{
		System.out.println("Before class--Login to app");
		
	}
	
	
	@BeforeMethod  //4
	public void enterURL()
	{
		System.out.println("Before Method---enter URL");
	}
	
	

	//Test Cases annotations
			
	@Test   //5
	public void googletitletest()
	{
		System.out.println("Test---Google Title Test");
	}
	/*
	 * 
	 * Before suite--Setup system property for Mozilla Browser
	   Before Test--Launch the Mozilla browser
	   Before class--Login to app
	   
	   Before Method---enter URL
	   Test---Google Title Test
	   Aftermethod----Logout from the APP
	   
	   Before Method---enter URL
       Test----search the text
       Aftermethod----Logout from the APP
       
       Afterclass----Close all the browsers
       Aftertest-------Delete all cookies
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test  //
	public void search()
	{
		System.out.println("Test----search the text");
	}
	
	@AfterMethod  //6
	public void logout()
	{
		System.out.println("Aftermethod----Logout from the APP");
		
	}
	
	@AfterClass //7
	public void closebrowser()
	{
		System.out.println("Afterclass----Close all the browsers");
	}
	
	@AfterTest  //8
	public void deleteallcookies()
	{
		System.out.println("Aftertest-------Delete all cookies");
		
	}
	
		@AfterSuite //9
	public void generatetestreport()
	{
		System.out.println("Aftersuite-------Generate reports");
	}
	}


