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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://rnd.praisindo.com/dev_cloud/ui/OrderManagement/AddNewTransaction')

WebUI.click(findTestObject('Object Repository/New Subscription/Page_Add New Transaction - PraisindoSIARUI/div_Add New Transaction                    _2d84bc'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    'Fransiskus')

WebUI.sendKeys(findTestObject('Object Repository/New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/New Subscription/Page_Add New Transaction - PraisindoSIARUI/button_Subscription'))

