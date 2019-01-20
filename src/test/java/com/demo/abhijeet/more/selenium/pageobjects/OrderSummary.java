package com.demo.abhijeet.more.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demo.abhijeet.more.selenium.Pages;

/***
 * 
 * @author Abhi_Amarr
 *
 */
public class OrderSummary extends Pages {

	public OrderSummary(final WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "h1")
	private WebElement myAccountLbl;

	@FindBy(xpath = "//li[@class='step_done step_done_last four']")
	private WebElement shippingLbl;

	@FindBy(xpath = "//li[@id='step_end' and @class='step_current last']")
	private WebElement paymentLbl;

	@FindBy(xpath = "//*[@class='cheque-indent']/strong")
	private WebElement orderConfirmLbl;

	public boolean verifyOrderSummaryHeading(String heading) {
		waitForElement(myAccountLbl);
		return getTextPresent(myAccountLbl).contains(heading);
	}

	public boolean verifyShippingLbl() {
		return isElementVisible(shippingLbl);
	}

	public boolean verifyPaymentLbl() {
		return isElementVisible(paymentLbl);
	}

	public boolean verifyOrderConfirmLbl(String message) {
		return getTextPresent(orderConfirmLbl).contains(message);
	}

	public boolean verifyUrl(String url) {
		return getCurrentUrl().contains(url);
	}
}
