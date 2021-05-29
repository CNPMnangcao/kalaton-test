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
WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/span_ (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/input_Name_newChannelName (1)'), newChannelName)

WebUI.setText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/textarea_(optional)_newChannelPurpose (1)'), 
    newChannelPurpose)


WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/span_Create Channel (1)'))

WebUI.click(findTestObject('Object Repository/Page_new pv channel - myteam Mattermost/p_This is the start of the new pv channel p_c72bc4'))

