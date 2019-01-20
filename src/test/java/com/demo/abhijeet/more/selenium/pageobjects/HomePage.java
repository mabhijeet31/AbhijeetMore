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
public class HomePage extends Pages {

	public HomePage(final WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "login")
	private WebElement signBtn;

	private By logInBtn = By.className("login");

	public void clickSignInBtn() {
		waitForElementLocated(logInBtn);
		clickWebElement(signBtn);
		pageRefresh();
	}
}
