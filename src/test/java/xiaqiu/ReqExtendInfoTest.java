package xiaqiu;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;

import macaca.client.MacacaClient;
import macaca.client.common.ElementSelector;

public class ReqExtendInfoTest {
	
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
	public void test() throws Exception{
		

//		进入完善信息页面
        System.err.println("------------#4 reqExtendInfo test-------------------");
//        定位到住房状况
        ElementSelector selector = driver.elementsByClassName("android.view.View");
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]")
       .click();
//       选择租房状况，租房
       selector = driver.elementsByClassName("android.widget.TextView");
       driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
       .click();
//       定位到住宅地址
       selector = driver.elementsByClassName("android.view.view");
       driver.elementByXPath(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[3]")
       .click();
//       选择城市北京  北京市  朝阳
       selector = driver.elementsByClassName("android.widget.TextView");
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.TextView[3]")
       .click();
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.TextView[1]")
       .click();
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.TextView[2]")
       .click();
//      定位住宅的详细地址
       selector = driver.elementsByClassName("android.widget.EditText"); 
       String houseAddress = "八里庄北里1号院";
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.EditText[1]")
       .sendKeys(houseAddress);
//       定位职业信息--单位名称
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[5]/android.widget.EditText[1]")
       .sendKeys("百融金服");
//       定位到职业信息--单位地址
       selector = driver.elementsByClassName("android.view.view");
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[6]")
       .click();
//       选择单位地址：北京 北京市 朝阳区
       selector = driver.elementsByClassName("android.widget.TextView");
       driver.elementByXPath(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.TextView[3]")
       .click();
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.TextView[1]")
       .click();
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.TextView[2]")
       .click();
       selector = driver.elementsByClassName("android.widget.EditText"); 
       String companyAddress = "中关村南三街";
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.EditText[2]")
       .sendKeys(companyAddress);
//       定位到单位电话
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[7]/android.widget.EditText[1]")
       .sendKeys("010");
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[7]/android.widget.EditText[2]")
       .sendKeys("12345678");
//       定位到紧急联系人
       String name = "小丁";
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[9]/android.widget.EditText[1]")
       .sendKeys(name);
       String namePhoneNum = "13501322044";
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[10]/android.widget.EditText[1]")
       .sendKeys(namePhoneNum);
//       定位到关系
       selector = driver.elementsByClassName("android.view.view");
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[11]")
       .click();
//       选择兄弟姐妹
       selector = driver.elementsByClassName("android.widget.TextView");
       driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]")
       .click();
//       下一步按钮高亮
       selector = driver.elementsByClassName("android.widget.Button");
       driver.elementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[15]/android.widget.Button[1]")
       .click();
       
       
	}

}
