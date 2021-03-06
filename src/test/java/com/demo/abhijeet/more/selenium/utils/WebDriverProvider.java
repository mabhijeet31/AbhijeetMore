package com.demo.abhijeet.more.selenium.utils;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;

import com.demo.abhijeet.more.selenium.driver.WebDriverBuilder;
import com.demo.abhijeet.more.selenium.driver.WebDriverConfig;

public class WebDriverProvider extends TestWatcher {
	private final WebDriverBuilder webDriverBuilder;
	private WebDriver driver;

	public WebDriverProvider(final WebDriverConfig webDriverConfig) {
		this.webDriverBuilder = new WebDriverBuilder(webDriverConfig);
	}

	public WebDriver getDriver() {
		if (driver == null) {
			driver = webDriverBuilder.toWebDriver();
		}
		return driver;
	}

	public boolean existsDriver() {
		return driver != null;
	}

	@Override
	protected void starting(final Description description) {
		String methodName = description.getClassName() + "." + description.getMethodName();
		this.webDriverBuilder.setName(methodName);
	}

	@Override
	protected void finished(final Description description) {
		if (this.driver != null) {
			this.driver.quit();
		}
	}
}
