import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\MSI-PC\\Downloads\\Sample Android App - Login Tes_4.0_Apkpure.apk', true)

Mobile.verifyElementVisible(findTestObject('Object Repository/FailedLogin/android.widget.ImageView'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/FailedLogin/android.widget.TextView - VERSION - V4'), 'VERSION - V4')

Mobile.tap(findTestObject('Object Repository/FailedLogin/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Login/emailActive'), 'wrongemailformat', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login/TextInputLayout - Password'), 0)

Mobile.setText(findTestObject('Login/passActive'), 'validpassword', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login/android.widget.Button - LOGIN'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/FailedLogin/android.widget.TextView - Enter Valid Email'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/FailedLogin/android.widget.TextView - Enter Valid Email (1)'), 
    'Enter Valid Email')

Mobile.closeApplication()

