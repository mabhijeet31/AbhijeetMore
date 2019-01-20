package com.demo.abhijeet.more.selenium.testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.abhijeet.more.api.base.BackendSteps;
import com.demo.abhijeet.more.api.base.ParentScenario;
import com.demo.abhijeet.more.api.base.StepsHelper;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class APITestingScenarioTest extends StepsHelper {

	ParentScenario parentScenario = new ParentScenario();
	BackendSteps backendSteps = new BackendSteps();
	private final Logger logger = LoggerFactory.getLogger(APITestingScenarioTest.class);
	
	@DataProvider
	public static Object[][] listedCountry() {
		return new Object[][] { { "United States of America", "US", "USA" }, { "Germany", "DE", "DEU" },
				{ "United Kingdom of Great Britain and Northern Ireland", "GB", "GBR" } };
	}

	@DataProvider
	public static Object[][] invalidCountry() {
		return new Object[][] { { "U9" }, { "U8" } };
	}

	@Before
	public void init() {
		backendSteps.StartTheBackendTesting();
		logger.info("Precondition called before API testing.");
	}

	@Test
	@UseDataProvider("listedCountry")
	public void getCall_ReceiveTheInformation_AllCountryTest(String country_name,
			String alpha2_code, String alpha3_code) {

		backendSteps.findTheInformationOfACountryInsideOfTheList(alpha2_code);
		logger.info("Veified alpha2 code from the response data.");
		
		backendSteps.validateFromTheDataForACountryTheName(country_name);
		logger.info("Veified country name from the response data.");
		
		backendSteps.validateTheCode3(alpha3_code);
		logger.info("Veified alpha3 code from the response data.");
	}

	@Test  
	@UseDataProvider("listedCountry")
	public void getCall_ReceiveTheInformation_SingleCountryTest(String country_name, String alpha2_code,
			String alpha3_code) {

		backendSteps.makeACallInTheExclusiveServiceAndReceiveAllTheInformationOfACountry(alpha2_code);
		logger.info("Veified alpha2 code from the response data.");
		
		backendSteps.validateFromTheDataForACountryTheNameInTheExclusiveService(country_name);
		logger.info("Veified country name from the response data.");
		
		backendSteps.validateTheCode3InTheExclusiveService(alpha3_code);
		logger.info("Veified alpha3 code from the response data.");
	}

	@Test
	@UseDataProvider("invalidCountry")
	public void getCall_ReceiveTheInformation_NonListedCountryTest(String alpha2_code) {

		backendSteps.findTheInformationOfACountryInsideOfTheLissst(alpha2_code);
		logger.info("Passing invalid alpha2 code from the response data.");
		
		backendSteps.negativeTestCase("No matching country found for requested code");
		logger.info("Verifing error message from the response data.");
	}

	// @Test
	public void validateTheCode4InThePostCall() {

		backendSteps.makeAPost("AR");
		logger.info("Passing country code to Post request.");
		
		backendSteps.makeAPoste("200");
		logger.info("Verifing Http code from the response data.");
	}

}
