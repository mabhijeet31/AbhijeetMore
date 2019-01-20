package com.demo.abhijeet.more.selenium.driver;

import com.demo.abhijeet.more.selenium.configurations.TypedProperties;

/***
 * 
 * @author Abhijeet More
 *
 */
public class WebDriverConfig {
	private final TypedProperties typedProperties = new TypedProperties("/driver_config.properties");

	String getBrowserName() {
        return typedProperties.getValue("browser.name");
	}

	int getImplicitlyWait() {
        return typedProperties.getInt("implicitly_wait");
	}

	int getDomMaxScriptRunTime() {
        return typedProperties.getInt("dom.max_script_run_time");
	}
}
