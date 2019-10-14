package org.com.bank.test;

import org.com.bank.basetest.BaseTest;
import org.com.bank.constants.LoginConstants;
import org.com.bank.page.LoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class LoginTest extends BaseTest implements LoginConstants{

	@Test
	public void loginSuccessTest() {
	driver.get(BASEURL);
	LoginPage page= new LoginPage(driver);
	page.setUserIdElement(USERID);
	page.setPassworElement(PASSWORD);
	page.getLoginButtonElement();
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(driver.getTitle(),EXPECT_TITLE);
	}
}
