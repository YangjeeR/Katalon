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
Mobile.tap(findTestObject('android.widget.CheckedTextView8 - Settings  More'), 0)

Mobile.tap(findTestObject('android.widget.Button4 - Region'), 0)

Mobile.tap(findTestObject('android.widget.EditText0 - GB'), 0)

Mobile.tap(findTestObject('android.widget.TextView7 - US'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Change region'), 0)

title=Mobile.getText(findTestObject('android.widget.TextView0 - Settings'), 0)
if(title.equalsIgnoreCase("Settings"))
{
	System.out.println("Region has been changed.");

}

else
{
	System.out.println("Region hasnot been changed.");
}
}
catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("Unable test Settings Menu.");
	System.out.println(e.getMessage());
}

