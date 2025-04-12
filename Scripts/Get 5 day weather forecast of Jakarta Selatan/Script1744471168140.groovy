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

response = WS.sendRequest(findTestObject('Get 5 day weather forecast of Jakarta Selatan', [('lat') : '-6.28381815', ('lon') : '106.84287153600738'
            , ('API key') : '8b95b0ebe090b57c70f3120685ce5de2']))

//verifikasi response code 200
WS.verifyResponseStatusCode(response, 200)

//menjumlahkan banyaknya data diambil
jml_data = WS.getElementsCount(response, "")

//verifikasi data terisi
for(int i=0; i< jml_data;i++) {
	dt = WS.getElementPropertyValue(response, "list[" + i + "].dt");
	main = WS.getElementPropertyValue(response, "list[" + i + "].main");
	weather_id = WS.getElementPropertyValue(response, "list[" + i + "].weather[0].id");
	weather_main = WS.getElementPropertyValue(response, "list[" + i + "].weather[0].main");
	clouds = WS.getElementPropertyValue(response, "list[" + i + "].clouds");
	wind = WS.getElementPropertyValue(response, "list[" + i + "].wind");
	txt = WS.getElementPropertyValue(response, "list[" + i + "].dt_txt");
	
		
	assert dt != null && dt != "";
	assert main != null && main != "";
	assert weather_id != null && weather_id != "";
	assert weather_main != null && weather_main != "";
	assert clouds != null && clouds != "";
	assert wind != null && wind != "";
	assert txt != null && txt != "";
}


