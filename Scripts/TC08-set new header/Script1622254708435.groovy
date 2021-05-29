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

WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/button_Set a Header'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_Edit the Channel Header_edit_textbox'), 
    'n')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_n'), 'ne')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_ne'), 'new')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_new'), 'new ')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_new_1'), 'new h')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_new h'), 'new he')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_new he'), 'new hea')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_new hea'), 'new head')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_new head'), 'new heade')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_new heade'), 'new header')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_new header'), 'new header0')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_new header0'), 'new header01')

WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/div_new header01new header01'))

