package com.fullcreative.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer {
	
	public static FileInputStream envfis=null;
	public static Properties envprop=null;
	
	public static FileInputStream locatorfis=null;
	public static Properties locatorprop=null;
	
	public static WebDriver wd = null;
	
	public static void initializer() throws IOException {
		
   
		envfis = new FileInputStream(new File("src/test/resources/com/fullcreative/config/env.properties"));
		
		envprop=new Properties();
		envprop.load(envfis);
		
		locatorfis=new FileInputStream(new File("src/test/resources/com/fullcreative/config/locator.properties"));
		
		locatorprop=new Properties();
		locatorprop.load(locatorfis);
		
		if(envprop.get("BROWSER").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 wd=new ChromeDriver();
			
		}else if(envprop.get("BROWSER").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 wd=new FirefoxDriver();
			
		}else if(envprop.get("BROWSER").equals("ie")) {
			WebDriverManager.iedriver().setup();
			 wd=new InternetExplorerDriver();
			
		}else if(envprop.get("BROWSER").equals("safari")) {
			WebDriverManager.edgedriver().setup();
			 wd=new SafariDriver();	
		}
		
		wd.manage().window().maximize();
		wd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static WebElement getElementByClass(String name) {
		return wd.findElement(By.className(locatorprop.getProperty(name)));

	}
	
	public static WebElement getElementById(String id) {
		return wd.findElement(By.id(locatorprop.getProperty(id)));

	}
	public static WebElement getElementByXpath(String xpath) {
		return wd.findElement(By.xpath(locatorprop.getProperty(xpath)));

	}
		public static WebElement getElementByName(String name) {
		return wd.findElement(By.name(locatorprop.getProperty(name)));

	}
	



	}


