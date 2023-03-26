package com.fullcreative.maincheckout;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fullcreative.initializer.Initializer;
import com.fullcreative.pages.CheckOutPages;
import com.fullcreative.pages.LoginPage;

public class MainCheckOutPage extends Initializer{
	
	
	@BeforeTest
	public void setup() throws IOException {
		
		initializer();
		wd.get(envprop.getProperty("URL"));
					
	}
	
	
	@Test(dataProvider = "passdata")
	public void validatecheckoutpage(String emailid,String password,String boardtitle,String enterlistA, String enterlistB,
			String entertitle) {
		
		LoginPage.enteremailid(emailid);
		LoginPage.clickcontinuebutton();
		LoginPage.enterpassword(password);
		LoginPage.clicklogin();
		
		CheckOutPages.clickcreate();
		CheckOutPages.clickcreateboard();
		CheckOutPages.enterboardtitle(boardtitle);
		CheckOutPages.clickcreate1();
		CheckOutPages.clickaddlist();
		CheckOutPages.enterlistA(enterlistA);
		CheckOutPages.clickadd();
		CheckOutPages.enterlistB(enterlistB);
		CheckOutPages.clickadd1();
		CheckOutPages.clickaddcart();
		CheckOutPages.entertitle(entertitle);
		CheckOutPages.clickenter();
		CheckOutPages.clickaddB();
		CheckOutPages.action(wd);
		
		WebElement coordinates=wd.findElement(By.xpath(".//span[@class='list-card-title js-card-name']"));
		
		Point p=coordinates.getLocation();
		int x=p.x;
		int y=p.y;
		System.out.println("x coordinate is :"+x);
		System.out.println("y coordinate is :"+y);
	}
	
	@DataProvider(name="passdata")
	public static Object[][] getCheckoutData() {
		
		Object [][] data=new Object[1][6];
		data[0][0]="umadeviut2330@gmail.com";
		data[0][1]="Tumakutty@123";
		data[0][2]="FullCreative";
		data[0][3]="ListA";
		data[0][4]="ListB";
		data[0][5]="draganddrop";
		
		return data;
	
		
	}

}
