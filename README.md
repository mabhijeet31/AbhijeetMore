# Following are the Features implemented,
* Multi browser configuration
* Page object as well as singleton design pattern used.
* Web driver manager plugin used for driver management.
* Surefire Plugin used for report generation.
* Hamcrest plugin used for more code read ability.
* Logging mechanish is implemented
* Implemented for all the browser (including headless browser) and all O.S. in the market..
* Parallel execution of TCs implemented
* Reading test data from property file.
* Also Included API testing scenarios.

#Technology used,
Java 8
Selenium
Maven
Junit(4)
Rest-assured


# Implemented Browsers
* Chrome
* Firefox
* PhantomJS
* Opera


# Pre-requisite: 
* Use below commad to download dependency
===> mvn install -DskipTests=true
* Note: Sometimes get error as "Network not available. Forcing the use of cache"


# How to execute project
1. Execute maven command with headless browser i.e. phantomjs 
===> mvn clean verify -Pbrowser-phantomjs surefire-report:report

2. Execute maven command with chrome browser
===> mvn clean verify -Pbrowser-chrome surefire-report:report
	

# Execution report 
* After execution will get report the in this location "HelloFresh-Assignment-project\target\site". i.e. "surefire-report.html"


# Test cases details:
* Java, Selenium and mvn ==  GUI testing.
* GUITestingScenarioTest ==> All the GUI testing Scenario added in this file
 
* Java, Rest-Assured and mvn == API testing.
* APITestingScenarioTest ==> ALL API testing Scenarios added in this file
