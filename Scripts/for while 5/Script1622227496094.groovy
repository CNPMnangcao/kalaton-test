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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://immense-taiga-87644.herokuapp.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 'bindzo')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'E/CcYFz7XEpXgF1OApskzQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Change Username/Page_Town Square - myteam Mattermost/span'))

WebUI.click(findTestObject('Object Repository/Change Username/Page_Town Square - myteam Mattermost/button_Account Settings'))

for (int i = 0; i < 4; i++) {
    WebUI.click(findTestObject('Object Repository/Change Username/Page_Town Square - myteam Mattermost/div_bindzo'))

    WebUI.setText(findTestObject('Object Repository/Change Username/Page_Town Square - myteam Mattermost/input_Username_username'), 
        'bindz')

    WebUI.click(findTestObject('Object Repository/Change Username/Page_Town Square - myteam Mattermost/span_Save'))

    WebUI.verifyElementText(findTestObject('Change Username/Page_(2)  Town Square - myteam Mattermost/div_bindz'), 'bindz')

    WebUI.click(findTestObject('Object Repository/Change Username/Page_Town Square - myteam Mattermost/div_bindz'))

    WebUI.setText(findTestObject('Object Repository/Change Username/Page_Town Square - myteam Mattermost/input_Username_username'), 
        'bindzo')

    WebUI.click(findTestObject('Object Repository/Change Username/Page_Town Square - myteam Mattermost/span_Save'))

    WebUI.verifyElementText(findTestObject('Object Repository/Change Username/Page_(2)  Town Square - myteam Mattermost/div_bindzo'), 
        'bindzo')
}

WebUI.callTestCase(findTestCase('call by other - close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

