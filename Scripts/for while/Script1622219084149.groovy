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

for (int i = 0; i < 5; i++) {
    WebUI.navigateToUrl('https://immense-taiga-87644.herokuapp.com/myteam/channels/off-topic')

    WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
        'bindzo')

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
        'E/CcYFz7XEpXgF1OApskzQ==')

    WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

    WebUI.click(findTestObject('Object Repository/Page_Off-Topic - myteam Mattermost/button_bindzo_style--none sidebar-header-dr_85ff92'))

    WebUI.click(findTestObject('Object Repository/Page_Off-Topic - myteam Mattermost/button_Log Out'))

    WebUI.verifyElementText(findTestObject('Login Page/Page_Mattermost/h1_Mattermost'), 'Mattermost')
}

WebUI.callTestCase(findTestCase('call by other - close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

