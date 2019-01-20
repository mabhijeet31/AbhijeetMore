package com.demo.abhijeet.more.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demo.abhijeet.more.selenium.Pages;

/***
 * 
 * @author Abhi_Amarr
 *
 */
public class RegistrationPage extends Pages {

	public RegistrationPage(final WebDriver driver) {
		super(driver);
	}

	private By gender = By.id("id_gender2");

	@FindBy(id = "id_gender2")
	private WebElement genderRadio;

	@FindBy(id = "customer_firstname")
	private WebElement firstNameTxt;

	@FindBy(id = "customer_lastname")
	private WebElement lastnameTxt;

	@FindBy(id = "passwd")
	private WebElement passwordTxt;

	@FindBy(id = "days")
	private WebElement daySelect;

	@FindBy(id = "months")
	private WebElement monthSelect;

	@FindBy(id = "years")
	private WebElement yearSelect;

	@FindBy(id = "company")
	private WebElement companyTxt;

	@FindBy(id = "address1")
	private WebElement addressTxt;

	@FindBy(id = "address2")
	private WebElement address2Txt;

	@FindBy(id = "city")
	private WebElement cityTxt;

	@FindBy(id = "id_state")
	private WebElement stateTxt;

	@FindBy(id = "postcode")
	private WebElement postCodeTxt;

	@FindBy(id = "other")
	private WebElement otherTxt;

	@FindBy(id = "phone")
	private WebElement phoneTxt;

	@FindBy(id = "phone_mobile")
	private WebElement phoneMobileTxt;

	@FindBy(id = "alias")
	private WebElement aliasTxt;

	@FindBy(id = "submitAccount")
	private WebElement submitAccountBtn;

	public void selectGender() {
		waitForElementLocated(gender);
		clickWebElement(genderRadio);
	}

	public void setFirstName(String firstName) {
		sendValueToElement(firstNameTxt, firstName);
	}

	public void setLastName(String lastName) {
		sendValueToElement(lastnameTxt, lastName);
	}

	public void setPasswordName(String Password) {
		sendValueToElement(passwordTxt, Password);
	}

	public void selectDaysFromList(String days) {
		selectElementFromDropDown(daySelect, days);
	}

	public void selectMonthFromList(String month) {
		selectElementFromDropDown(monthSelect, month);
	}

	public void selectYearFromList(String year) {
		selectElementFromDropDown(yearSelect, year);
	}

	public void setCompanyValue(String company) {
		sendValueToElement(companyTxt, company);
	}

	public void setAddress1Value(String address1) {
		sendValueToElement(addressTxt, address1);
	}

	public void setAddress2Value(String address2) {
		sendValueToElement(address2Txt, address2);
	}

	public void setCityName(String city) {
		sendValueToElement(cityTxt, city);
	}

	public void selectStateFromList(String state) {
		selectElementFromDropDownVisibleText(stateTxt, state);
	}

	public void setPostCode(String postCode) {
		sendValueToElement(postCodeTxt, postCode);
	}

	public void setOther(String other) {
		sendValueToElement(otherTxt, other);
	}

	public void setPhoneNumber(String phoneNumber) {
		sendValueToElement(phoneTxt, phoneNumber);
	}

	public void setMobileNumber(String MobileNumber) {
		sendValueToElement(phoneMobileTxt, MobileNumber);
	}

	public void setAlias(String alias) {
		sendValueToElement(aliasTxt, alias);
	}

	public void clickSubmitAccountBtn() {
		clickWebElement(submitAccountBtn);
	}

}
