import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC015 - login success - string data'), [:])
WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/span_surveybot'))

WebUI.setText(findTestObject('Page_surveybot - myteam Mattermost/textarea_Write to surveybot_post_textbox'), 'h')

WebUI.setText(findTestObject('Page_surveybot - myteam Mattermost/textarea_h'), 'he')

WebUI.setText(findTestObject('Page_surveybot - myteam Mattermost/textarea_he'), 'hel')

WebUI.setText(findTestObject('Page_surveybot - myteam Mattermost/textarea_hel'), 'hell')

WebUI.setText(findTestObject('Page_surveybot - myteam Mattermost/textarea_hell'), 'hello')

WebUI.click(findTestObject('Page_surveybot - myteam Mattermost/button_Cancel'))

WebUI.click(findTestObject('Page_surveybot - myteam Mattermost/span_bindzo'))

WebUI.setText(findTestObject('Object Repository/Page_bindzo - myteam Mattermost/textarea_Write to bindzo_post_textbox'), 
    'h')

WebUI.setText(findTestObject('Object Repository/Page_bindzo - myteam Mattermost/textarea_h'), 'he')

WebUI.setText(findTestObject('Object Repository/Page_bindzo - myteam Mattermost/textarea_he'), 'hel')

WebUI.setText(findTestObject('Object Repository/Page_bindzo - myteam Mattermost/textarea_hel'), 'hell')

WebUI.setText(findTestObject('Object Repository/Page_bindzo - myteam Mattermost/textarea_hell'), 'hello')

WebUI.setText(findTestObject('Object Repository/Page_bindzo - myteam Mattermost/textarea_hello'), 'hello ')

