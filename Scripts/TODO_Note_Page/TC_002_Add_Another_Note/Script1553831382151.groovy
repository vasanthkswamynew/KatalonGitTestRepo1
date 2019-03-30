/*############################################################################################################################################
 * TestCase Name: TC_002_Add_Another_Note
 * Created By: Krishnaswamy
 * Creation Date: 29th Mar 2019
 * Summary: This test case will Add another Note
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

//Get the value of second note from datafiles and enter in webpage
WebUI.setText(findTestObject('TODO_Note_Page/TC_001_Note_Value'), findTestData('TestData').getValue('Second_Note', 1))

//Capture the screenshot
WebUI.takeScreenshot()

//Wait for the test object
WebUI.waitForElementPresent(findTestObject('TODO_Note_Page/TC_001_Note_Value'), 5)

//Click the test object
WebUI.click(findTestObject('TODO_Note_Page/TC_001_Note_Value'))

//Call the reusable component for highlighting the test object
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('TODO_Note_Page/TC_001_Note_Value'))

WebUI.sendKeys(findTestObject('TODO_Note_Page/TC_001_Note_Value'), Keys.chord(Keys.ENTER))

