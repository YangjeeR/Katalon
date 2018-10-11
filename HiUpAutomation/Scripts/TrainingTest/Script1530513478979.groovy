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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileElement as MobileElement
import org.openqa.selenium.By as By

AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

try {
    /*//Identify all the elements on web page
		List<MobileElement> allElements = driver.findElements(By.id("co.olivemedia.hihoandroidwebapp:id/rl_training_specific_course"));
   
		//Count the total all element on web page
		int linkListCount = allElements.size();
*/
for(int i=1;i<=2;i++)

{
Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0 )

Mobile.tap(findTestObject('android.widget.ImageView18'), 0)

Mobile.tap(findTestObject('android.support.v7.widget.LinearLayoutCompat4'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Courses by industry'), 0)

Thread.sleep(4000)

Mobile.tap(findTestObject('indust'), 0)
if(i==4)
{
	verticalSwipe();
}
Thread.sleep(4000);

    MobileElement sel_course = driver.findElement(By.xpath(('//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[' + 
            i) + ']/android.widget.RelativeLayout[1]'))
    price = sel_course.findElement(By.id('co.olivemedia.hihoandroidwebapp:id/tv_training_specific_course_price')).getText()

    row_course = sel_course.findElement(By.id('co.olivemedia.hihoandroidwebapp:id/rl_training_specific_course')).getText()

    if (price.equalsIgnoreCase('Free')) {
        sel_course.click()

        Thread.sleep(4000)

        Mobile.tap(findTestObject('android.widget.Button0 - Enroll'), 3)

        Thread.sleep(7000)
			  if(Mobile.verifyElementExist(findTestObject('android.widget.Button0 - Enroll'),20,FailureHandling.OPTIONAL))
			  {	
				  System.out.println("Course has already been purchased.");
				    
			  }
			  else
			  {
						
                String text = driver.findElement('android.widget.TextView1 - Thank you for your purchase').getText()

                if (text.equalsIgnoreCase('Thank you for your purchase')) 
				{
                    System.out.println('Course has been successfully purchased.')

                    Mobile.tap(findTestObject('android.widget.Button1 - Back to training (1)'), 0)
                } else 
				{
                    System.out.println('Course hasnot been purchased.')
                }
				break;
			  }
		
        
       } 
	else {
        sel_course.click()

        Mobile.tap(findTestObject('android.widget.Button0 - Purchase course'), 0)

        Mobile.tap(findTestObject('android.widget.Button0 - Proceed to payment'), 0)

        Mobile.setText(findTestObject('android.widget.EditText0 - Card number'), '4242424242424242', 0)

        Mobile.tap(findTestObject('android.widget.TextView4 - MMYYYY'), 0)

        Mobile.tap(findTestObject('month_card'), 0)

        Mobile.tap(findTestObject('year_card'), 0)
		Mobile.hideKeyboard();

        Mobile.tap(findTestObject('android.widget.Button5 - OK'), 0)

        Mobile.setText(findTestObject('android.widget.EditText1 - CVV'),'123', 0)

        Mobile.tap(findTestObject('android.widget.Button0 - Pay securely'), 0)

        Thread.sleep(10000)

        if (Mobile.verifyElementExist(findTestObject('android.widget.Button0 - Pay securely'),20,FailureHandling.OPTIONAL)) {
            System.out.println('Course has already been purchased.')//
        }
         else {
            String text = Mobile.getText(findTestObject('android.widget.TextView1 - Thank you for your purchase (1)'), 2)

            if (text.equalsIgnoreCase('Thank you for your purchase')) 
			{
                System.out.println('Course has been successfully purchased.')

                Mobile.tap(findTestObject('android.widget.Button1 - Back to training (1)'), 2)
            } 
			else 
			{
                System.out.println('Course hasnot been purchased.')
            }
			break;
        }
	}
}

}
catch (Exception e) {
    System.out.println('Unable to apply training course')

    System.out.println(e.getMessage())
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
