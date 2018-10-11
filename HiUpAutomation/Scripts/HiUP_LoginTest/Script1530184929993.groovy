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
	email="jmeter345@gmail.com";
	pass="y@nzEE2018";

	Mobile.startApplication('C:\\Users\\Acer\\Desktop\\HiUp_uat_apk\\hiup23.apk', true)

	Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0)//control btn

	Mobile.tap(findTestObject('android.widget.ImageView18'), 0)//main menu

	Mobile.tap(findTestObject('android.support.v7.widget.LinearLayoutCompat8'), 0)//setting and more

	Mobile.tap(findTestObject('android.widget.Button0 - Sign in'), 0)

	Mobile.tap(findTestObject('android.widget.Button1 - LOGIN'), 0) 

	Mobile.setText(findTestObject('android.widget.EditText0 - Email'), email, 0)

	Mobile.setText(findTestObject('android.widget.EditText1 - Password'), pass, 0)

	Mobile.tap(findTestObject('android.widget.Button6 - Sign in'), 0)

	Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0)//control btn

	Mobile.tap(findTestObject('android.widget.ImageView18'), 0)//main menu

	Mobile.tap(findTestObject('android.widget.CheckedTextView3 - Profile'), 0)//profile menu
	Thread.sleep(5000);
	result = Mobile.getText(findTestObject('Prof_email'),0);
	System.out.println(result);
		//'android.widget.TextView4 - jmeter12345gmail.com'))
	if(result.equalsIgnoreCase(email))//check if profile email address with entered email address
		{
			System.out.println("Successfully logged in");	
		}

	else
		{
			System.out.println("Login failed");
		}

}

 catch(Exception e) 
  {
	System.out.println("Unable to login");
	System.out.println(e.getMessage());
  }

 
