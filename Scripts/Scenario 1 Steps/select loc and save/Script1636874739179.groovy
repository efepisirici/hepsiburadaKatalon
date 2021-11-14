import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint


Mobile.comment('Story point: navigate location ')

Mobile.tap(findTestObject('Object Repository/Location/Loc'), 10)

Mobile.tap(findTestObject('Object Repository/Location/City'), 10)

Mobile.tap(findTestObject('Object Repository/Location/MyCity'), 10)

Mobile.tap(findTestObject('Object Repository/Location/Country'), 10)

Mobile.tap(findTestObject('Object Repository/Location/FirstCountry'), 10)

Mobile.tap(findTestObject('Object Repository/Location/District'), 10)

Mobile.tap(findTestObject('Object Repository/Location/FirstDistrict'), 10)


Mobile.tap(findTestObject('Object Repository/Location/LocationSaveButton'), 10)
if (Mobile.verifyElementExist(findTestObject('Object Repository/Location/SuccessNotification'), 10)== true)
	{
Mobile.tap(findTestObject('Object Repository/Location/CategoriesButton'), 10)
		
	}
	
	
	