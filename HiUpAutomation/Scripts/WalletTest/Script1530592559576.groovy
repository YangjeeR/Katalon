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
Mobile.tap(findTestObject('android.widget.CheckedTextView6 - Wallet'), 30)

Mobile.tap(findTestObject('android.widget.Button3 - Documents'), 0)

Mobile.tap(findTestObject('android.widget.Button4 - Certificates'), 0)

Mobile.tap(findTestObject('android.widget.Button2 - Add'), 2)
Thread.sleep(6000);
cert=Mobile.getText(findTestObject('android.widget.TextView4 - Hiup Course'), 0)

Mobile.tap(findTestObject('android.widget.TextView4 - Hiup Course'), 0)


Mobile.tap(findTestObject('android.widget.Button0 - Take photo'), 0)

Mobile.tap(findTestObject('android.widget.Button0'), 0)

Mobile.tap(findTestObject('android.widget.Button2 - Save'), 0)
Thread.sleep(25000);
Mobile.tap(findTestObject('android.widget.Button4 - Certificates'), 3)

title=Mobile.getText(findTestObject('android.widget.TextView1 - Hiup Course'), 0)

if(title.equalsIgnoreCase(cert))
{
	
	System.out.println("New Certificate has been added");
}

else
{
 System.out.println("Unable to add new Certificate");
}
}
catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("Unable test Wallet Menu.");
	System.out.println(e.getMessage());
}

