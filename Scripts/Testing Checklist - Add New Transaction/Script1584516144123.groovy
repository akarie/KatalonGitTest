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

WebUI.navigateToUrl('http://192.168.26.36/dev_cloud/ui/OrderManagement/AddNewTransaction')

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Text').getValue(5, 1))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Text').getValue(5, 2))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Text').getValue(5, 3))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Text').getValue(5, 4))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Text').getValue(5, 5))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.delay(5)

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 1))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 2))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 3))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 4))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 5))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 6))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 7))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 8))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 9))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 10))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 11))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 12))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 13))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 14))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Security').getValue(5, 15))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    findTestData('DataTesting_TestingChecklist/Mandatory').getValue(5, 3))

WebUI.click(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'))

