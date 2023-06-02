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

Mobile.tap(findTestObject('Object Repository/FailedRegister/android.widget.EditText - Name'), 0)

Mobile.setText(findTestObject('Object Repository/FailedRegister/android.widget.EditText - Name (1)'), 'name', 0)

Mobile.tap(findTestObject('Object Repository/FailedRegister/android.widget.EditText - wrongemailformat'), 0)

Mobile.setText(findTestObject('Object Repository/FailedRegister/android.widget.EditText - wrongemailformat (1)'), 'validemail@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/FailedRegister/android.widget.EditText (3)'), 0)

Mobile.setText(findTestObject('Object Repository/FailedRegister/android.widget.EditText (4)'), 'password1', 0)

Mobile.tap(findTestObject('Object Repository/FailedRegister/android.widget.EditText (5)'), 0)

Mobile.setText(findTestObject('Object Repository/FailedRegister/android.widget.EditText (6)'), 'password2', 0)

Mobile.tap(findTestObject('Object Repository/FailedRegister/android.widget.Button - REGISTER (2)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/FailedRegister/android.widget.TextView - Password Does Not Matches'), 
    0)

Mobile.verifyElementText(findTestObject(''), 'Password Does Not Matches')

Mobile.closeApplication()

