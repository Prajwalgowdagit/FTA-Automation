package com.FTAAutomationFinally.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPg  {

@FindBy(xpath = "//input[@placeholder ='Enter email ID or phone number']")
private WebElement unTbx;

@FindBy(xpath = "//input[@placeholder ='Enter Password']")
private WebElement pwdTbx;

@FindBy(xpath = "//span[text() ='Login']")
private WebElement loginBtn;

public WebElement getUnTbx() {
	return unTbx;
}

public WebElement getPwdTbx() {
	return pwdTbx;
}
public WebElement getLoginBtn() {
	return loginBtn;
}

 public LoginPg(WebDriver d) {
	PageFactory.initElements(d, this);
}
 public void setlogin(String un, String pwd) {
	unTbx.sendKeys(un);
	pwdTbx.sendKeys(pwd);
	loginBtn.click();
}

}
