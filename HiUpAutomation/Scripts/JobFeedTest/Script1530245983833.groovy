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
import io.appium.java_client.MobileElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement

import org.apache.xmlbeans.impl.store.Locale.domNthCache
import org.openqa.selenium.By

//Job Feed
AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver();
try
{
Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0)//control btn
	
Mobile.tap(findTestObject('android.widget.ImageView18'), 0)//main menu
Mobile.tap(findTestObject('android.support.v7.widget.LinearLayoutCompat0'), 0)//Job Feed Menu

Mobile.tap(findTestObject('android.widget.Button0 - Refine'), 0)

Mobile.tap(findTestObject('android.widget.Button2 - Reset'), 0)
Thread.sleep(15000);
Mobile.tap(findTestObject('android.widget.ImageView0'), 0)//click on first job in the list
Thread.sleep(2000);
MobileElement label_job=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/details_job_label"));
Mobile.tap(findTestObject('android.widget.Button0 - Apply'), 0)
Thread.sleep(5000);

if(Mobile.verifyElementExist(findTestObject('android.widget.TextView3 - Jobs'), 30,FailureHandling.OPTIONAL))
{
	System.out.println("Job has already been applied.");
	Thread.sleep(5000);
	
	int i=2;
	
	while(Mobile.verifyElementExist(findTestObject('android.widget.TextView3 - Jobs'), 20,FailureHandling.OPTIONAL))
	{
  //if still Jobs title is displayed in the screen means selected job has already been applied
	System.out.println("Value of i:" + i);
	Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0)//control btn
	Mobile.tap(findTestObject('android.widget.ImageView18'), 0)//main menu
	Mobile.tap(findTestObject('android.support.v7.widget.LinearLayoutCompat0'), 0)//Job Feed Menu
	Thread.sleep(5000);
	//Mobile.tap(findTestObject("job_list"));
    MobileElement job_list=driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]"));
    //Now second job from the list is clicked as 2 has been send in elementpath
	job_list.click();
	System.out.println("The xpath of job is" + job_list);
	Thread.sleep(2000);
	Mobile.tap(findTestObject('android.widget.Button0 - Apply'), 2);
	i++;
	System.out.println("Value of other i:" + i);
	Thread.sleep(4000);
	if(Mobile.verifyElementNotExist(findTestObject('android.widget.TextView3 - Jobs'), 20,FailureHandling.OPTIONAL))
	{
	Thread.sleep(5000);
	Mobile.setText(findTestObject('android.widget.EditText0 - Tell the recruiter why you are ideal for this role and other any information you may think might useful.'),
	'Hi I want this job.', 4)
	verticalSwipe();
	Thread.sleep(2000);
	Mobile.tap(findTestObject('android.widget.Button0 - Send Application'), 4)
	Thread.sleep(2000);
	
	result= Mobile.getText(findTestObject('android.widget.TextView1 - Your application has been sent'), 4)

    if(result.equalsIgnoreCase("Your application has been sent"))
	{
		System.out.println("Selected Application has been applied.");
		
	}
	else
	{
		System.out.println("Selected Application hasnot been applied.");
	}
 }
	
}
	
}
		

else
{//if first job has not been applied than run code below
Thread.sleep(5000);
Mobile.setText(findTestObject('android.widget.EditText0 - Tell the recruiter why you are ideal for this role and other any information you may think might useful.'),
	'Hi I want this job.', 3)
verticalSwipe();
Mobile.tap(findTestObject('android.widget.Button0 - Send Application'),4)
Thread.sleep(10000);
result= Mobile.getText(findTestObject('android.widget.TextView1 - Your application has been sent'), 4)

if(result.equalsIgnoreCase("Your application has been sent"))
{
System.out.println("Selected Application has been applied.");
}
else
{
System.out.println("Selected Application hasnot been applied.");
}

}

}
catch(Exception e)
{
  System.out.println("Unable to test Job Feed Menu.");
  System.out.println(e.getMessage());
}


public void verticalSwipe() throws InterruptedException {
	
	int width = Mobile.getDeviceWidth();
	int startX = width / 2;
	int endX = startX;
    int startY = width * 0.30;
	int endY = width * 0.70;
	//Swipe Vertical from top to bottom'
	Mobile.swipe(startX, endY, endX, startY)
	
	Thread.sleep(2000);
}