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
public class ItemPage extends Pages {

	public ItemPage(final WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Women")
	private WebElement womenLnk;

	@FindBy(xpath = "//a[@title='Faded Short Sleeve T-shirts']/ancestor::li")
	private WebElement sleevTshirtItem;

	@FindBy(name = "Submit")
	private WebElement submitBtn;

	@FindBy(xpath = "//*[@id='layer_cart']//a[@class and @title='Proceed to checkout']")
	private WebElement checkOutItem;

	@FindBy(xpath = "//*[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']")
	private WebElement cartNevigate;

	private By cardNevigateBy = By.xpath("//*[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']");

	@FindBy(name = "processAddress")
	private WebElement processAdd;

	@FindBy(id = "uniform-cgv")
	private WebElement processShipping;

	@FindBy(name = "processCarrier")
	private WebElement CarrierLnk;

	@FindBy(className = "bankwire")
	private WebElement bankWireLnk;

	@FindBy(xpath = "//*[@id='cart_navigation']/button")
	private WebElement paymentBtn;

	public void clickWomenLnk() {
		waitForElement(womenLnk);
		clickWebElement(womenLnk);
		PageReload();
	}

	public void clickItemLnk() {
		clickWebElement(sleevTshirtItem);
	}

	public void clickSubmitBtn() {
		waitForElement(submitBtn);
		clickWebElement(submitBtn);
	}

	public void clickCkeckoutItm() {
		waitForElement(checkOutItem);
		clickWebElement(checkOutItem);
	}

	public void clickCartnevigate() {
		waitForElementLocated(cardNevigateBy);
		clickWebElement(cartNevigate);
	}

	public void clickProcessAdd() {
		waitForElement(processAdd);
		clickWebElement(processAdd);
	}

	public void clickShippingLnk() {
		waitForElement(processShipping);
		clickWebElement(processShipping);
	}

	public void clickCarrierLnk() {
		waitForElement(CarrierLnk);
		clickWebElement(CarrierLnk);
	}

	public void clickBankWireLnk() {
		waitForElement(bankWireLnk);
		clickWebElement(bankWireLnk);
	}

	public void clickPaymentBtn() {
		waitForElement(paymentBtn);
		clickWebElement(paymentBtn);
	}

}
