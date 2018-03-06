package com.tact.test;

import com.paypal.selion.annotations.MobileTest;
import com.paypal.selion.internal.platform.grid.WebDriverPlatform;
import com.paypal.selion.platform.grid.Grid;
import com.paypal.selion.testcomponents.mobile.Home.TactWelcomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


//mvn clean test -DsuiteXmlFile=src/test/resources/SeLion_Demo_iOS.xml
public class IOSDemoTest {
    private TactWelcomePage tactWelcomePage;

    @BeforeClass
    private void initialize() {
        tactWelcomePage = new TactWelcomePage(WebDriverPlatform.IOS);
    }

    @Test(singleThreaded = true)
    @MobileTest (appPath = "/Users/sakie/workspace/testingEnv/SeLion_Demo-1/Applications/Tact.app",
            device = "iphone:11.2",
            deviceType = "iPhone Simulator",
            mobileNodeType = "appium",
            additionalCapabilities = {
//                "platformName:iOS",
//                "bundleId:com.tactile.Tact-Dev",
                "deviceName:iPhone 8 Plus",
                //only need the device name, then the selion can identify the device,
//                "udid:7846EF2B-7588-47FA-BE12-FA8008E21902",
                "noReset:true","unicodeKeyboard:true","resetKeyboard:true"})
//    appPath=/Users/sakie/workspace/testingEnv/SeLion_Demo-1/Applications/Tact.app
//            mobileDevice=IOS:11.2
//    mobileDeviceType=IOS Simulator
    private void signInTest() throws InterruptedException {

        Thread.sleep(20*1000);
//        WebElement lego = Grid.driver().findElement(By.name("Log In"));
//        Grid.driver().findElement(By.xpath("//XCUIElementTypeButton[@name=\"Log In\"]")).click();
//        Thread.sleep(5*1000);

//        UiObject yearPickerObject = new UiObject("android:id/month_text_view");
//        UiObject AcceptButtonObject = new UiObject("serviceagreement_accept");
//
        System.out.println("before check the visible");
        WebDriverWaitUtils.waitUntilElementIsVisible(tactWelcomePage.getTactImage());
        System.out.println("check the visible is done");

        Thread.sleep(10*1000);
//
//        UIAButton loginBtn = (UIAButton) tactWelcomePage.getLoginButton();
//        loginBtn.tap();
    }



}
