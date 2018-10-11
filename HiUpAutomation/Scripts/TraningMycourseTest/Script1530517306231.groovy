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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.openqa.selenium.By



AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

try{
Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0)//control btn
	
Mobile.tap(findTestObject('android.widget.ImageView18'), 0)//main menu
Mobile.tap(findTestObject('android.support.v7.widget.LinearLayoutCompat4'), 0)//Training
Mobile.tap(findTestObject('android.widget.Button1 - My courses'), 0);
Thread.sleep(2000);
		MobileElement title=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/tv_title_layout_user_training_course_purchase"));
		String text=title.getText();
		if(text.equals("My training"))
		{
			System.out.println("My courses list has been opened.");
		}
		else
		{
			System.out.println("My course list not open.");
		}

     }
    catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Unable open my course menu.");
		System.out.println(e.getMessage());
	}
