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

WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/path'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/span_Account Settings (1)'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/button_Security'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/span_Edit (3)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/input_Current Password_currentPassword'), 
    currentpassword)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/input_New Password_newPassword'), 
    newpassword)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/input_Retype New Password_confirmPassword'), 
    newpassword)

WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/button_Save (1)'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/span_ (3)'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/button_userb_style--none sidebar-header-dro_852242'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/button_Log Out (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b (15)'), 
    email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6 (15)'), 
    newpassword)

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in (4)'))

