package com.FTAAutomationFinally.generic;

import org.openqa.selenium.WebElement;


public class WebDriverUtility extends BaseClass{
	sr=new ServiceRequest(d);

	public void clickReqTrk(WebElement ele) {
		sr.getReqTkr().click();
	}
}
