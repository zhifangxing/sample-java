package xiaqiu;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import macaca.client.MacacaClient;
import macaca.client.commands.Element;
import macaca.client.common.ElementSelector;
import macaca.client.common.GetElementWay;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import static org.hamcrest.CoreMatchers.containsString;

public class LaunchXiaqiuTest {
	
    MacacaClient driver = new MacacaClient();

    @BeforeClass 
    public void setUpBeforeClass() throws Exception {
        /*
           Desired Capabilities are used to configure webdriver when initiating the session.
           Document URL: https://macacajs.github.io/desired-caps.html
         */
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
    public void tearDownAfterClass() throws Exception {
        driver.quit();
    }

    @Test 
    public void test_case_1() throws Exception {
        // set screenshot save path
//        File directory = new File("/Users/zhifang.xing/WorkSpace/sample-java");

        JSONObject dragJson = JSONObject.parseObject("{fromX:700,fromY:300,toX:10,toY:100,steps:5}");
        String startAction = "drag";
        driver.touch(startAction, dragJson)
        .sleep(1000)
        .touch(startAction, dragJson)
        .sleep(1000)
        .elementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]")
        .click();
        
//       
       
    }
    
    @Test
    public void test_case_2() throws Exception{
    	
//    	 登录页面
         System.err.println("------------#1 login test-------------------");
         ElementSelector selector = driver.elementsByClassName("android.widget.EditText");
         //input username and pwd
         selector.getIndex(0).sendKeys("15811495608");
         selector.getIndex(1).sendKeys("111111");
         //click login button
         driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]").click();
         driver.sleep(5000);
         
         
         
         System.err.println("------------#2 indexPage test-------------------");
//       switchToWebView(driver).elementByClassName("android.view.View");//转向H5页面该句不好使
       selector = driver.elementsByClassName("android.widget.Button");
       Element borrowBtn = driver.elementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[15]/android.view.View[1]/android.widget.Button[1]");
       if (borrowBtn.isDisplayed()) {
     	  borrowBtn.click();
       }else {
     	  driver.sleep(5000);
       }
    	
    }
    
    
    

    // switch to the context of the last pushed webview
    public MacacaClient switchToWebView(MacacaClient driver) throws Exception {
        JSONArray contexts = driver.contexts();
        return driver.context(contexts.get(contexts.size() - 1).toString());
    }

    // switch to the context of native
    public MacacaClient switchToNative(MacacaClient driver) throws Exception {
        JSONArray contexts = driver.contexts();
        return driver.context(contexts.get(0).toString());
    }

   
}
