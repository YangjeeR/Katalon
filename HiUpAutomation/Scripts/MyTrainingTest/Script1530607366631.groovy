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

 //My training Menu
	try {

	
	 Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0)//control btn
	 
	 Mobile.tap(findTestObject('android.widget.ImageView18'), 0)//main menu
	 Mobile.tap(findTestObject('android.widget.CheckedTextView5 - My training'), 0)
	 // course= Mobile.getText(findTestObject('co.olivemedia.hihoandroidwebapp:id/rl_training_specific_course'),3);
	 title=Mobile.getText(findTestObject('android.widget.TextView0 - My training (2)'),3);
	 if(title.equalsIgnoreCase('My Training'))
	 {
		System.out.println("Training enrolled has been added in My training")
	 }
	 else
	 {
		 System.out.println("Training enrolled hasnot been added in My training")
	 }
	}
	catch(Exception e)
	{
		System.out.println("Unable to test my training");
		System.out.println(e.getMessage());
	}
	


