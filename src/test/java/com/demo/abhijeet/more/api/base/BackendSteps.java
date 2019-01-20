package com.demo.abhijeet.more.api.base;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.abhijeet.more.api.pojo.Results;



public class BackendSteps extends StepsHelper {

	private final Logger logger = LoggerFactory.getLogger(BackendSteps.class);

	public void StartTheBackendTesting() {
		startBackMethods();
		listOfResults = getMethods.getAllTheCountriesnAndReturnInAListOfObjects();
	}

	public void makeACallInTheExclusiveServiceAndReceiveAllTheInformationOfACountry(String someCodeOfCountry) {
		singleCountryInfo = getMethods.getTheJsonAndReturn1Result(someCodeOfCountry);
	}

	public void validateFromTheDataForACountryTheNameInTheExclusiveService(String countryNameToValidate) {
		assertThat(singleCountryInfo.getName().equals(countryNameToValidate), is(true));
		logger.info("Validating data from all the country.");
	}

	public void validateTheCode3InTheExclusiveService(String code3) {
		assertThat(singleCountryInfo.getAlpha3_code().equals(code3), is(true));
		logger.info("Validating alpha code 3 of the country.");
	}

	public void validateFromTheDataForACountryTheName(String countryNameToValidate) {
		assertThat(nameToValidate.equals(countryNameToValidate), is(true));
		logger.info("Validating country name from the response.");
	}

	public void validateTheCode3(String code3) {
		assertThat(alpha3ToValidate.equals(code3), is(true));
		logger.info("Validating country code from the response.");
	}

	public void findTheInformationOfACountryInsideOfTheList(String someCodeOfCountry2) {
		for (Results result : listOfResults) {
			if (result.getAlpha2_code().equals(someCodeOfCountry2)) {
				nameToValidate = result.getName();
				alpha3ToValidate = result.getAlpha3_code();
			}
		}
	}

	public void findTheInformationOfACountryInsideOfTheLissst(String someWrongCode) {
		messageResponse = getMethods.getTheJsonAndReturn1Message(someWrongCode);
	}

	public void negativeTestCase(String errorMessage) {
		assertThat(messageResponse.contains(errorMessage), is(true));
		logger.info("Validating error message from the response.");
	}

	public void makeAPost(String newCountry) {
		postStatusResponse = postMethods.postANewCountry(newCountry);
	}

	public void makeAPoste(String statusCodeToValidate) {
		assertThat(postStatusResponse.equals(statusCodeToValidate), is(true));
		logger.info("Validating post call response.");
	}

}