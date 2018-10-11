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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebDriver driver;

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://d2uqo6e6erga9j.cloudfront.net/')

WebUI.click(findTestObject('Page_HiUp Admin Panel/div_LOGIN'))
Thread.sleep(4000);

WebUI.setText(findTestObject('Page_HiUp Admin Panel/input_email'), 'admin@hiupapp.com')

WebUI.setText(findTestObject('Page_HiUp Admin Panel/input_password'), 'oRbmS9DS5Dx8jozRg4T0')

WebUI.click(findTestObject('Page_HiUp Admin Panel/span_Log In'))
WebUI.click(findTestObject('Page_HiUp Admin Panel/div_Courses'))

for(int row=1;row<= findTestData('course_details').getRowNumbers();row++)
{

WebUI.click(findTestObject('Page_HiUp Admin Panel/span_Create'))
Thread.sleep(3000);

WebUI.setText(findTestObject("Page_HiUp Admin Panel/input_name"), findTestData('course_details').getValue('CourseName', row))

WebUI.setText(findTestObject('Page_HiUp Admin Panel/certificate'), findTestData('course_details').getValue('CertificateName', row))

WebUI.setText(findTestObject('Page_HiUp Admin Panel/short_desc'),findTestData('course_details').getValue('ShortDesc', row))

WebUI.setText(findTestObject('Page_HiUp Admin Panel/long_desc'), findTestData('course_details').getValue('LongDesc', row))

WebUI.setText(findTestObject('Page_HiUp Admin Panel/height'), findTestData('course_details').getValue('Height', row))
WebUI.setText(findTestObject('Page_HiUp Admin Panel/width'), findTestData('course_details').getValue('Width', row))
WebUI.scrollToElement(findTestObject('Page_HiUp Admin Panel/input_expiry_months'),5)
WebUI.setText(findTestObject('Page_HiUp Admin Panel/input_expiry_months'), findTestData('course_details').getValue('ExpiryMonth', row))

WebUI.setText(findTestObject('Page_HiUp Admin Panel/input_gbp_price'), findTestData('course_details').getValue('GBP', row))

WebUI.setText(findTestObject('Page_HiUp Admin Panel/input_usd_price'), findTestData('course_details').getValue('USD', row))
WebUI.setText(findTestObject('Page_HiUp Admin Panel/input_eur_price'), findTestData('course_details').getValue('EUR', row))
WebUI.click(findTestObject('Page_HiUp Admin Panel/Page_HiUp Admin Panel (1)/mobile_enable'))

//WebUI.scrollToElement(findTestObject('Page_HiUp Admin Panel/Page_HiUp Admin Panel/imageupload'),4)
 //uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
Thread.sleep(4000);
// enter the file path onto the file-selection input field
//uploadElement.sendKeys("C:\\Users\\Acer\\Desktop\\dresscode\\resources\\images\\arrow3.png");
//WebUI.uploadFile(findTestObject('Page_HiUp Admin Panel/Page_HiUp Admin Panel/imageupload'),findTestData("course_details").getValue('ImagePath',row), FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('Page_HiUp Admin Panel/indus'),5)
WebUI.click(findTestObject('Page_HiUp Admin Panel/indus'))

//WebUI.click(findTestObject('Page_HiUp Admin Panel/p_Drop a file to upload or cli'))

WebUI.click(findTestObject('Page_HiUp Admin Panel/span_Save'))
Thread.sleep(2000)
}

WebUI.closeBrowser()
/*
public def verticalSwipe() throws InterruptedException {
	
	int width = WebUI.getPageWidth();
	int startX = width / 2;
	int endX = startX;
	int startY = width * 0.30;
	int endY = width * 0.70;
	//Swipe Vertical from top to bottom'
	WebUI.scrollToPosition(startX, startY);
	
	Thread.sleep(2000);
}*/