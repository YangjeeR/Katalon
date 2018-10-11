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
    Mobile.startApplication('C:\\Users\\Acer\\Desktop\\HiUp_uat_apk\\hiup23.apk', true)

    Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0 //control btn
        )

    Mobile.tap(findTestObject('android.widget.ImageView18'), 0 //main menu
        )

    Mobile.tap(findTestObject('android.support.v7.widget.LinearLayoutCompat8'), 0 //setting and more
        )

    Mobile.tap(findTestObject('android.widget.Button0 - Sign in'), 0)

    Mobile.tap(findTestObject('android.widget.Button2 - SIGN UP'), 0)

    email = 'yangjee123456@hiupapp.com'

    Mobile.setText(findTestObject('android.widget.EditText0 - Email address'), findTestData('HiUpNewUser').getValue('Email address', 
            1), 0)

    Mobile.setText(findTestObject('android.widget.EditText1 - Confirm email address'), findTestData('HiUpNewUser').getValue(
            'Confirm Email address', 1), 0)

    Mobile.setText(findTestObject('android.widget.EditText2 - First name'), findTestData('HiUpNewUser').getValue('Firstname', 
            1), 0)

    Mobile.setText(findTestObject('android.widget.EditText3 - Last name'), findTestData('HiUpNewUser').getValue('Lastname', 
            1), 0)

    Mobile.setText(findTestObject('android.widget.EditText4 - Password'), findTestData('HiUpNewUser').getValue('Password', 
            1), 0)

    Mobile.setText(findTestObject('android.widget.EditText5 - Confirm password'), findTestData('HiUpNewUser').getValue('Confirm password', 
            1), 0)

    verticalSwipe()

    Thread.sleep(2000)

    Mobile.tap(findTestObject('android.widget.CheckBox0 (1)'), 0)

    Mobile.tap(findTestObject('android.widget.Button0 - Continue'), 2)

    Thread.sleep(30000)

    Mobile.setText(findTestObject('android.widget.EditText0 - CC'), findTestData('HiUpNewUser').getValue('CountryCode', 1),0)

    Mobile.setText(findTestObject('android.widget.EditText1 - Mobile number'), findTestData('HiUpNewUser').getValue('Mobile', 1),0)

    Mobile.tap(findTestObject('android.widget.Button0 - Finish'), 2)

    Thread.sleep(5000)

    Mobile.tap(findTestObject('android.widget.LinearLayout22'), 0 //control btn
        )

    Mobile.tap(findTestObject('android.widget.ImageView18'), 0 //main menu
        )

    Mobile.tap(findTestObject('android.widget.CheckedTextView3 - Profile'), 0 //profile menu
        )

    Thread.sleep(5000)

    result = Mobile.getText(findTestObject('Prof_email'), 0)

    //System.out.println(result);
    if (result.equalsIgnoreCase(email)) //check if profile email address with entered email address
    {
        System.out.println('Successfully created new member')
    } else {
        System.out.println('Signup failed')
    }
    
    Mobile.tap(findTestObject('android.widget.Button0 - Edit'), 0)

    Mobile.setText(findTestObject('android.widget.EditText0 - Title'), findTestData('HiUpNewUser').getValue('Title', 1), 
        0)

    Mobile.setText(findTestObject('android.widget.EditText5 - Tell prospective employers about your educational qualifications and a little about yourself - hobbies and interests'), 
        findTestData('HiUpNewUser').getValue('About', 1), 0)

    Mobile.tap(findTestObject('android.widget.Button1 - Save'), 0)
}
catch (Exception e) {
    System.out.println('Unable to sign up')

    System.out.println(e.getMessage())
} 
//Swipe Vertical from top to bottom'

void verticalSwipe() throws InterruptedException {
    int width = Mobile.getDeviceWidth()

    int startX = width / 2

    int endX = startX

    int startY = width * 0.30

    int endY = width * 0.70

    Mobile.swipe(startX, endY, endX, startY)

    Thread.sleep(2000)
}

