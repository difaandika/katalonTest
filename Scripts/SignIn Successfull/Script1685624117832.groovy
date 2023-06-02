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

Mobile.verifyElementVisible(findTestObject('Object Repository/Login2/android.widget.ImageView'), 0)

Mobile.getText(findTestObject('Object Repository/Login2/android.widget.TextView - VERSION - V4'), 0)

Mobile.tap(findTestObject('Object Repository/Login2/android.widget.EditText'), 0)

Mobile.verifyElementVisible(findTestObject(''), 0)

Mobile.setText(findTestObject('Object Repository/Login2/android.widget.EditText (2)'), 'validemail@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/Login2/android.widget.EditText (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login2/android.widget.EditText (4)'), 0)

Mobile.setText(findTestObject(''), 'validpassword', 0)

Mobile.tap(findTestObject('Object Repository/Login2/android.widget.Button - LOGIN'), 0)

Mobile.getText(findTestObject('Object Repository/Login2/android.widget.TextView - Android NewLine Learning'), 0)

Mobile.getText(findTestObject('Object Repository/Login2/android.widget.TextView - Hello,'), 0)

Mobile.getText(findTestObject('Object Repository/Login2/android.widget.TextView - All Accounts'), 0)

Mobile.getText(findTestObject('Object Repository/Login2/android.widget.TextView - Name'), 0)

Mobile.getText(findTestObject('Object Repository/Login2/android.widget.TextView - Email'), 0)

Mobile.getText(findTestObject('Object Repository/Login2/android.widget.TextView - Password'), 0)

Mobile.takeScreenshot('C:\\Users\\MSI-PC\\Downloads\\screenshot.png')

Mobile.closeApplication()

