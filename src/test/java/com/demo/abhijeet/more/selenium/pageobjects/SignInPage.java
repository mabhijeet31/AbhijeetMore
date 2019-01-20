package com.demo.abhijeet.more.selenium.pageobjects;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demo.abhijeet.more.selenium.Pages;

/***
 * 
 * @author Abhi_Amarr
 *
 */
public class SignInPage extends Pages {

	public SignInPage(final WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "email_create")
	private WebElement emailCreate;

	@FindBy(id = "SubmitCreate")
	private WebElement submitCreate;

	@FindBy(id = "email")
	private WebElement emailIdTxt;

	@FindBy(id = "passwd")
	private WebElement passwordTxt;

	@FindBy(id = "SubmitLogin")
	private WebElement submitLoginBtn;

	public void createRandomEmail() {
		String timestamp = String.valueOf(new Date().getTime());
		String email = "hf_challenge_" + timestamp + "@hf" + timestamp.substring(7) + ".com";
		sendValueToElement(emailCreate, email);
	}

	public void clickSubmitBtn() {
		clickWebElement(submitCreate);
	}

	public void setEmailId(String emailId) {
		sendValueToElement(emailIdTxt, emailId);
	}

	public void setPasswd(String passwd) {
		sendValueToElement(passwordTxt, passwd);
	}

	public void clickSubmitLoginBtn() {
		clickWebElement(submitLoginBtn);
	}

}
