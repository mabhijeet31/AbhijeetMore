package com.demo.abhijeet.more.selenium.testcases;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.abhijeet.more.selenium.SeleniumTestWrapper;
import com.demo.abhijeet.more.selenium.configurations.TestConfig;
import com.demo.abhijeet.more.selenium.pageobjects.HomePage;
import com.demo.abhijeet.more.selenium.pageobjects.ItemPage;
import com.demo.abhijeet.more.selenium.pageobjects.Myaccount;
import com.demo.abhijeet.more.selenium.pageobjects.OrderSummary;
import com.demo.abhijeet.more.selenium.pageobjects.RegistrationPage;
import com.demo.abhijeet.more.selenium.pageobjects.SignInPage;
import com.demo.abhijeet.more.selenium.pageobjects.StartPage;

/***
 * 
 * @author Abhijeet More
 *
 */

public class GUITestingScenarioTest extends SeleniumTestWrapper {

	StartPage startPage = PageFactory.initElements(getDriver(), StartPage.class);
	SignInPage signPage = PageFactory.initElements(getDriver(), SignInPage.class);
	HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
	Myaccount myaccount = PageFactory.initElements(getDriver(), Myaccount.class);
	RegistrationPage registrationPage = PageFactory.initElements(getDriver(), RegistrationPage.class);
	ItemPage itemPage = PageFactory.initElements(getDriver(), ItemPage.class);
	OrderSummary orderSummary = PageFactory.initElements(getDriver(), OrderSummary.class);

	private final Logger logger = LoggerFactory.getLogger(GUITestingScenarioTest.class);
	static final TestConfig testConfig = new TestConfig();

	@Before
	public void setup() {
		startPage.open();

	}

	@Test
	public void Verify_SignIn_Test() {
		String firstname = "Firstname";
		String lastname = "Lastname";

		homePage.clickSignInBtn();
		logger.info("Clicked Sign in button.");

		signPage.createRandomEmail();
		logger.info("Set new email id.");

		signPage.clickSubmitBtn();
		logger.info("Clicked submit button.");

		registrationPage.selectGender();
		logger.info("select gender from the registration page.");

		registrationPage.setFirstName(firstname);
		logger.info("set first name on the registration page.");

		registrationPage.setLastName(lastname);
		logger.info("set Last name on the registration page.");

		registrationPage.setPasswordName("Qwerty");
		logger.info("set Password name on the registration page.");

		registrationPage.selectDaysFromList("1");
		logger.info("Select the day from drop down list.");

		registrationPage.selectMonthFromList("1");
		logger.info("Select the month from drop down list.");

		registrationPage.selectYearFromList("2000");
		logger.info("Select the year from drop down list.");

		registrationPage.setCompanyValue("Company");
		logger.info("set company name in the registration page.");

		registrationPage.setAddress1Value("Qwerty, 123");
		logger.info("set address in the registration page.");

		registrationPage.setAddress2Value("zxcvb");
		logger.info("set address2 in the registration page.");

		registrationPage.setCityName("Qwerty");
		logger.info("set city name in the registration page.");

		registrationPage.selectStateFromList("Colorado");
		logger.info("select the state from the list in the registration page.");

		registrationPage.setPostCode("12345");
		logger.info("set Post code on the registration page.");

		registrationPage.setOther("Qwerty");
		logger.info("set other details in the registration page.");

		registrationPage.setPhoneNumber("12345123123");
		logger.info("set phone number in the registration page.");

		registrationPage.setMobileNumber("12345123123");
		logger.info("set mobile number in the registration page.");

		registrationPage.setAlias("hf");
		logger.info("set Alias in the registration page.");

		registrationPage.clickSubmitAccountBtn();
		logger.info("Click the submit account button in the registration page.");

		assertThat(myaccount.verifyMyAccountHeading(), is(Boolean.TRUE));
		logger.info("Verified bank page is displayed.");

		assertThat(myaccount.verifyAccountNameHeading(firstname, lastname), is(true));
		logger.info("Verified sort by lable is displayed.");

		assertThat(myaccount.verifyAccountInfoLbl(), is(true));
		logger.info("Verified sort by drop down is displayed");

		assertThat(myaccount.verifyLogoutLbl(), is(true));
		logger.info("Verified sort by drop down is displayed");

		assertThat(myaccount.verifyUrl("controller=my-account"), is(true));
		logger.info("Verified my account page is displayed");
	}

	@Test
	public void Verify_LogIn_Test() {
		String fullName = "Joe Black";

		homePage.clickSignInBtn();
		logger.info("Clicked Sign in button.");

		signPage.setEmailId(testConfig.getProperty("existingUserEmail"));
		logger.info("Set Email id.");

		signPage.setPasswd(testConfig.getProperty("existingUserPassword"));
		logger.info("Set Password id.");

		signPage.clickSubmitLoginBtn();
		logger.info("Clicked submit button.");

		assertThat(myaccount.verifyMyAccountHeading(), is(Boolean.TRUE));
		logger.info("Verified bank page is displayed.");

		assertThat(myaccount.verifyAccountNameHeading(fullName), is(true));
		logger.info("Verified sort by lable is displayed.");

		assertThat(myaccount.verifyAccountInfoLbl(), is(true));
		logger.info("Verified sort by drop down is displayed");

		assertThat(myaccount.verifyLogoutLbl(), is(true));
		logger.info("Verified sort by drop down is displayed");

		assertThat(myaccount.verifyUrl("controller=my-account"), is(true));
		logger.info("Verified my account page is displayed");

	}

	@Test
	public void Verify_CheckOut_Test() {

		homePage.clickSignInBtn();
		logger.info("Clicked Sign in button.");

		signPage.setEmailId(testConfig.getProperty("existingUserEmail"));
		logger.info("Enter the Email id.");

		signPage.setPasswd(testConfig.getProperty("existingUserPassword"));
		logger.info("Enter the Password id.");

		signPage.clickSubmitLoginBtn();
		logger.info("Clicked submit button.");

		itemPage.clickWomenLnk();
		logger.info("Clicked on Women tab link.");

		itemPage.clickItemLnk();
		logger.info("Select the item from the list.");

		itemPage.clickItemLnk();
		logger.info("Select the item from the list.");

		itemPage.clickSubmitBtn();
		logger.info("Click submit button.");

		itemPage.clickCkeckoutItm();
		logger.info("Click on checkout likn.");

		itemPage.clickCartnevigate();
		logger.info("Click and navigate item to card.");

		itemPage.clickProcessAdd();
		logger.info("Click on process to checkout button.");

		itemPage.clickShippingLnk();
		logger.info("Click and Item to be shipped.");

		itemPage.clickCarrierLnk();
		logger.info("Click and move to payment page.");

		itemPage.clickBankWireLnk();
		logger.info("Clicked on pay by bank wire link.");

		itemPage.clickPaymentBtn();
		logger.info("Click on payment button.");

		assertThat(orderSummary.verifyOrderSummaryHeading("ORDER CONFIRMATION"), is(Boolean.TRUE));
		logger.info("Verified order summary page is displayed.");

		assertThat(orderSummary.verifyShippingLbl(), is(true));
		logger.info("Verified shipping lable is displayed.");

		assertThat(orderSummary.verifyPaymentLbl(), is(true));
		logger.info("Verified payment label is  displayed");

		assertThat(orderSummary.verifyOrderConfirmLbl("Your order on My Store is complete."), is(true));
		logger.info("Verified 'Your order on My Store is complete.' message displayed. ");

		assertThat(orderSummary.verifyUrl("controller=order-confirmation"), is(true));
		logger.info("Verified my account page is displayed.");

	}

}
