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

Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0)//control btn

Mobile.tap(findTestObject('android.widget.ImageView18'), 0)//main menu

Mobile.tap(findTestObject('android.support.v7.widget.LinearLayoutCompat8'), 0)//setting and more

Mobile.tap(findTestObject('android.widget.Button0 - Sign in'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - LOGIN'), 0)

Mobile.tap(findTestObject('android.widget.Button5 - Forgotten password'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Email (1)'), 'jmeter12345@gmail.com', 0)

Mobile.tap(findTestObject('android.widget.Button0 - Reset password'), 0)
Thread.sleep(3000);

if(Mobile.verifyElementExist(findTestObject('android.widget.TextView0 - Email sent'), 10))
{
	System.out.println("Email reset sent");
}

else
{
	System.out.println("Unable to reset password");
}

Mobile.tap(findTestObject('android.widget.Button0 - OK'), 0)



