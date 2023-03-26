package com.fullcreative.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fullcreative.initializer.Initializer;

public class CheckOutPages extends Initializer{
	
	public static void clickcreate() {

	WebElement clickcreate = getElementByXpath("CHECKOUTPAGE_CLICK_CREATE_XPATH");
	if (clickcreate.isEnabled()) {
		clickcreate.click();
	}
}

   public static void clickcreateboard() {
	WebElement createboard = getElementByClass("CHECKOUTPAGE_CLICK_CREATEBOARD_CLASS");
	if (createboard.isEnabled()) {
		createboard.click();
	  }
	}
			
   public static void enterboardtitle(String data) {
	WebElement boardtitle = getElementByXpath("CHECKOUTPAGE_TYPE_BOARDTITLE_XPATH");
	if (boardtitle.isEnabled()) {
		boardtitle.sendKeys(data);
		}
	}
		
  public static void clickcreate1() {
	WebElement clickcreate1 = getElementByXpath("CHECKOUTPAGE_CLICK_CREATE1_XPATH");
	if (clickcreate1.isEnabled()) {
		clickcreate1.click();
	}
			
  }
  
  public static void clickaddlist() {
		WebElement addlist = getElementByClass("CHECKOUTPAGE_CLICK_ADDLIST_CLASS");
		if (addlist.isEnabled()) {
			addlist.click();
		}
				
	  }
  
  public static void enterlistA(String data) {
		WebElement enterlistA = getElementByClass("CHECKOUTPAGE_TYPE_ENTERLISTA_CLASS");
		if (enterlistA.isEnabled()) {
			enterlistA.sendKeys(data);
		}
				
	  }
   
  public static void clickadd() {
		WebElement clickadd = getElementByXpath("CHECKOUTPAGE_CLICK_CLICKADD_XPATH");
		if (clickadd.isEnabled()) {
			clickadd.click();
		}
				
	  }
  
  public static void enterlistB(String data) {
		WebElement enterlistB = getElementByName("CHECKOUTPAGE_TYPE_ENTERLISTB_NAME");
		if (enterlistB.isEnabled()) {
			enterlistB.sendKeys(data);
		}
				
	  }
  
  public static void clickadd1() {
		WebElement clickadd1 = getElementByXpath("CHECKOUTPAGE_CLICK_CLICKADD1_XPATH");
		if (clickadd1.isEnabled()) {
			clickadd1.click();
		}
				
	  }
  
  public static void clickaddcart() {
		WebElement clickaddcart = getElementByXpath("CHECKOUTPAGE_CLICK_ADDCARD_XPATH");
		if (clickaddcart.isEnabled()) {
			clickaddcart.click();
		}
				
	  }
  
  public static void entertitle(String data) {
		WebElement entertitle = getElementByXpath("CHECKOUTPAGE_TYPE_ENTERTITLE_XPATH");
		if (entertitle.isEnabled()) {
			entertitle.sendKeys(data);
			
		}
				
	  }
  
  public static void clickenter() {
		WebElement clickenter = getElementByXpath("CHECKOUTPAGE_CLICK_CLICKENTER_XPATH");
		if (clickenter.isEnabled()) {
			clickenter.click();
		}
				
	  }
  
  public static void clickaddB() {
		WebElement clickaddB = getElementByXpath("CHECKOUTPAGE_CLICK_ADDB_XPATH");
		if (clickaddB.isEnabled()) {
			clickaddB.click();
		}
				
	  }
  

  
   public static void action(WebDriver wd) {
	   
	   WebElement src = getElementByXpath("CHECKOUTPAGE_CLICK_SRC_XPATH");
	   WebElement dsc = getElementByXpath("CHECKOUTPAGE_CLICK_DSC_XPATH");
	   
	   Actions a = new Actions(wd);
	   a.dragAndDrop(src, dsc).build().perform();

   }
}
