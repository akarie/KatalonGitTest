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

WebUI.click(findTestObject('Object Repository/New Subscription/Page_Add New Transaction - PraisindoSIARUI/div_Add New Transaction                    _2d84bc'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    'Fransiskus')

WebUI.sendKeys(findTestObject('Object Repository/New Subscription/Page_Add New Transaction - PraisindoSIARUI/input_Customer_cusCustomer'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/New Subscription/Page_Add New Transaction - PraisindoSIARUI/button_Subscription'))

WebUI.setText(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/input_Reference No_RefNo'), 
    findTestData('DataTesting_TestingChecklist/Code').getValue(5, 1))

WebUI.setText(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/input_Reference No_RefNo'), 
    findTestData('DataTesting_TestingChecklist/Code').getValue(5, 2))

WebUI.setText(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/input_Reference No_RefNo'), 
    findTestData('DataTesting_TestingChecklist/Code').getValue(5, 3))

WebUI.setText(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/input_Reference No_RefNo'), 
    findTestData('DataTesting_TestingChecklist/Code').getValue(5, 4))

WebUI.setText(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/input_Reference No_RefNo'), 
    findTestData('DataTesting_TestingChecklist/Code').getValue(5, 5))

WebUI.click(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/div_Investment Account                     _c7457b'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_New Account 11290000233729 584 REGUL_4f48bc'), 
    'New Account', true)

WebUI.setText(findTestObject('New Subscription/Page_Add New Subscription - PraisindoSIARUI/input__product'), ParamProd)

WebUI.sendKeys(findTestObject('New Subscription/Page_Add New Subscription - PraisindoSIARUI/input__product'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/label_Gross'))

WebUI.click(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/label_Nett'))

WebUI.click(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/input__NetAmount'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Subscription - PraisindoSIARUI/input__NetAmount'), ParamAmount)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_Select Fee SUB 1'), 
    '3854', true)

WebUI.click(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/input_Fee ()_FeePercentage'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Subscription - PraisindoSIARUI/input_Fee ()_FeePercentage'), 
    '4')

WebUI.click(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/input_Additional Charges_Charges'))

WebUI.setText(findTestObject('New Subscription/Page_Add New Subscription - PraisindoSIARUI/input_Additional Charges_Charges'), 
    '250000')

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_Select Method                       _3f9a88'), 
    'TRS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_Select Method                       _3f9a88'), 
    'RTG', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_Select Method                       _3f9a88'), 
    'N/A', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_Select Method                       _3f9a88'), 
    'CAS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_Select Method                       _3f9a88'), 
    'DIV', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_Select Method                       _3f9a88'), 
    'CLR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_Select Method                       _3f9a88'), 
    'TRS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_ANDARU - BANK CENTRAL ASIA Kantor Pu_394f5d'), 
    '90902121', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_ANDARU - BANK CENTRAL ASIA Kantor Pu_394f5d'), 
    '1201314', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_ANDARU - BANK CENTRAL ASIA Kantor Pu_394f5d'), 
    '3371658978', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_ANDARU - BANK CENTRAL ASIA Kantor Pu_394f5d'), 
    '7667381', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_ANDARU - BANK CENTRAL ASIA Kantor Pu_394f5d'), 
    '8748758475841', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/select_ADEN - Standard Chartered Bank Stand_f7fd79'), 
    '1438', true)

WebUI.setText(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/textarea_Remark_Remarks'), 
    'Testing Checklist with Katalon')

WebUI.click(findTestObject('Object Repository/New Subscription/Page_Add New Subscription - PraisindoSIARUI/button_Save to Draft'))

