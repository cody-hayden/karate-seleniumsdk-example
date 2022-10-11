
Feature: Karate browser automation 

  Background:
  	* def getEyes = Java.type('karatetest.eyesSelenium')
  
  Scenario: google search
	  	  
	  * def eyesWrap = new getEyes()	  
    And eyesWrap.getUrl('https://google.com')
	And eyesWrap.openEyes(karate.info.scenarioName,karate.info.featureFileName,0,0)
    And eyesWrap.inputByCss('.gLFyf', 'applitools')
    And eyesWrap.clickByCss('.FPdoLc > center:nth-child(1) > input:nth-child(1)')
    Then eyesWrap.checkEyes()
    
    * eyesWrap.closeEyes()
    * eyesWrap.quitDriver()
    