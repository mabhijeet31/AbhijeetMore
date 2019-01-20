package com.demo.abhijeet.more.api.base;

import java.util.ArrayList;
import java.util.List;

import com.demo.abhijeet.more.api.pojo.Results;
import com.jayway.restassured.response.ValidatableResponse;

public abstract class StepsHelper extends ParentScenario {

	protected List<Results> listOfResults = new ArrayList<Results>();
	protected String nameToValidate = null;
	protected String alpha2ToValidate = null;
	protected String alpha3ToValidate = null;
	protected Results singleCountryInfo;
	protected String messageResponse;
	protected ValidatableResponse postStatusResponse;

}
