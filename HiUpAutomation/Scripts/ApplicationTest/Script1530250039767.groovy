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

try {
Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0)//control btn

Mobile.tap(findTestObject('android.widget.ImageView18'), 0)//main menu
Mobile.tap(findTestObject('android.widget.CheckedTextView2 - Applications'), 2)

Mobile.tap(findTestObject('android.widget.TextView1 - Applications'), 3)

Mobile.tap(findTestObject('android.widget.Button0 - View'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - View (1)'), 0)
result = Mobile.getText(findTestObject('android.widget.TextView0 - Job page (2)'),0);
	
	if(result.equalsIgnoreCase("Job Page"))
		{
			System.out.println("Application successfully opened");	
		}

	else
		{
			System.out.println("Fail to open application");
		}
Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0)//control btn
		
Mobile.tap(findTestObject('android.widget.ImageView18'), 0)//main menu
Mobile.tap(findTestObject('android.widget.CheckedTextView2 - Applications'), 0)
Mobile.tap(findTestObject('android.widget.TextView2 - Interviews'), 0)

Mobile.tap(findTestObject('android.widget.TextView3 - Offers'), 0)


}

catch(Exception e)
{
	System.out.println("Unable to test application.");
		System.out.println(e.getMessage());
}
