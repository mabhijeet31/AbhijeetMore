package com.demo.abhijeet.more.api.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.abhijeet.more.api.module.GetMethods;
import com.demo.abhijeet.more.api.module.PostMethods;


public class ParentScenario {

	protected static GetMethods getMethods;
	protected static PostMethods postMethods;

	private final Logger logger = LoggerFactory.getLogger(ParentScenario.class);

	public void startBackMethods() {
		logger.info("Starting the conection with the services.");
		getMethods = new GetMethods();
		postMethods = new PostMethods();
	}

}
