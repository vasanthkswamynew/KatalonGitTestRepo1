import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String realtitle = 'AngularJS • TodoMVC'

WebUI.openBrowser('http://todomvc.com/examples/angularjs/#/')

WebUI.maximizeWindow()

WebUI.refresh()

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('TODO_Note_Page/TC_001_Angular_JS_Homepage_Text'))

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('TODO_Note_Page/TC_001_Angular_JS_Homepage_Text'), 5)

String Actualtitle = WebUI.getWindowTitle()

if (Actualtitle.equalsIgnoreCase(realtitle)) {
    print(Actualtitle)

    WebUI.verifyMatch(Actualtitle, realtitle, true)

    WebUI.setText(findTestObject('TODO_Note_Page/TC_001_Note_Value'), findTestData('TestData').getValue('First_Note', 1))

    WebUI.takeScreenshot()
} else {
    System.out.println('Page tittle is not matched')
}

WebUI.sendKeys(findTestObject('TODO_Note_Page/TC_001_Note_Value'), Keys.chord(Keys.ENTER))

