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

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('TODO_Note_Page/TC_005_First_Check_Box'))

WebUI.click(findTestObject('TODO_Note_Page/TC_005_First_Check_Box'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('TODO_Note_Page/TC_004_Completed_link'))

WebUI.click(findTestObject('TODO_Note_Page/TC_004_Completed_link'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

First_Text = WebUI.getText(findTestObject('TODO_Note_Page/TC_003_Get1st_Text'))

print(First_Text)

CustomKeywords.'com.reusableComponents.WriteExcel.writeToExcel'(1, 3, First_Text)

WebUI.verifyMatch(findTestData('TestData').getValue('First_Note', 1), findTestData('TestData').getValue('First_Text', 1), 
    true)
