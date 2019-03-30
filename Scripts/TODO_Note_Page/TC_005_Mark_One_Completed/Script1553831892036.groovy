/*############################################################################################################################################
 * TestCase Name: TC_005_Mark_One_completed
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
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('TODO_Note_Page/TC_005_First_Check_Box'))

//Click on the test object
WebUI.click(findTestObject('TODO_Note_Page/TC_005_First_Check_Box'), FailureHandling.STOP_ON_FAILURE)

//Capture screenshot
WebUI.takeScreenshot()

//Call the reusable component for highlighting the test object
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('TODO_Note_Page/TC_004_Completed_link'))

//Click on the test object
WebUI.click(findTestObject('TODO_Note_Page/TC_004_Completed_link'), FailureHandling.STOP_ON_FAILURE)

//Capture screenshot
WebUI.takeScreenshot()

//get the text from the dynamic object and stor in the First_Text variable
First_Text = WebUI.getText(findTestObject('TODO_Note_Page/TC_003_Get1st_Text'))

//Print the value of the objectt in console
print(First_Text)

//Write the value of the variable First_Text to excel
CustomKeywords.'com.reusableComponents.WriteExcel.writeToExcel'(1, 3, First_Text)

//Verify whether the expected data and the actual data are matching or not
WebUI.verifyMatch(findTestData('TestData').getValue('First_Note', 1), findTestData('TestData').getValue('First_Text', 1), 
    true)

