package com.demo.abhijeet.more.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demo.abhijeet.more.selenium.Pages;

public class Myaccount extends Pages {

	public Myaccount(final WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "h1")
	private WebElement myAccountLbl;

	private By heading = By.cssSelector("h1");

	@FindBy(className = "account")
	private WebElement accountName;

	@FindBy(className = "info-account")
	private WebElement accountInfoHeading;

	@FindBy(className = "logout")
	private WebElement logoutLbl;

	public boolean verifyMyAccountHeading() {
		waitForElementLocated(heading);
		return getTextPresent(myAccountLbl).contains("MY ACCOUNT");
	}

	public boolean verifyAccountNameHeading(String firstname, String lastName) {
		return getTextPresent(accountName).contains((firstname + " " + lastName));
	}

	public boolean verifyAccountNameHeading(String fullName) {
		return getTextPresent(accountName).contains((fullName));
	}

	public boolean verifyAccountInfoLbl() {
		return getTextPresent(accountInfoHeading).contains("Welcome to your account.");
	}

	public boolean verifyLogoutLbl() {
		return isElementVisible(logoutLbl);
	}

	public void clickLogoutBtn() {
	     clickWebElement(logoutLbl);
	}

	public boolean verifyUrl(String url) {
		return getCurrentUrl().contains(url);
	}
}
