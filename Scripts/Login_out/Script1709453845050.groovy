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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.login.Login_out

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

HashMap containerHashMap = new HashMap()
Login_out lo = new Login_out()

try {
	containerHashMap.put("TD_ID", TD_ID)
	containerHashMap.put("username", username)
	containerHashMap.put("password", password)
	containerHashMap.put("TYPE_TESTCASE", TYPE_TESTCASE)
	containerHashMap.put("TEST_CASE", TEST_CASE)
	containerHashMap.put("EXPECTED_RESULT", EXPECTED_RESULT)
	
	lo.loginTest(containerHashMap)
	lo.loginValidation(containerHashMap)
} catch (Exception e) {
	KeywordUtil.markFailed(e.getMessage())
}