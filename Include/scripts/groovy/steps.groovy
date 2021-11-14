import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class steps {

	@Given("I open app")
	def I_want_to_write_a_step_with_name(String name) {
		Mobile.callTestCase(findTestCase("Test Cases/Base/Open App"), [:])
	}
	@Then("I close app")
	def close () {
		Mobile.callTestCase(findTestCase("Test Cases/Base/Close App"), [:])
	}

	////

	@When("I select location and save")
	def I_check_for_the_value_in_step() {
		Mobile.callTestCase(findTestCase("Test Cases/Scenario 1 Steps/select loc and save"), [:])
	}

	@And("I select Categories")
	def I_select_Categories() {
		Mobile.callTestCase(findTestCase("Test Cases/Scenario 1 Steps/select Categories"), [:])
	}

	////


	@When("I select SuperFiyat")
	def I_select_SuperFiyat() {
		Mobile.callTestCase(findTestCase("Test Cases/Scenario 2 Steps/SuperFiyat"), [:])
	}

	@And("I add Favorite")
	def I_add_Favorite() {
		Mobile.callTestCase(findTestCase("Test Cases/Scenario 2 Steps/Add Fav"), [:])
	}

	@And('I login with "(.*)" and as a password "(.*)"')
	def I_login(String email,String password) {
		Mobile.callTestCase(findTestCase("Test Cases/Scenario 2 Steps/login"), ["email":email,"password":password])
	}

	@And("I return Favorite")
	def I_return_Favorite() {
		Mobile.callTestCase(findTestCase("Test Cases/Scenario 2 Steps/Return Fav"), [:])
	}

}