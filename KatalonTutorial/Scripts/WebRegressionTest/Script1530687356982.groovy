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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

for (int i = 1; i <= findTestData('user_details').getRowNumbers(); i++) {
   
	
	user_detail(findTestData('user_details').getValue('Username',i),findTestData('user_details').getValue('Password',i))

    WebUI.click(findTestObject('Page_Execute Automation/input_Login'))

    WebUI.selectOptionByValue(findTestObject('Page_Execute Automation/select_SelectMr.Ms.'), '2', true)

    CustomKeywords.'com.kt.utility.CommonUtility.CheckdropdownlistElementExits'(findTestObject('Page_Execute Automation/select_SelectMr.Ms.'), 
        'Ms.')

    WebUI.setText(findTestObject('Page_Execute Automation/input_Initial'), findTestData('user_details').getValue('Initial', 
            i))

    WebUI.setText(findTestObject('Page_Execute Automation/input_FirstName'), findTestData('user_details').getValue('Firstname', 
            i))

    WebUI.setText(findTestObject('Page_Execute Automation/input_MiddleName'), findTestData('user_details').getValue('Lastname', 
            i))

    WebUI.click(findTestObject('Page_Execute Automation/input_Female'))

    WebUI.click(findTestObject('Page_Execute Automation/input_Save'))

    WebUI.click(findTestObject('Page_Execute Automation/a_HtmlPopup'))

    //switch to popup window
    WebUI.switchToWindowIndex(1)

    WebUI.selectOptionByValue(findTestObject('Page_Popup Window/select_SelectMr.Ms.'), '2', true)

    WebUI.setText(findTestObject('Page_Popup Window/input_Initial'), findTestData('user_details').getValue('Initial', i))

    WebUI.setText(findTestObject('Page_Popup Window/input_FirstName'), findTestData('user_details').getValue('Firstname', 
            i))

    WebUI.setText(findTestObject('Page_Popup Window/input_MiddleName'), 'Rai')

    WebUI.setText(findTestObject('Page_Popup Window/input_LastName'), findTestData('user_details').getValue('Lastname', 
            i))

    //switch back to main window
    WebUI.switchToWindowIndex(0)

    WebUI.click(findTestObject('Page_Execute Automation/input_generate'))


}

def user_detail(def username, def password)
{
	WebUI.setText(findTestObject('Page_Execute Automation/input_UserName'),username)
/*way1
 	myTestObject = new myTestObject('customObject');//creating object property
	myTestObject.addProperty('xpath',ConditionType.EQUALS,'id("userName")/p[1]/input[1]');
	WebUI.setText(myTestObject, 'customUsername');
	*/
	
//Way2
	
	/*myTestObject = new myTestObject('customObject');
	List<TestObjectProperty> properties= new ArrayList<TestObjectPropert>();
	properties.add(new TestObjectProperty('xpath',ConditionType.EQUALS,'id("userName")/p[1]/input[1]'));
	properties.add(new TestObjectProperty('name',ConditionType.EQUALS,'UserName'));
	 
	//set object
	myTestObject.setProperties(properties);
	WebUI.setText(myTestObject, 'FromPropertyObject');*/
	
	WebUI.setText(findTestObject('Page_Execute Automation/input_Password'),password )

}
