import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
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

try
{
Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0)//control btn
Mobile.tap(findTestObject('android.widget.ImageView18'), 0)//main menu
Mobile.tap(findTestObject('android.widget.CheckedTextView1 - Job search settings'), 0)
Thread.sleep(3000);
//location
Mobile.setText(findTestObject('android.widget.EditText0 - Area or ZIP code'), '44600', 0)

Mobile.tap(findTestObject('android.widget.Button0 - Refine (1)'), 0)
Thread.sleep(3000);
title= Mobile.getText(findTestObject("android.widget.TextView1 - Jobs (2)"),4);
if(title.equalsIgnoreCase("Jobs"))
{
	System.out.println("Location tab has been clicked.");
}

else
{
	System.out.println("Unable to test location tab");
}

}
catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("Unable test Job Search location Menu.");
	System.out.println(e.getMessage());
}

//Job tab
try
{
Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0)//control btn
Mobile.tap(findTestObject('android.widget.ImageView18'), 0)//main menu
Mobile.tap(findTestObject('android.widget.CheckedTextView1 - Job search settings'), 2)
Mobile.tap(findTestObject('android.widget.Button6 - Job'),2);
Mobile.tap(findTestObject('android.widget.TextView22 - Industry'), 5)

Mobile.tap(findTestObject('android.widget.TextView8 - QA testing1'), 5)

Mobile.tap(findTestObject('android.widget.Button4 - Role'), 5)

Mobile.tap(findTestObject('android.widget.TextView11 - Qa testing role'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Refine (1)'), 0)
Thread.sleep(3000);

role=Mobile.getText(findTestObject('QA_job_list'),5);
if(role.contains("Qa testing"))
{
	System.out.println("Selected role job has been displayed.");
}

else
{
	System.out.println("Unable to search job by industry.");
}
}
catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("Unable test Job Search Job Menu.");
	System.out.println(e.getMessage());
}

//Pay tab
try
{
	Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0)//control btn
	Mobile.tap(findTestObject('android.widget.ImageView18'), 0)//main menu
	Mobile.tap(findTestObject('android.widget.CheckedTextView1 - Job search settings'), 0)
Mobile.tap(findTestObject('android.widget.Button6 - Pay'), 0)

Mobile.tap(findTestObject('android.widget.CheckBox0'), 0)
Thread.sleep(3000);

title= Mobile.getText(findTestObject("android.widget.TextView1 - Jobs (2)"),5);
if(title.equalsIgnoreCase("Jobs"))
{
	System.out.println("Pay tab has been clicked.");
}

else
{
	System.out.println("Unable to test Pay tab");
}

}

catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("Unable test Job Search Pay  Menu.");
	System.out.println(e.getMessage());
}


