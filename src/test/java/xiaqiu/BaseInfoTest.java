package xiaqiu;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;

import macaca.client.MacacaClient;
import macaca.client.common.ElementSelector;

public class BaseInfoTest {
	
	static MacacaClient driver = new MacacaClient();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		JSONObject porps = new JSONObject();
        porps.put("platformName", "android");
        porps.put("app", "/Users/zhifang.xing/WorkSpace/Microcredit/app/xiaqiu_v1.4.6.apk");
        porps.put("reuse", 1);
//        porps.put("deviceName","L7T4O7UW99999999");
        porps.put("autoAcceptAlerts", true);
//        porps.put("browserName", "Chrome");
        JSONObject desiredCapabilities = new JSONObject();
        desiredCapabilities.put("desiredCapabilities", porps);
        driver.initDriver(desiredCapabilities);
        
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		
		System.err.println("LaunchXiaqiuTest pass");
		System.err.println("------------#3 basicInfo test-------------------");
	        
	        driver.sleep(5000);
//	        定位到真实姓名输入框
	        ElementSelector selector = driver.elementsByClassName("android.widget.EditText");
	        String username = "邢志芳";
	        driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.widget.EditText[1]")
	        .sendKeys(username);
//	        定位到身份证号输入框
	        String pwd = "411122198708054643";
	        driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[1]")
	        .sendKeys(pwd);
	        driver.sleep(3000);
//	        定位到身份证件
	        selector = driver.elementsByClassName("android.view.View");
	        driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[5]/android.view.View[2]")
	        .click();
//	        System.err.println("------------进入身份证上传页面-------------------");
//	        selector = driver.elementsByClassName("android.widget.ImageView");
//	        Element textFront = driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]");
//	        if (textFront.isDisplayed()) {
//	        	System.err.println("------------确认已经进入身份证上传页面-------------------");
//			} else {
//				driver.sleep(3000);
//			}
//	        System.err.println("------------上传身份证正面照片-------------------");
//	        driver.sleep(3000);
//	        selector = driver.elementsByClassName("android.widget.ImageView");
//	        定位到上传身份证正面框处并点击出现选择照片方式：拍照、相册、取消三种
//	        for (int i = 0; i < selector.size()-1; i++) {
//				System.err.println(selector.getIndex(i));
//			}
//	        selector.getIndex(0).click();//返回了上个页面，推测是左上角按钮
//	        selector.getIndex(1).click();//点击了正面照片框
//	        driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]").click();
//	      选择相册
//	        selector = driver.elementsByClassName("android.widget.LinearLayout");
//	        for (int i = 0; i < selector.size()-1; i++) {
//	        	System.err.println(selector.getIndex(i));
//			}
//	        selector.getIndex(2).click();
//	        driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]").click();
	        
	        
//	        进入手机相册
//	        selector = driver.elementsByClassName("android.view.View");
//	        System.err.println(selector.size());
//	        selector.getIndex(1).click();
	        
//	        定位到活体验证字段
	        driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[6]/android.view.View[2]")
	        .click();
//	        下一步按钮高亮，定位并点击进入下个页面
	       selector =  driver.elementsByClassName("android.widget.Button");
	       driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[10]/android.widget.Button[1]")
	       .click();
		
		
		
		
		
		
	}

}
