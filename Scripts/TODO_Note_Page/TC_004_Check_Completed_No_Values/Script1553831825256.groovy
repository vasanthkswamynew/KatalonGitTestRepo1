/*############################################################################################################################################
 * TestCase Name: TC_004_Check_Completed_No_Values
 * Created By: Krishnaswamy
 * Creation Date: 29th Mar 2019
 * Summary: 
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

//Call the reusable component for highlighting the test object
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('TODO_Note_Page/TC_004_Completed_link'))

//Click on the test object
WebUI.click(findTestObject('TODO_Note_Page/TC_004_Completed_link'), FailureHandling.STOP_ON_FAILURE)

//Capture screenshot
WebUI.takeScreenshot()

//Check for the existance of the test object in webb page
WebUI.verifyElementNotPresent(findTestObject('TODO_Note_Page/TC_003_Get1st_Text'), 5)

//Check for the existance of the test object in webb page
WebUI.verifyElementNotPresent(findTestObject('TODO_Note_Page/TC_003_GetSecond_Text'), 5)

