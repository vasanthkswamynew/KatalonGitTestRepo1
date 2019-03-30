
/*############################################################################################################################################
 * TestCase Name: TC_001_Add_Note
 * Created By: Krishnaswamy
 * Creation Date: 29th Mar 2019
 * Summary: This test case will Add Note
 * Modified By:
 * Modified Date:
 *#############################################################################################################################################
 */

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

//get the value expected title and assign to realtitle variable
String realtitle = GlobalVariable.title

//Get the url from Profile and open in the browser
WebUI.openBrowser(GlobalVariable.url)

//Maximize the browser window
WebUI.maximizeWindow()

//Refresh the page
WebUI.refresh()

//Call the reusable component for highlighting the test object
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('TODO_Note_Page/TC_001_Angular_JS_Homepage_Text'))

//Capture the screenshot
WebUI.takeScreenshot()

//Check for the existance of the test object in webb page
WebUI.verifyElementPresent(findTestObject('TODO_Note_Page/TC_001_Angular_JS_Homepage_Text'), 5)

//get the actual title from browser and assign to variable Actualtitle
String Actualtitle = WebUI.getWindowTitle()

//Verify whether the actual title and realtitle are same or not
if (Actualtitle.equalsIgnoreCase(realtitle)) {
    print(Actualtitle)

    WebUI.verifyMatch(Actualtitle, realtitle, true)

    WebUI.setText(findTestObject('TODO_Note_Page/TC_001_Note_Value'), findTestData('TestData').getValue('First_Note', 1))

    WebUI.takeScreenshot()
} else {
    System.out.println('Page tittle is not matched')
}

WebUI.sendKeys(findTestObject('TODO_Note_Page/TC_001_Note_Value'), Keys.chord(Keys.ENTER))

