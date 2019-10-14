package org.com.bank.page;

import org.com.bank.constants.LoginConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage implements LoginConstants{
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name=USERID_NAME_LOCATOR)
	WebElement userIdElement;
	@FindBy(name=PASSWORD_NAME_LOCATOR)
	WebElement passworElement;
	@FindBy(name=LOGIN_BUTTON_NAME_LOCATOR)
	WebElement loginButtonElement;
	
	public void setUserIdElement(String uid) {
		userIdElement.sendKeys(uid);
	}
	public void setPassworElement(String pwd) {
		passworElement.sendKeys(pwd);
	}
	public void getLoginButtonElement() {
		 loginButtonElement.click();
	}
		
}
