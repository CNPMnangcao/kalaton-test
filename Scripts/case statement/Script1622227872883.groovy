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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('call by other - navigate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 'bindzo')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'E/CcYFz7XEpXgF1OApskzQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), Keys.chord(
        Keys.ENTER))

headerUsername = WebUI.getText(findTestObject('Header/Page_Town Square - myteam Mattermost/headerUsername'))

switch (headerUsername) {
    case '@bindzo':
        WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/span_Off-Topic'))

        WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - myteam Mattermost/textarea_Write to Off-Topic_post_textbox'), 
            '-say hi-')

        WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - myteam Mattermost/textarea_Write to Off-Topic_post_textbox'), 
            Keys.chord(Keys.ENTER))

        break
    case '@usera':
        WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/span_Off-Topic'))

        WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - myteam Mattermost/textarea_Write to Off-Topic_post_textbox'), 
            '-say hello-')

        WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - myteam Mattermost/textarea_Write to Off-Topic_post_textbox'), 
            Keys.chord(Keys.ENTER))

        break
    case '@userb':
        WebUI.click(findTestObject('Object Repository/Page_Town Square - myteam Mattermost/span_Off-Topic'))

        WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - myteam Mattermost/textarea_Write to Off-Topic_post_textbox'), 
            '-say OKe-')

        WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - myteam Mattermost/textarea_Write to Off-Topic_post_textbox'), 
            Keys.chord(Keys.ENTER))

        break
}

WebUI.closeBrowser()

