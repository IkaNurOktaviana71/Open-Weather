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

response = WS.sendRequest(findTestObject('Get current air pollution of Jakarta Selatan', [('lat') : '-6.28381815', ('lon') : '106.80486325728526'
            , ('API key') : '8b95b0ebe090b57c70f3120685ce5de2']))

//verifikasi respon yang diterima
WS.verifyResponseStatusCode(response, 200)

//verifikasi data lain tidak kosong atau null
aqi = WS.getElementPropertyValue(response, "list[0].main.aqi");
component = WS.getElementPropertyValue(response, "list[0].components");
dt = WS.getElementPropertyValue(response, "list[0].dt");

assert aqi != null && aqi !="";
assert component != null && component !="";
assert dt != null && dt!="";
