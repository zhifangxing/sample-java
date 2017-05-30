package xiaqiu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import macaca.client.MacacaClient;
import macaca.client.commands.Element;
import macaca.client.common.ElementSelector;

public class BankInfoTest{
	
	LaunchXiaqiuTest launchTest = new LaunchXiaqiuTest();
	
	MacacaClient driver = new MacacaClient();
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_case_3() throws Exception {
//		launchTest.test_case_1();
		
        
//		进入银行卡信息页面
        System.err.println("------------#4 bankinfo test-------------------");
        ElementSelector selector = driver.elementsByClassName("android.view.View");
        driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[4]")
        .click();
        
//        出现银行选择框
        selector = driver.elementsByClassName("android.widget.LinearLayout");
//        选择民生银行
        driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[6]")
        .click();
//        准备输入银行卡号
        selector = driver.elementsByClassName("android.widget.EditText");
        String bankNum = "6226220128734836"; 
        driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[5]/android.widget.EditText[1]")
        .sendKeys(bankNum);
//        准备输入手机号
        String phoneNum = "15811495608";
        driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[6]/android.widget.EditText[1]")
		.sendKeys(phoneNum);
//        上传银行卡照片
        selector = driver.elementsByClassName("android.view.View");
        driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[8]")
        .click();
//        下一步按钮高亮，点击进入完善信息页面
        selector = driver.elementsByClassName("android.widget.Button");
        driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[13]/")
        .click();
        
        
        
        
        
        
        
        
	}

}
