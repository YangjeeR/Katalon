import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://executeautomation.com/demosite/Login.html')

WebUI.setText(findTestObject('Page_Execute Automation (1)/input_UserName'), 'admin')

WebUI.setText(findTestObject('Page_Execute Automation (1)/input_Password'), 'admin')

WebUI.click(findTestObject('Page_Execute Automation (1)/input_Login'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Execute Automation (1)/Page_Execute Automation/a_Automation Tools'))
WebUI.mouseOver(findTestObject('Object Repository/Page_Execute Automation (1)/Page_Execute Automation/span_Selenium'))
WebUI.click(findTestObject('Object Repository/Page_Execute Automation (1)/Page_Execute Automation/span_Selenium IDE'))

WebUI.click(findTestObject('Page_Execute Automation (1)/input_Accept'))

rejectbutton = WebUI.modifyObjectProperty(findTestObject('Page_Execute Automation (1)/input_Accept'),'name','equals', 'reject', true)
WebUI.click(rejectbutton);

WebUI.click(findTestObject('Page_Execute Automation (1)/Page_Execute Automation (1)/span_Drag and Drop'))
WebUI.dragAndDropToObject(findTestObject('Page_Execute Automation (1)/Page_/li_Drag Item 5'), findTestObject('Page_Execute Automation (1)/Page_/Page_/li_Drag Item 3'))


WebUI.closeBrowser()
